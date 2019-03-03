package AST;

import OurLanguage.OurLanguageVisitor;
import OurLanguage.OurLanguageBaseVisitor;
import OurLanguage.OurLanguageParser;
import OurLanguage.OurLanguageParser.ParamListContext;
import OurLanguage.OurLanguageParser.ProgramContext;

public class OurASTVisitor extends OurLanguageBaseVisitor
{
	@Override
	public Program visitProgram(ProgramContext ctx)
	{
		ParamListContext paramList = ctx.paramList();
		if (paramList != null)
		{
			visitParamList(paramList);
		}
		else
		{
			
		}
		
		return new Program(ctx.ID().getText(), null, null);
	}
	
	/*
	@Override
	public Program visitParamList(ProgramContext ctx)
	{
		return null;
	} */
}