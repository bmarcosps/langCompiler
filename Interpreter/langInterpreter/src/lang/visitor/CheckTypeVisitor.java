package lang.visitor;

import lang.ast.*;
import lang.type.*;

import java.util.ArrayList;
import java.util.Stack;

public class CheckTypeVisitor extends Visitor {
    private STyInt tyint = STyInt.newSTyInt();
    private STyFloat tyfloat = STyFloat.newSTyFloat();
    private STyBool tybool = STyBool.newSTyBool();
    private STyChar tychar = STyChar.newSTyChar();
    private STyErr tyerr = STyErr.newSTyErr();


    private ArrayList<String> logError;

    private TyEnv<LocalEnv<SType>> env;
    private LocalEnv<SType> temp;

    private Stack<SType> stk;
    private boolean retChk;

    public CheckTypeVisitor(){
        stk = new Stack<SType>();
        env = new TyEnv<LocalEnv<SType>>();
        logError = new ArrayList<String>();
    }

    @Override
    public void visit(Prog p) {

    }

    @Override
    public void visit(Data d) {

    }

    @Override
    public void visit(Param p) {

    }

    @Override
    public void visit(Func f) {

    }

    @Override
    public void visit(TypeArray t) {

    }

    @Override
    public void visit(TypeData t) {

    }

    @Override
    public void visit(TypeInt t) {

    }

    @Override
    public void visit(TypeFloat t) {

    }

    @Override
    public void visit(TypeChar t) {

    }

    @Override
    public void visit(TypeBool t) {

    }

    @Override
    public void visit(CmdList e) {

    }

    @Override
    public void visit(CmdIf e) {

    }

    @Override
    public void visit(CmdIterate e) {

    }

    @Override
    public void visit(CmdRead e) {

    }

    @Override
    public void visit(CmdPrint e) {

    }

    @Override
    public void visit(CmdReturn e) {

    }

    @Override
    public void visit(CmdAssign e) {

    }

    @Override
    public void visit(CmdFunctionCall e) {

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

    /*
        || (right.match(tyfloat) && left.match(tyfloat))
        || (right.match(tychar) && left.match(tychar))
        || (right.match(tychar) && left.match(tychar))
        || (right.match(tybool) && left.match(tybool)))
     */
    private void checkRelationalType(SType left, SType right, int line, int col, String op) {
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

    }

    @Override
    public void visit(ExpFunctionCall e) {

    }

    @Override
    public void visit(LvalueID e) {

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

    }
}
