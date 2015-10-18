import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Test
{

    public static void main(String[] args) throws Exception
    {
        // create CharStream
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        
        // create lexer
        ArrayInitLexer lexer = new ArrayInitLexer(input);
        
        // create tokens buffer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create parser
        ArrayInitParser parser = new ArrayInitParser(tokens);
        
        // make the tree
        ParseTree tree = parser.init();
        
        // print tree
        System.out.println(tree.toStringTree(parser));
        
        
    }
    
}
