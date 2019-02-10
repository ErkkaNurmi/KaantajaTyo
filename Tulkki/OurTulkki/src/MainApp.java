import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.pattern.ParseTreeMatch;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;

public class MainApp {
	@SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
    	ANTLRInputStream antlris;
        try {
        	InputStream inputStream = new FileInputStream("F:\\Kurssit\\KaantajaRepo2\\arithmeticsTest.txt");
        	antlris = new ANTLRInputStream(inputStream);
        	
        	OurLanguageLexer lexer = new OurLanguageLexer(antlris);
        	CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        	OurLanguageParser parser = new OurLanguageParser(commonTokenStream);
        	ParseTree tree = parser.program();
        	//ParseTreePattern ptp = parser.compileParseTreePattern("ID", OurLanguageParser.RULE_program);
        	//ParseTreeMatch m = ptp.match(tree);
        	System.out.println(tree.toString());
 
        	/*OurLanguageParser.FileContext fileContext = parser.file();                
        	MarkupVisitor visitor = new MarkupVisitor();                
        	visitor.visit(fileContext);*/
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}