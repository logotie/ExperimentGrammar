package main;

import engine.InstructionRunner;
import grammar.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;

public class Starter {

    public static Queue<SimpleDraftGParser.BlockContext> Global_Blocks_iq = new LinkedList<SimpleDraftGParser.BlockContext>();


    public static void main(String[] args) throws Exception {

        String fileName = "C:"+ File.separator+"Program1"+File.separator+"test.txt";
        Path path = Paths.get(fileName);
        //Path path = Path.of(fileName);
        String content = Files.readString(path, StandardCharsets.US_ASCII);


        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(content);

        // create a lexer that feeds off of input CharStream
        SimpleDraftGLexer lexer = new SimpleDraftGLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        SimpleDraftGParser parser = new SimpleDraftGParser(tokens);
        ParseTree tree = parser.stat(); // begin parsing at init rule


        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();

        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new ShortToUnicodeString(), tree);
        System.out.println(); // print a \n after translation

        System.out.println("Begin processing");

        InstructionRunner ir = new InstructionRunner();
        ir.start();




    }
}
