package lang.ast;

import lang.visitor.Visitor;

public interface Visitable {

    public void accept(Visitor v);
}
