import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Calc {

    public static void main(String[] args) throws IOException
    {
	ANTLRInputStream is = new ANTLRInputStream(System.in);
	LabeledExprLexer lexer = new LabeledExprLexer(is);
	CommonTokenStream cts = new CommonTokenStream(lexer);
	LabeledExprParser parser = new LabeledExprParser(cts);
	
	ParseTree tree = parser.init();
	
	EvalVisitor eval = new EvalVisitor();
	eval.visit(tree);
    }
    
}
