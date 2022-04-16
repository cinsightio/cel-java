package io.cinsight.cel.main;

import io.cinsight.cel.parser.CELBaseListener;
import io.cinsight.cel.parser.CELLexer;
import io.cinsight.cel.parser.CELParser;
import org.antlr.v4.runtime.*;

public class Demo {

    public static void main(String []args) {

        String input = "subject.country_code == \"US\"";
        CELLexer lexer = new CELLexer(new ANTLRInputStream(input));
        CELParser parser = new CELParser(new CommonTokenStream(lexer));
        TestListener listener = new TestListener();
        parser.addParseListener(listener);
        CELParser.StartContext context = parser.start();
        System.out.println(context.toStringTree(parser));
        System.out.println(listener.i);

    }
}
