
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.ParseTree;

import OurLanguage.OurLanguageBaseVisitor;
import OurLanguage.OurLanguageLexer;
import OurLanguage.OurLanguageParser;
import OurLanguage.OurLanguageParser.ProgramContext;
import OurLanguage.OurLanguageVisitor;
 
public class MainApp 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
        try {
    	CharStream charstream =
    			CharStreams.fromFileName
    			("C:\\MyTemp\\KaTe\\kesktulk\\KaantajaTyo-12_12_2018-J-\\KaantajaTyo-12_12_2018-J-\\AntlrKoe\\ManuaalisenGeneroinninKoe\\arithmeticsTest.txt");
		
        OurLanguageLexer lexer = new OurLanguageLexer(charstream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        OurLanguageParser parser = new OurLanguageParser(commonTokenStream);
        //ProgramContext prc = parser.program();
        ParseTree tree = parser.program();
        OurLanguageBaseVisitor visitor = new OurLanguageBaseVisitor();
        visitor.visit(tree);
 
        /*OurLanguageParser.FileContext fileContext = parser.file();                
        MarkupVisitor visitor = new MarkupVisitor();                
        visitor.visit(fileContext);*/
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}