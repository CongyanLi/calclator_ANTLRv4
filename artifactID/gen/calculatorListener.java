// Generated from /Users/congyanli/IdeaProjects/artifactID/src/main/calculator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(calculatorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(calculatorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(calculatorParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(calculatorParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(calculatorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(calculatorParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(calculatorParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(calculatorParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ACosine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterACosine(calculatorParser.ACosineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ACosine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitACosine(calculatorParser.ACosineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(calculatorParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(calculatorParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(calculatorParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(calculatorParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Signed}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSigned(calculatorParser.SignedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Signed}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSigned(calculatorParser.SignedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atoms}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtoms(calculatorParser.AtomsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atoms}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtoms(calculatorParser.AtomsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSine(calculatorParser.SineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSine(calculatorParser.SineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tangent}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTangent(calculatorParser.TangentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tangent}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTangent(calculatorParser.TangentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NaturalLogarithm}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNaturalLogarithm(calculatorParser.NaturalLogarithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NaturalLogarithm}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNaturalLogarithm(calculatorParser.NaturalLogarithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterASine(calculatorParser.ASineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitASine(calculatorParser.ASineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Logarithm}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogarithm(calculatorParser.LogarithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Logarithm}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogarithm(calculatorParser.LogarithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SquareRoot}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSquareRoot(calculatorParser.SquareRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SquareRoot}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSquareRoot(calculatorParser.SquareRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATangent}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterATangent(calculatorParser.ATangentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATangent}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitATangent(calculatorParser.ATangentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(calculatorParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(calculatorParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cosine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCosine(calculatorParser.CosineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cosine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCosine(calculatorParser.CosineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterInteger(calculatorParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitInteger(calculatorParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDouble(calculatorParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDouble(calculatorParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantPI}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterConstantPI(calculatorParser.ConstantPIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantPI}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitConstantPI(calculatorParser.ConstantPIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantE}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterConstantE(calculatorParser.ConstantEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantE}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitConstantE(calculatorParser.ConstantEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Scientific}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterScientific(calculatorParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Scientific}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitScientific(calculatorParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterVariable(calculatorParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitVariable(calculatorParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBraces(calculatorParser.BracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBraces(calculatorParser.BracesContext ctx);
}