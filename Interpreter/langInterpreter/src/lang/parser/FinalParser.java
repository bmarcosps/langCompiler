/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.parser;

import lang.ast.Node;
import lang.ast.SuperNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class FinalParser implements ParseAdaptor {

    public SuperNode parseFile(String path) throws IOException {

        LangLexer lexer = new LangLexer(CharStreams.fromFileName(path));
        LangParser parser = new LangParser(new CommonTokenStream(lexer));

        lexer.removeErrorListeners();
        lexer.addErrorListener(new CustomErrorListener());
        parser.removeErrorListeners();
        parser.addErrorListener(new CustomErrorListener());

        SuperNode result;
        try {

            BuildAstVisitor pv = new BuildAstVisitor();
            result = pv.visit(parser.prog());

            InterpretAstVisitor iav = new InterpretAstVisitor();
            result.accept(iav);
            //ParseTree tree = parser.prog();
            //String parsedTree = tree.toStringTree(parser);
            //result = new Node(parser.getCurrentToken().getLine(), parser.getCurrentToken().getCharPositionInLine());

            //System.out.println(parsedTree);
            return result;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }


    }
}
