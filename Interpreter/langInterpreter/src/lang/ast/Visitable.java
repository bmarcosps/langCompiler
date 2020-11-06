package lang.ast;

import lang.parser.Visitor;

public interface Visitable {

    public void accept(Visitor v);
}
