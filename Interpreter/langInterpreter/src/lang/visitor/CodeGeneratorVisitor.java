package lang.visitor;

import lang.ast.*;
import lang.type.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;


public class CodeGeneratorVisitor extends Visitor  {
    /*Variável que cria um escopo para cada função definida*/
    private TyEnv<LocalEnv<SType>> env;

    /*Variável auxiliar que salva o escopo local de cada função*/
    private LocalEnv<SType> temp;


    private STGroup groupTemplate;
    private ST type, cmd, expr;
    private List<ST> datas, funcs, params, decls;
    private String fileName;

    public CodeGeneratorVisitor(String outputfile, TyEnv<LocalEnv<SType>> env){
        groupTemplate = new STGroupFile("template/java.stg");
        this.env = env;
        this.fileName = outputfile;
    }


    @Override
    public void visit(Prog p) {
        ST template = groupTemplate.getInstanceOf("program");
        template.add("name", fileName);
        List<Object> t = new ArrayList<>();

        datas = new ArrayList<ST>();
        for(Data d : p.getDatas()) {
            d.accept(this);
        }
        template.add("datas", datas);


        funcs = new ArrayList<ST>();
        for(Func f : p.getFuncs()) {
            f.accept(this);
        }
        template.add("funcs", funcs);

        System.out.println(template.render());
    }

    @Override
    public void visit(Data d) {
        ST aux = groupTemplate.getInstanceOf("data");
        aux.add("name", d.id);
        decls = new ArrayList<ST>();
        for(Decl dec : d.decls){
            dec.accept(this);
        }
        aux.add("decls", decls);
        datas.add(aux);
    }

    @Override
    public void visit(Decl d) {
        ST dec = groupTemplate.getInstanceOf("decl");
        d.type.accept(this);
        dec.add("type", type);
        dec.add("name", d.id);
        decls.add(dec);
    }

    @Override
    public void visit(Param p) {
        ST param = groupTemplate.getInstanceOf("param");
        p.paramType.accept(this);
        param.add("type", type);
        param.add("name", p.paramId);
        params.add(param);
    }

    @Override
    public void visit(Func f) {
        ST fun = groupTemplate.getInstanceOf("func");
        fun.add("name", f.funcId);

        temp = env.get(f.funcIdTypes);
        Set<String> keys = temp.getKeys();

        for(Type t : f.returnTypeList) {
            t.accept(this);
            fun.add("type", type);
        }

        params = new ArrayList<ST>();
        for(Param p : f.paramList) {
            keys.remove(p.paramId);
            p.accept(this);
        }
        fun.add("params", params);

        for(String key : keys) {
            ST decl = groupTemplate.getInstanceOf("param");
            decl.add("name", key);
            SType t = temp.get(key);
            processSType(t);
            decl.add("type", type);
            fun.add("decl", decl);
        }
        //cmds = new ArrayList<ST>();
        for(Cmd c: f.functionCmds){
            c.accept(this);
            fun.add("cmd", cmd);
            //cmds.add(cmd);
        }
        //fun.add("cmd", cmds);
        funcs.add(fun);
    }
    private void processSType(SType t) {
        if(t instanceof STyInt) {
            type = groupTemplate.getInstanceOf("int_type");
        }else if(t instanceof STyBool) {
            type = groupTemplate.getInstanceOf("boolean_type");
        }else if(t instanceof STyFloat) {
            type = groupTemplate.getInstanceOf("float_type");
        }else if(t instanceof STyChar) {
            type = groupTemplate.getInstanceOf("char_type");
        }else if(t instanceof STyData) {
            ST aux = groupTemplate.getInstanceOf("data_type");
            aux.add("dataId", ((STyData) t).getId());
            type = aux;
        } else if(t instanceof STyArr) {
            ST aux = groupTemplate.getInstanceOf("array_type");
            processSType(((STyArr) t).getArg());
            aux.add("type", type);
            type = aux;
        }
    }

    @Override
    public void visit(TypeArray t) {
        ST aux = groupTemplate.getInstanceOf("array_type");
        t.getTyArg().accept(this);
        aux.add("type", type);
        type = aux;
    }

    @Override
    public void visit(TypeData t) {
        ST aux = groupTemplate.getInstanceOf("data_type");
        aux.add("dataId", t.typeString);
        type = aux;
    }

    @Override
    public void visit(TypeInt t) {
        type = groupTemplate.getInstanceOf("int_type");
    }

    @Override
    public void visit(TypeFloat t) {
        type = groupTemplate.getInstanceOf("float_type");
    }

    @Override
    public void visit(TypeChar t) {
        type = groupTemplate.getInstanceOf("char_type");
    }

    @Override
    public void visit(TypeBool t) {
        type = groupTemplate.getInstanceOf("boolean_type");
    }

    @Override
    public void visit(CmdList e) {
        ST aux = groupTemplate.getInstanceOf("cmd_list");
        //cmds = new ArrayList<ST>();
        for(Cmd c : e.cmdList){
            c.accept(this);
            aux.add("cmds", cmd);
            //cmds.add(cmd);
        }
        cmd = aux;
        //aux.add("cmds", cmds);
    }

    @Override
    public void visit(CmdIf e) {
        ST aux = groupTemplate.getInstanceOf("if");
        e.testExp.accept(this);
        aux.add("exp", expr);
        e.thenNode.accept(this);
        aux.add("thn", cmd);
        Node n = e.elseNode;
        if(n != null) {
            n.accept(this);
            aux.add("els", cmd);
        }
        cmd = aux;
    }

    @Override
    public void visit(CmdIterate e) {
        ST aux = groupTemplate.getInstanceOf("iterate");
        e.testExp.accept(this);
        //aux.addAggr("exp.{lv, type}", expr, type);
        aux.addAggr("exp.{exp, id}", expr, e.getLine() + "_" + e.getColumn());

        e.itrCmd.accept(this);
        aux.add("cmd", cmd);
        cmd = aux;
    }

    @Override
    public void visit(CmdRead e) {
        ST aux = groupTemplate.getInstanceOf("read");
        e.lval.accept(this);
        aux.add("lval", expr);
        cmd = aux;
    }

    @Override
    public void visit(CmdPrint e) {
        ST aux = groupTemplate.getInstanceOf("print");
        e.printExp.accept(this);
        aux.add("exp", expr);
        cmd = aux;
    }

    @Override
    public void visit(CmdReturn e) {
        ST aux = groupTemplate.getInstanceOf("return");
        //exprs = new ArrayList<ST>();
        for(Exp ex : e.returnExp){
            ex.accept(this);
            aux.add("returnExps", expr);
            //exprs.add(expr);
        }

        cmd = aux;

    }

    @Override
    public void visit(CmdAssign e) {
        ST aux = groupTemplate.getInstanceOf("assign");
        e.getLval().accept(this);

        SType t = temp.get(e.getLval().id);
        processSType(t);
        aux.addAggr("lval.{lv, type}", expr, type);


        //aux.add("lval", expr);

        e.getValExp().accept(this);
        aux.add("exp", expr);

        cmd = aux;
    }

    @Override
    public void visit(CmdFunctionCall e) {
        /*
        call_cmd(name, args, exp) ::= <<
        auxReturnList = <name>(<args; separator=", ">);
        <returnExps : {exp | <exp> = auxReturnList.at(0);\n auxReturnList.remove(0);\n}>
        >>
         */

        //LocalEnv<SType> local = env.get(e.funcIdTypes);

        ST aux = groupTemplate.getInstanceOf("call_cmd");
        aux.add("name", e.funcId);
        for(Exp exp : e.exps) {
            exp.accept(this);
            aux.add("args", expr);
        }
        for(Lvalue lv : e.lvals) {
            lv.accept(this);
            SType t = temp.get(((LvalueID) lv).id);
            processSType(t);
            aux.addAggr("exp.{lv, type}", expr, type);
            //.add("exp", expr);
        }
        cmd = aux;
    }

    @Override
    public void visit(OpAnd e) {
        ST aux = groupTemplate.getInstanceOf("and_expr");
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }

    @Override
    public void visit(OpLess e) {
        ST aux = groupTemplate.getInstanceOf("lt_expr");
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }

    @Override
    public void visit(OpEq e) {
        ST aux = groupTemplate.getInstanceOf("equals_expr");
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }

    @Override
    public void visit(OpNotEq e) {
        ST aux = groupTemplate.getInstanceOf("not_equals_expr");
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }

    @Override
    public void visit(OpSum e) {
        ST aux = groupTemplate.getInstanceOf("add_expr");
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }

    @Override
    public void visit(OpSub e) {
        ST aux = groupTemplate.getInstanceOf("sub_expr");
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }

    @Override
    public void visit(OpMul e) {
        ST aux = groupTemplate.getInstanceOf("mul_expr");
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }

    @Override
    public void visit(OpDiv e) {
        ST aux = groupTemplate.getInstanceOf("div_expr");
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }

    @Override
    public void visit(OpMod e) {
        ST aux = groupTemplate.getInstanceOf("mod_expr");
        e.getLeft().accept(this);
        aux.add("left_expr", expr);
        e.getRight().accept(this);
        aux.add("right_expr", expr);
        expr = aux;
    }

    @Override
    public void visit(OpNot e) {
        ST aux = groupTemplate.getInstanceOf("not_expr");
        e.right.accept(this);
        aux.add("expr", expr);
        expr = aux;
    }

    @Override
    public void visit(OpMin e) {
        ST aux = groupTemplate.getInstanceOf("min_expr");
        e.right.accept(this);
        aux.add("expr", expr);
        expr = aux;
    }

    @Override
    public void visit(ExpNew e) {
        ST aux;
        e.newType.accept(this);
        if(e.newExp != null){
            aux = groupTemplate.getInstanceOf("new_expr_array");

            if(e.newType instanceof TypeArray){
                Type auxType = e.newType;
                while(auxType instanceof TypeArray){
                    aux.add("squares", "[]");
                    auxType = ((TypeArray) auxType).getTyArg();
                }
                auxType.accept(this);
            }
            aux.add("type", type);

            e.newExp.accept(this);
            aux.add("expr", expr);
        } else {
            aux = groupTemplate.getInstanceOf("new_expr_type");
            aux.add("type", type);
        }
        expr = aux;

    }

    @Override
    public void visit(ExpFunctionCall e) {
        //call_expr(name, args, exp) ::= <<<name>(<args; separator=", ">).at(exp)>>



        ST aux = groupTemplate.getInstanceOf("call_expr");
        aux.add("name", e.funcId);
        for(Exp exp : e.argExps) {
            exp.accept(this);
            aux.add("args", expr);
        }

        LocalEnv<SType> le = env.get(e.funcIdTypes);
        STyFunc tf = (STyFunc) le.getFuncType();
        int index = ((LiteralInt)e.selectorExp).getValue();
        processSType(tf.getTypesReturns()[index]);
        e.selectorExp.accept(this);
        aux.addAggr("exp.{exp, type}", expr, type);
        //aux.add("exp", expr);
        expr = aux;


    }

    @Override
    public void visit(LvalueID e) {
        ST aux = groupTemplate.getInstanceOf("lvalue");
        aux.add("name", e.id);
        //exprs = new ArrayList<ST>();
        for( Lvalue lv : e.selectors) {
            lv.accept(this);
            aux.add("array", expr);
            //exprs.add( expr);
        }
        //aux.add("array", exprs);
        expr = aux;
    }

    @Override
    public void visit(LvalueSelect e) {
        ST aux = groupTemplate.getInstanceOf("data_access");
        aux.add("expr", e.selectorID);
        expr = aux;
    }

    @Override
    public void visit(LvalueArray e) {
        ST aux = groupTemplate.getInstanceOf("array_access");
        e.selectorExp.accept(this);
        aux.add("expr", expr);
        expr = aux;
    }

    @Override
    public void visit(LiteralBool e) {
        expr = groupTemplate.getInstanceOf("boolean_expr");
        expr.add("val", e.getValue());
    }

    @Override
    public void visit(LiteralChar e) {
        expr = groupTemplate.getInstanceOf("char_expr");
        expr.add("val", e.getValue());

    }

    @Override
    public void visit(LiteralFloat e) {
        expr = groupTemplate.getInstanceOf("float_expr");
        expr.add("val", e.getValue());
    }

    @Override
    public void visit(LiteralInt e) {
        expr = groupTemplate.getInstanceOf("int_expr");
        expr.add("val", e.getValue());
    }

    @Override
    public void visit(LiteralNull e) {
        expr = groupTemplate.getInstanceOf("null_expr");
    }
}
