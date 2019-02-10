// Generated from .\OurLanguage.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OurLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OurLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OurLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(OurLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurLanguageParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(OurLanguageParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurLanguageParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(OurLanguageParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(OurLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurLanguageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(OurLanguageParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OurLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(OurLanguageParser.ValueContext ctx);
}