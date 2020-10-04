/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/

import java.io.FileReader;
import java.io.IOException;

public class Scanner{ 
    public static void main(String args[]) throws IOException{
        LexicalAnalyser lx = new LexicalAnalyser(new FileReader(args[0]));
        Token t = lx.nextToken();
        while(t != null){
            System.out.println(t.printTokenFormat()); 
            t = lx.nextToken();
        }
        System.out.println("Lexical analysis complete.");
            
    }
}
