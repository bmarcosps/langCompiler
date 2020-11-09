package lang.parser;

import lang.ast.*;

import java.util.*;


public class  InterpretAstVisitor extends Visitor {

    private Stack<HashMap<String,Object>> env;
    private HashMap<String,Data> datas;
    private HashMap<String,Func> funcs;
    private Stack<Object> operands;
    private Stack<Type> stk;
    private boolean retMode, debug;

    public InterpretAstVisitor() {
        env = new Stack<HashMap<String,Object>>();
        env.push(new HashMap<String,Object>());
        datas = new  HashMap<String,Data>();
        funcs = new  HashMap<String,Func>();
        operands = new Stack<Object>();
        stk = new Stack<Type>();
        retMode = false;
        debug = false;
    }

    public InterpretAstVisitor(boolean debug){
        this();
        this.debug = debug;
    }

    @Override
    public void visit(Prog p) {
        Node main = null;

        for(Data d: p.getDatas()){
           d.accept(this);
        }

        for(Func f : p.getFuncs()){
            funcs.put(f.funcId,f);
            if(f.funcId.equals("main")){
                main = f;
            }
        }
        if(main == null){
            throw new RuntimeException( "Não há uma função chamada main ! abortando ! ");
        }
        main.accept(this);

    }

    @Override
    public void visit(Data d) {
        datas.put(d.id,d);
    }

    @Override
    public void visit(Param p) {
        env.peek().put(p.paramId, operands.pop());
    }

    @Override
    public void visit(Func f) {
        HashMap<String,Object> localEnv = new HashMap<String,Object>();
        env.push(localEnv);

        for(int  i = f.paramList.size()-1; i >= 0; i--){
            f.paramList.get(i).accept(this);
        }

        for(Cmd c : f.functionCmds){
            c.accept(this);
            if(retMode){ break; }
        }

        if(debug && f.funcId.equals("main") ){
            Object[] x = env.peek().keySet().toArray();
            System.out.println("-------------- Memoria ----------------");
            for(int i =0; i < x.length; i++){
                System.out.println( ((String)x[i]) + " : " +  env.peek().get(x[i]).toString() );
            }
        }
        env.pop();
        retMode= false;
    }


    @Override
    public void visit(CmdList e) {
        if(retMode){ return;}
        try{
            for(Cmd c : e.cmdList){
                c.accept(this);
                /* TODO: verificar retMode */
                if(retMode){ return;}
            }
        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(CmdIf e) {
        try{
            e.testExp.accept(this);
            if((Boolean)operands.pop()){
                e.thenNode.accept(this);
            }else if(e.elseNode != null){
                e.elseNode.accept(this);
            }
        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(CmdIterate e) {
        try{
            e.testExp.accept(this);
            while( (Boolean)operands.pop()){
                e.itrCmd.accept(this);
                e.testExp.accept(this);
            }
        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(CmdRead e) {
        try{
            Scanner scan = new Scanner(System.in);
            //LvalueTest
            /* TODO: get lvalue type ? */
            Object userInput = scan.nextLine();

            /* Código idêntico ao assign */
            LvalueID v = e.lval;
            if(!v.selectors.isEmpty()){
                Object arr = (Object)env.peek().get(v.id);

                for(int k = 0; k < v.selectors.size()-1; k++ ){
                    v.selectors.get(k).accept(this);
                    Object select = operands.pop();
                    if(v.selectors.get(k) instanceof LvalueSelect){
                        arr = ((HashMap<String, Object>) arr).get( select );
                    } else {
                        arr = ((ArrayList) arr).get( (Integer) select );
                    }

                }
                v.selectors.get(v.selectors.size()-1).accept(this);
                Object select = operands.pop();

                if(v.selectors.get(v.selectors.size()-1) instanceof LvalueSelect){
                    ((HashMap<String, Object>) arr).put((String) select, userInput ) ;
                } else {
                    ((ArrayList) arr).set( (Integer) select, userInput);
                }

            } else {
                env.peek().put(e.lval.id, userInput);
            }

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(CmdPrint e) {
        try{
            e.printExp.accept(this);
            Object o = operands.pop();
            System.out.println(o);
        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(CmdReturn e) {
        for(Exp ex : e.returnExp){
            ex.accept(this);
        }
        retMode = true;
    }

    @Override
    public void visit(CmdAssign e) {
        try{
            LvalueID v = e.getLval();
            e.getValExp().accept(this);
            Object val = operands.pop();

            if(!v.selectors.isEmpty()){
                Object arr = (Object)env.peek().get(v.id);

                for(int k = 0; k < v.selectors.size()-1; k++ ){
                    v.selectors.get(k).accept(this);
                    Object select = operands.pop();
                    if(v.selectors.get(k) instanceof LvalueSelect){
                        arr = ((HashMap<String, Object>) arr).get( select );
                    } else {
                        arr = ((ArrayList) arr).get( (Integer) select );
                    }

                }
                v.selectors.get(v.selectors.size()-1).accept(this);
                Object select = operands.pop();

                if(v.selectors.get(v.selectors.size()-1) instanceof LvalueSelect){
                    ((HashMap<String, Object>) arr).put((String) select, val ) ;
                } else {
                    ((ArrayList) arr).set( (Integer) select, val );
                }

            } else {
                env.peek().put(e.getLval().id, val);
            }

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }

    }

    @Override
    public void visit(CmdFunctionCall e) {
        try{
            Func f = funcs.get(e.funcId);
            if(f != null){
                // Coloca parâmetros nos operandos
                for(Exp exp : e.exps){
                    exp.accept(this);
                }

                // Executa a função
                f.accept(this);

                // Trata os retornos, alocando nos endereços corretos
                for(int i = e.lvals.size()-1; i >= 0; i--){
                    Object val = operands.pop();
                    LvalueID v = (LvalueID) e.lvals.get(i);
                    /* Código idêntico ao assign */
                    if(!v.selectors.isEmpty()){
                        Object arr = (Object)env.peek().get(v.id);

                        for(int k = 0; k < v.selectors.size()-1; k++ ){
                            v.selectors.get(k).accept(this);
                            Object select = operands.pop();
                            if(v.selectors.get(k) instanceof LvalueSelect){
                                arr = ((HashMap<String, Object>) arr).get( select );
                            } else {
                                arr = ((ArrayList) arr).get( (Integer) select );
                            }
                        }
                        v.selectors.get(v.selectors.size()-1).accept(this);
                        Object select = operands.pop();

                        if(v.selectors.get(v.selectors.size()-1) instanceof LvalueSelect){
                            ((HashMap<String, Object>) arr).put((String) select, val ) ;
                        } else {
                            ((ArrayList) arr).set( (Integer) select, val );
                        }

                    } else {
                        env.peek().put(v.id, val);
                    }
                }

            }else{
                throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") Função não definida " +  e.funcId);
            }

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    private void checkArithmeticType(Object left, Object right, Character op) throws Exception {
        Object leftClass = left.getClass();
        Object rightClass = right.getClass();
        switch (op){
            case '+':
                if( leftClass == Integer.class ) {
                    if(rightClass == Integer.class){
                        operands.push((Integer)left + (Integer)right);
                    } else if (rightClass == Float.class){
                        operands.push((Integer)left + (Float)right);
                    } else {
                        throw new ArithmeticException("Tipos de dado inválidos.");
                    }
                }else if(leftClass == Float.class){
                    if(rightClass == Integer.class){
                        operands.push((Float)left + (Integer)right);
                    } else if (rightClass == Float.class){
                        operands.push((Float)left + (Float) right);
                    } else{
                        throw new ArithmeticException("Tipos de dado inválidos.");
                    }
                }else{
                    throw new ArithmeticException("Tipos de dado inválidos.");
                }
                break;
            case '-':
                if( leftClass == Integer.class ) {
                    if(rightClass == Integer.class){
                        operands.push((Integer)left - (Integer)right);
                    } else if (rightClass == Float.class){
                        operands.push((Integer)left - (Float)right);
                    } else {
                        throw new ArithmeticException("Tipos de dado inválidos.");
                    }
                }else if(leftClass == Float.class){
                    if(rightClass == Integer.class){
                        operands.push((Float)left - (Integer)right);
                    } else if (rightClass == Float.class){
                        operands.push((Float)left - (Float) right);
                    } else{
                        throw new ArithmeticException("Tipos de dado inválidos.");
                    }
                }else{
                    throw new ArithmeticException("Tipos de dado inválidos.");
                }
                break;
            case '*':
                if( leftClass == Integer.class ) {
                    if(rightClass == Integer.class){
                        operands.push((Integer)left * (Integer)right);
                    } else if (rightClass == Float.class){
                        operands.push((Integer)left * (Float)right);
                    } else {
                        throw new ArithmeticException("Tipos de dado inválidos.");
                    }
                }else if(leftClass == Float.class){
                    if(rightClass == Integer.class){
                        operands.push((Float)left * (Integer)right);
                    } else if (rightClass == Float.class){
                        operands.push((Float)left * (Float) right);
                    } else{
                        throw new ArithmeticException("Tipos de dado inválidos.");
                    }
                }else{
                    throw new ArithmeticException("Tipos de dado inválidos.");
                }
                break;

            case '/':
                if( leftClass == Integer.class ) {
                    if(rightClass == Integer.class){
                        operands.push((Integer)left / (Integer)right);
                    } else if (rightClass == Float.class){
                        operands.push((Integer)left / (Float)right);
                    } else {
                        throw new ArithmeticException("Tipos de dado inválidos.");
                    }
                }else if(leftClass == Float.class){
                    if(rightClass == Integer.class){
                        operands.push((Float)left / (Integer)right);
                    } else if (rightClass == Float.class){
                        operands.push((Float)left / (Float) right);
                    } else{
                        throw new ArithmeticException("Tipos de dado inválidos.");
                    }
                }else{
                    throw new ArithmeticException("Tipos de dado inválidos.");
                }
                break;
            case '<':
                if( leftClass == Integer.class ) {
                    if(rightClass == Integer.class){
                        operands.push((Integer)left < (Integer)right);
                    } else if (rightClass == Float.class){
                        operands.push((Integer)left < (Float)right);
                    } else {
                        throw new ArithmeticException("Tipos de dado inválidos.");
                    }
                }else if(leftClass == Float.class){
                    if(rightClass == Integer.class){
                        operands.push((Float)left < (Integer)right);
                    } else if (rightClass == Float.class){
                        operands.push((Float)left < (Float) right);
                    } else{
                        throw new ArithmeticException("Tipos de dado inválidos.");
                    }
                }else{
                    throw new ArithmeticException("Tipos de dado inválidos.");
                }
                break;
        }

    }

    @Override
    public void visit(OpAnd e) {
        try{
            e.getLeft().accept(this);
            e.getRight().accept(this);
            Boolean left, right;

            right = (Boolean) operands.pop();
            left = (Boolean) operands.pop();


            operands.push(left && right);

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(OpLess e) {
        try{
            e.getLeft().accept(this);
            e.getRight().accept(this);
            Object left, right;

            right = operands.pop();
            left = operands.pop();


            checkArithmeticType(left, right, '<');

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(OpEq e) {
        try{
            e.getLeft().accept(this);
            e.getRight().accept(this);

            operands.push(operands.pop().equals(operands.pop()));

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(OpNotEq e) {
        try{
            e.getLeft().accept(this);
            e.getRight().accept(this);

            operands.push(!operands.pop().equals(operands.pop()));

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(OpSum e) {
        try{
            e.getLeft().accept(this);
            e.getRight().accept(this);
            Object left, right;

            right = operands.pop();
            left = operands.pop();
            checkArithmeticType(left, right, '+');

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(OpSub e) {
        try{
            e.getLeft().accept(this);
            e.getRight().accept(this);
            Object left, right;

            right = operands.pop();
            left =  operands.pop();
            checkArithmeticType(left, right, '-');

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(OpMul e) {
        try{
            e.getLeft().accept(this);
            e.getRight().accept(this);
            Object left, right;

            right = operands.pop();
            left = operands.pop();
            checkArithmeticType(left, right, '*');

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(OpDiv e) {
        try{
            e.getLeft().accept(this);
            e.getRight().accept(this);
            Object left, right;

            right = operands.pop();
            left = operands.pop();
            checkArithmeticType(left, right, '/');

        } catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(OpMod e) {
        try{
            e.getLeft().accept(this);
            e.getRight().accept(this);
            Number left, right;

            right = (Number) operands.pop();
            left = (Number) operands.pop();

            operands.push(left.intValue() % right.intValue());

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(OpNot e) {
        try {
            e.getRight().accept(this);
            Boolean right;

            right = (Boolean) operands.pop();
            operands.push( !right);

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(OpMin e) {
        try {
            e.getRight().accept(this);
            Number right;

            right = (Number) operands.pop();
            Object rightClass = right.getClass();
            if( rightClass == Integer.class ) {
                operands.push( - right.intValue());
            }else if(rightClass == Float.class){
                operands.push( - right.floatValue());
            }else{
                throw new ArithmeticException("Tipos de dado inválidos.");
            }

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(ExpNew e) {
        try{

            e.newType.accept(this);
            Type bt = stk.pop();

            Integer size = 0;
            ArrayList val = null;

            if(e.newExp != null){
                e.newExp.accept(this);
                size = (Integer)operands.pop();

                val = new ArrayList(size);
                for(int k = 0; k < size; k++ ) {
                    val.add(null);
                }
                /*
                while (stk.size() != 0){
                    val.add(null);
                    stk.pop();
                }
                */
                operands.push(val);
            } else {
                assert bt instanceof TypeData;
                HashMap<String, Object> x = new HashMap<>();
                Data d = datas.get(((TypeData) bt).typeString);
                for(Decl dec : d.decls){
                    x.put(dec.id, null);
                }
                operands.push(x);
            }
            stk.clear();

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(ExpFunctionCall e) {
        try{
            Func f = funcs.get(e.funcId);
            if(f != null){
                for(Exp exp : e.argExps){
                    exp.accept(this);
                }
                f.accept(this);

                e.selectorExp.accept(this);
                Integer pos = (Integer) operands.pop();
                Object result = null;

                if(pos >= f.returnTypeList.size() || pos < 0)
                    throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") Índice inválido. ");

                for(int  i = f.returnTypeList.size()-1; i >= 0; i--){
                    if(pos == i){
                        result = operands.pop();
                    } else {
                        operands.pop();
                    }
                }
                operands.push(result);
            }else{
                throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") Função não definida " +  e.funcId);
            }

        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    /* TODO check literal boxing */
    @Override
    public void visit(LiteralBool e) {
        try{
            operands.push(  e.getValue() );
        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(LiteralChar e) {
        try{
            operands.push(  e.getValue() );
        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(LiteralFloat e) {
        try{
            operands.push(  e.getValue() );
        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(LiteralInt e) {
        try{
            operands.push(e.getValue());
        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(LiteralNull e) {
        try{
            operands.push(  null );
        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(LvalueID e) {
        try{
            Object r = env.peek().get(e.id);
            if(r != null || env.peek().containsKey(e.id)){
                if(e.selectors.size() != 0){
                    for(Lvalue lv : e.selectors){
                        lv.accept(this);
                        /* TODO ???? */
                        if(lv instanceof LvalueSelect){
                            r = ((HashMap<String,Object>) r).get( (String) operands.pop());
                        } else if(lv instanceof LvalueArray){
                            r = ((ArrayList)r).get((Integer) operands.pop());
                        }
                    }
                    /*
                    for(Expr exp : e.getIdx()){
                        exp.accept(this);
                        r = ((ArrayList)r).get( (Integer)operands.pop());
                    }
                    */
                }
                operands.push(r);
            } else {
                throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") variável não declarada " +e.id);
            }
        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }

    }

    @Override
    public void visit(LvalueSelect e) {
        try{
            operands.push(e.selectorID);
        } catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }
    }

    @Override
    public void visit(LvalueArray e) {
        try{
            Exp ex = e.selectorExp;
            ex.accept(this);
        }catch(Exception x){
            throw new RuntimeException( " (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage() );
        }

    }



    @Override
    public void visit(TypeData t) {
        stk.push(t);
    }

    @Override
    public void visit(TypeArray t) {
        stk.push(t);
    }

    @Override
    public void visit(TypeInt t) {
        stk.push(t);
    }

    @Override
    public void visit(TypeFloat t) {
        stk.push(t);
    }

    @Override
    public void visit(TypeChar t) {
        stk.push(t);
    }

    @Override
    public void visit(TypeBool t) {
        stk.push(t);
    }


}
