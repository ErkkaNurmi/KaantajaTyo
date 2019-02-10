// Generated from .\OurLanguage.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OurLanguageParser}.
 */
public interface OurLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OurLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OurLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(OurLanguageParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(OurLanguageParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(OurLanguageParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(OurLanguageParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(OurLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(OurLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(OurLanguageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(OurLanguageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OurLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(OurLanguageParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OurLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(OurLanguageParser.ValueContext ctx);
}