package lang.visitor;

import lang.ast.*;
import lang.type.*;

import java.util.*;

public class CheckTypeVisitor extends Visitor {
    private STyInt tyint = STyInt.newSTyInt();
    private STyFloat tyfloat = STyFloat.newSTyFloat();
    private STyBool tybool = STyBool.newSTyBool();
    private STyChar tychar = STyChar.newSTyChar();
    private STyErr tyerr = STyErr.newSTyErr();


    private ArrayList<String> logError;

    private HashMap<String, SType> datas;

    private TyEnv<LocalEnv<SType>> env;
    private LocalEnv<SType> temp;


    private Stack<SType> stk;
    private boolean retChk;

    public CheckTypeVisitor(){
        stk = new Stack<SType>();
        env = new TyEnv<LocalEnv<SType>>();
        datas = new HashMap<String, SType>();
        logError = new ArrayList<String>();
    }

    public int getNumErrors(){ return logError.size(); }

    public void printErrors(){
        for(String s : logError){
            System.out.println(s);
        }
    }

    @Override
    public void visit(Prog p){
        // todas as definições de data devem ser bem tipadas
        for(Data d : p.getDatas()){
            STyData td;
            HashMap<String, SType> dataTypes = new HashMap<>();// = new SType[d.decls.size()];
            for(int i = 0; i < d.decls.size(); i++ ){
                d.decls.get(i).type.accept(this);
                dataTypes.put(d.decls.get(i).id, stk.pop());
                //dataTypes[i] = stk.pop();
            }
            td = new STyData(dataTypes);
            /*TODO: oq fazer????*/
            datas.put(d.id, td);
        }

        // todas as definições de função devem ser bem tipadas
        for(Func f : p.getFuncs()){
            String id = f.funcId;
            STyFunc ty;
            SType[] paramTypes = new SType[f.paramList.size()];
            for(int i = 0; i < f.paramList.size(); i++ ){
                f.paramList.get(i).paramType.accept(this);
                paramTypes[i] = stk.pop();
                id += paramTypes[i].toString();
            }
            SType[] returnTypes = new SType[f.returnTypeList.size()];
            for(int i = 0; i < f.returnTypeList.size(); i++ ){
                f.returnTypeList.get(i).accept(this);
                returnTypes[i] = stk.pop();
            }
            ty = new STyFunc(paramTypes, returnTypes);
            f.funcIdTypes = id;
            env.set(id, new LocalEnv<SType>(f.funcId, ty));
        }


        for(Func f : p.getFuncs()){
            f.accept(this);
        }

        if(getNumErrors() > 0) {
            printErrors();
            throw new RuntimeException("Type checking failed.");
        }
    }

    @Override
    public void visit(Data d) {} // não é necessário. A verificação ocorre em Prog

    @Override
    public void visit(Param p) {} // não é necessário. A verificação ocorre nas chamadas de função

    @Override
    public void visit(Func f) {
        retChk = false;

        // verifica os parâmetros da função para encontrá-la no ambiente
        String id = f.funcId;
        SType[] paramTypes = new SType[f.paramList.size()];
        for(int i = 0; i < f.paramList.size(); i++ ){
            f.paramList.get(i).paramType.accept(this);
            paramTypes[i] = stk.pop();
            id += paramTypes[i].toString();
        }

        // encontra a função no ambiente e determina os tipos dos seus parâmetros
        temp = env.get(id);
        for(int i = 0; i < f.paramList.size(); i++ ){
            temp.set(f.paramList.get(i).paramId, paramTypes[i]);
        }


        // para ser bem tipada, todos os comandos devem ser bem tipados
        for(Cmd c : f.functionCmds){
            c.accept(this);
        }

        //Verifica se função retorna algum valor e se procedimentos NÃO retornam
        if (!retChk && f.returnTypeList.size() > 0) {
            logError.add(f.getLine() + ", " + f.getColumn() + ": Function " + f.funcId + " must return a value.");
        }
        if (retChk && f.returnTypeList.isEmpty()) {
            logError.add(f.getLine() + ", " + f.getColumn() + ": Function " + f.funcId + " must NOT return a value.");
        }
    }

    @Override
    public void visit(TypeArray t) {
        // adiciona um tipo array à pilha de tipos
        t.getTyArg().accept(this);
        stk.push(new STyArr(stk.pop()));
    }

    @Override
    public void visit(TypeData t) {
        // adiciona um tipo data à pilha de tipos com dos tipos disponíveis para aquela Data
        STyData test = (STyData) datas.get(t.typeString);
        stk.push(new STyData(test.getTypes()));
    }

    @Override
    public void visit(TypeInt t) {
        stk.push(tyint);
    }

    @Override
    public void visit(TypeFloat t) {
        stk.push(tyfloat);
    }

    @Override
    public void visit(TypeChar t) {
        stk.push(tychar);
    }

    @Override
    public void visit(TypeBool t) {
        stk.push(tybool);
    }

    @Override
    public void visit(CmdList e) {
        for(Cmd c : e.cmdList){
            c.accept(this);
        }
    }

    @Override
    public void visit(CmdIf e) {
        // para ser bem tipado, expressão de teste deve ser booleana
        // e comandos then/else devem ser bem tipados
        // retCheck -> confere se há retorno em ambos os caminhos possíveis

        boolean rt, re;
        re = true;
        e.testExp.accept(this);
        if(stk.pop().match(tybool)){
            retChk = false;
            e.thenNode.accept(this);
            rt = retChk;
            if(e.elseNode != null){
                retChk = false;
                e.elseNode.accept(this);
                re = retChk;
            }
            retChk = rt && re;
        }else{
            logError.add( e.getLine() + ", " + e.getColumn() + ": IF test expression must be Boolean");
        }
    }

    @Override
    public void visit(CmdIterate e) {
        // expressão deve ser inteiro
        // comando deve ser bem tipado
        e.testExp.accept(this);
        if(stk.pop().match(tyint)){
            e.itrCmd.accept(this);
        }else{
            logError.add( e.getLine() + ", " + e.getColumn() + ": ITERATE test expression must be Integer");
        }
    }

    @Override
    public void visit(CmdRead e) {
        // read limitado a valores INTEIROS
        // define a variavel inteira caso ela não exista ou
        // confere se o tipo inteiro casa com o endereço especificado

        //se não esta declarado ainda e é uma variavel normal
        if (temp.get(e.lval.id) == null && (e.lval.selectors.size() == 0)) {
            // resolve o tipo da expressao e associa à variavel
            temp.set(e.lval.id, tyint);
        } else { // se já está declarada ou se é algum outro tipo
            e.lval.accept(this); // tipo da variavel

            if (!stk.pop().match(tyint)) {
                logError.add(e.getLine() + ", " + e.getColumn() + ": Atribuição ilegal para a variável " + e.lval.id);
            }
        }
    }

    @Override
    public void visit(CmdPrint e) {
        // a expressão print é bem tipada se sua expressão
        // é bem tipada, independente do tipo

        e.printExp.accept(this);
        stk.pop();
    }

    @Override
    public void visit(CmdReturn e) {
        for(Exp ex : e.returnExp){
            ex.accept(this);
        }

        if (temp.getFuncType() instanceof STyFunc) {
            SType[] t = ((STyFunc) temp.getFuncType()).getTypesReturns();
            for(int i = e.returnExp.size()-1; i >=0 ; i--){
                if(!t[i].match(stk.pop())){
                    logError.add(e.getLine() + ", " + e.getColumn() + ": Invalid Return Type");
                }
            }
        }
        //TODO: esse else nao faz sentido ???
        /*else {
            stk.pop().match(temp.getFuncType());
        }*/
        retChk = true;
    }

    @Override
    public void visit(CmdAssign e) {

        //se não esta declarado ainda e é uma variavel normal
        if (temp.get(e.getLval().id) == null && (e.getLval().selectors.size() == 0)) {
            // resolve o tipo da expressao e associa à variavel
            e.getValExp().accept(this);
            temp.set(e.getLval().id, stk.pop());
        } else { // se já está declarada ou se é algum outro tipo
            e.getLval().accept(this); // tipo da variavel
            e.getValExp().accept(this); // tipo da expressao
            if (!stk.pop().match(stk.pop())) {
                logError.add(e.getLine() + ", " + e.getColumn() + ": Atribuição ilegal para a variável " + e.getLval().id);
            }
        }
    }

    @Override
    public void visit(CmdFunctionCall e) {
        String id = e.funcId;
        SType[] paramTypes = new SType[e.exps.size()];
        for (int i = 0; i < e.exps.size(); i++) {
            e.exps.get(i).accept(this);
            paramTypes[i] = stk.pop();
            id += paramTypes[i].toString();
        }

        LocalEnv<SType> le = env.get(id);
        if (le != null) {
            e.funcIdTypes = id;
            STyFunc tf = (STyFunc) le.getFuncType();
            if(tf.getTypesReturns().length == e.lvals.size()){
                for(int i = 0; i < e.lvals.size(); i++){

                    LvalueID lv = (LvalueID)e.lvals.get(i);
                    if (temp.get(lv.id) == null && lv.selectors.size() == 0) {
                        // se não esta declarado ainda, adiciona o tipo do retorno
                        temp.set(lv.id, tf.getTypesReturns()[i]);
                    } else { // se já está declarada ou se é algum outro tipo
                        lv.accept(this); // tipo da variavel
                        //e..accept(this); // tipo da expressao

                        if (!stk.pop().match(tf.getTypesReturns()[i])) {
                            logError.add(e.getLine() + ", " + e.getColumn() + ": Illegal Variable attribution " + lv.id);
                        }
                    }
                }
            } else {
                logError.add(e.getLine() + ", " + e.getColumn() + ": Invalid number of return addresses: " + e.funcId);
                stk.push(tyerr);
            }

        } else {
            logError.add(e.getLine() + ", " + e.getColumn() + ": Invalid function call: " + e.funcId);
            stk.push(tyerr);
        }
    }

    private void checkArithmeticType(SType left, SType right, int line, int col, Character op) {
        String e = line + ", " + col + ": Operator " + op + " does not apply to types " + left.toString() + " and " + right.toString();
        switch (op){
            case '+':
            case '-':
            case '/':
            case '*':
                if( right.match(tyint) && left.match(tyint)){
                    stk.push(tyint);
                } else if (right.match(tyfloat) && left.match(tyfloat)){
                    stk.push(tyfloat);
                }else{
                    stk.push(tyerr);
                    logError.add(e);
                }
                break;
            case '%':
                if( right.match(tyint) && left.match(tyint)) {
                    stk.push(tyint);
                } else {
                    stk.push(tyerr);
                    logError.add(e);
                }
                break;
            default:
                stk.push(tyerr);
                logError.add(e);
                break;
        }
    }

    private void checkRelationalType(SType left, SType right, int line, int col, String op) {
        /*
        || (right.match(tyfloat) && left.match(tyfloat))
        || (right.match(tychar) && left.match(tychar))
        || (right.match(tychar) && left.match(tychar))
        || (right.match(tybool) && left.match(tybool)))
        */
        String e = line + ", " + col + ": Operator " + op + " does not apply to types " + left.toString() + " and " + right.toString();
        switch (op){
            case "==":
            case "!=":
                /* TODO: CONFERIR O MATCH */
                if( right.match(left) ) {
                    stk.push(tybool);
                }else{
                    stk.push(tyerr);
                    logError.add(e);
                }
                break;
            case "<":
                if( (right.match(tyint) && left.match(tyint)) ||(right.match(tyfloat) && left.match(tyfloat) ) ) {
                    stk.push(tybool);
                } else {
                    stk.push(tyerr);
                    logError.add(e);
                }
                break;
            default:
                stk.push(tyerr);
                logError.add(e);
                break;
        }
    }

    private void checkUnaryType(SType right, int line, int col, Character op) {
        String e = line + ", " + col + ": Operator " + op + " does not apply to type " + right.toString();
        switch (op){
            case '!':
                /* TODO: CONFERIR O MATCH */
                if( right.match(tybool) ) {
                    stk.push(tybool);
                }else{
                    stk.push(tyerr);
                    logError.add(e);
                }
                break;
            case '-':
                if( right.match(tyint) || right.match(tyfloat) ) {
                    stk.push(right);
                } else {
                    stk.push(tyerr);
                    logError.add(e);
                }
                break;
            default:
                stk.push(tyerr);
                logError.add(e);
                break;
        }
    }

    @Override
    public void visit(OpAnd e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
        SType tyr = stk.pop();
        SType tyl = stk.pop();
        if( tyr.match(tybool) &&  tyl.match(tybool)) {
            stk.push(tybool);
        }else{
            stk.push(tyerr);
            logError.add(e.getLine() + ", " + e.getColumn() + ": Operator && does not apply to types " + tyl.toString() + " and " + tyr.toString());
        }
    }

    @Override
    public void visit(OpLess e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
        SType tyr = stk.pop();
        SType tyl = stk.pop();
        checkRelationalType(tyr, tyl, e.getLine(), e.getColumn(),"<");
    }

    @Override
    public void visit(OpEq e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
        SType tyr = stk.pop();
        SType tyl = stk.pop();
        checkRelationalType(tyr, tyl, e.getLine(), e.getColumn(),"==");
    }

    @Override
    public void visit(OpNotEq e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
        SType tyr = stk.pop();
        SType tyl = stk.pop();
        checkRelationalType(tyr, tyl, e.getLine(), e.getColumn(),"!=");
    }

    @Override
    public void visit(OpSum e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
        SType tyr = stk.pop();
        SType tyl = stk.pop();
        checkArithmeticType(tyr, tyl, e.getLine(), e.getColumn(),'+');
    }

    @Override
    public void visit(OpSub e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
        SType tyr = stk.pop();
        SType tyl = stk.pop();
        checkArithmeticType(tyr, tyl, e.getLine(), e.getColumn(),'-');
    }

    @Override
    public void visit(OpMul e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
        SType tyr = stk.pop();
        SType tyl = stk.pop();
        checkArithmeticType(tyr, tyl, e.getLine(), e.getColumn(),'*');
    }

    @Override
    public void visit(OpDiv e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
        SType tyr = stk.pop();
        SType tyl = stk.pop();
        checkArithmeticType(tyr, tyl, e.getLine(), e.getColumn(),'/');
    }

    @Override
    public void visit(OpMod e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
        SType tyr = stk.pop();
        SType tyl = stk.pop();
        checkArithmeticType(tyr, tyl, e.getLine(), e.getColumn(),'%');
    }

    @Override
    public void visit(OpNot e) {
        e.getRight().accept(this);
        SType tyr = stk.pop();
        checkUnaryType(tyr, e.getLine(), e.getColumn(),'!');
    }

    @Override
    public void visit(OpMin e) {
        e.getRight().accept(this);
        SType tyr = stk.pop();
        checkUnaryType(tyr, e.getLine(), e.getColumn(),'-');
    }

    @Override
    public void visit(ExpNew e) {

        //SType baseType = stk.pop();
        if(e.newExp != null){ //Array
            e.newExp.accept(this);
            if(!stk.pop().match(tyint)){
                logError.add(e.getLine() + ", " + e.getColumn() + ": Index must be integer.");
            }
        }
        e.newType.accept(this);

    }

    @Override
    public void visit(ExpFunctionCall e) {

        String id = e.funcId;
        SType[] paramTypes = new SType[e.argExps.size()];
        for (int i = 0; i < e.argExps.size(); i++) {
            e.argExps.get(i).accept(this);
            paramTypes[i] = stk.pop();
            id += paramTypes[i].toString();
        }

        LocalEnv<SType> le = env.get(id);
        if (le != null) {
            e.funcIdTypes = id;
            STyFunc tf = (STyFunc) le.getFuncType();
            e.selectorExp.accept(this);
            // Considerando que o valor da expressão sempre é um inteiro
            int index = ((LiteralInt)e.selectorExp).getValue();
            stk.push(tf.getTypesReturns()[index]);

        } else {
            logError.add(e.getLine() + ", " + e.getColumn() + ": Invalid function call: " + e.funcId);
            stk.push(tyerr);
        }


    }

    @Override
    public void visit(LvalueID e) {
        SType t = temp.get(e.id);
        if (t != null) {
            for (Lvalue l : e.selectors) {
                if (t instanceof STyArr) {
                    t = ((STyArr) t).getArg();
                } else if (t instanceof STyData) {
                    String id = ((LvalueSelect) l).selectorID;
                    t = ((STyData) t).getTypes().get(id);
                } else {
                    t = tyerr;
                }
            }
            if (t == tyerr) {
                logError.add(e.getLine() + ", " + e.getColumn() + ": Incompatible types " + e.id);
            }
            stk.push(t);
        } else {
            logError.add(e.getLine() + ", " + e.getColumn() + ": Undeclared variable " + e.id);
            stk.push(tyerr);
        }
    }

    @Override
    public void visit(LvalueSelect e) {

    }

    @Override
    public void visit(LvalueArray e) {

    }

    @Override
    public void visit(LiteralBool e) {
        stk.push(tybool);
    }

    @Override
    public void visit(LiteralChar e) {
        stk.push(tychar);
    }

    @Override
    public void visit(LiteralFloat e) {
        stk.push(tyfloat);
    }

    @Override
    public void visit(LiteralInt e) {
        stk.push(tyint);
    }

    @Override
    public void visit(LiteralNull e) {
        stk.push(null);
    }
}
