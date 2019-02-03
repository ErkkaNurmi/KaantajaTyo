import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
 
public class MainApp 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
    	ANTLRInputStream antlris;
        try {
        	InputStream inputStream
        		= new FileInputStream("C:\\MyTemp\\KaTe\\kesktulk\\KaantajaTyo-12_12_2018-J-\\KaantajaTyo-12_12_2018-J-\\AntlrKoe\\ManuaalisenGeneroinninKoe\\arithmeticsTest.txt");
			antlris = new ANTLRInputStream(inputStream);
		
        OurLanguageLexer lexer = new OurLanguageLexer(antlris);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        OurLanguageParser parser = new OurLanguageParser(commonTokenStream);
 
        /*OurLanguageParser.FileContext fileContext = parser.file();                
        MarkupVisitor visitor = new MarkupVisitor();                
        visitor.visit(fileContext);*/
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}