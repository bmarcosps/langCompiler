/*
    Bruno Marcos Pinheiro da Silva
    201565552AC

    Seany Caroliny Oliveira Silva
    201665566C
*/
package lang.parser;

import lang.ast.*;
import lang.visitor.*;
import lang.type.*;

import lang.visitor.CheckTypeVisitor;
import lang.visitor.CodeGeneratorVisitor;
import lang.visitor.InterpretAstVisitor;
import org.antlr.v4.runtime.*;

import java.io.IOException;

public class FinalParser implements ParseAdaptor {

    public SuperNode parseFile(String path) throws IOException {
        System.out.println("\n--------------------------------------- ");
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


            System.out.println("[  Cheking Types  ]");
            CheckTypeVisitor ctv = new CheckTypeVisitor();
            result.accept(ctv);

            TyEnv<LocalEnv<SType>> env = ctv.getEnv();

            CodeGeneratorVisitor cgv = new CodeGeneratorVisitor("Main" ,env);
            result.accept(cgv);


            //System.out.println("[  Interpreting  ]");
            //InterpretAstVisitor iav = new InterpretAstVisitor();
            //result.accept(iav);
            return result;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }


    }
}
