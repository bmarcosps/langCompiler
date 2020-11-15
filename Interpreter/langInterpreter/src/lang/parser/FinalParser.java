/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.parser;

import lang.ast.SuperNode;
import lang.visitor.CheckTypeVisitor;
import lang.visitor.InterpretAstVisitor;
import org.antlr.v4.runtime.*;

import java.io.IOException;

public class FinalParser implements ParseAdaptor {

    public SuperNode parseFile(String path) throws IOException {
        System.out.println("\n --------------------------------------- ");
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

            CheckTypeVisitor ctv = new CheckTypeVisitor();
            result.accept(ctv);


            InterpretAstVisitor iav = new InterpretAstVisitor();
            result.accept(iav);

            System.out.println("\n ---------------------------------------  \n");

            return result;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("\n --------------------------------------- \n");
            return null;
        }


    }
}
