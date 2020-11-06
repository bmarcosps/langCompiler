package lang.parser;

import lang.ast.SuperNode;

import java.io.IOException;


// Adaptador para classe de lang.parser. a Função parseFile deve retornar null caso o lang.parser resulte em erro.

public interface ParseAdaptor {
   public abstract SuperNode parseFile(String path) throws IOException;

}



