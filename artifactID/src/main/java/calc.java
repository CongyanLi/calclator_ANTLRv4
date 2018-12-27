import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jline.reader.EndOfFileException;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.util.HashMap;
import java.util.Map;

public class calc{
    static Map <String, Double> map = new HashMap<String, Double>();
    public static void main(String[] args) throws Exception{
        System.setProperty("org.jline.terminal.dumb", "true");

        Terminal terminal = TerminalBuilder.builder()
                .system(true)
                .build();
        LineReader lineReader = LineReaderBuilder.builder()
                .terminal(terminal)
                .build();
        String prompt = "Calculator> ";
        while (true) {
            String line;
            try {
                line = lineReader.readLine(prompt);
                ANTLRInputStream str = new ANTLRInputStream(line + "\n");
                calculatorLexer lex = new calculatorLexer(str);
                CommonTokenStream tok = new CommonTokenStream(lex);

                calculatorParser parser = new calculatorParser(tok);
                ParseTree tree = parser.prog();

                if (new MyVisitor(map).visit(tree) != null) {
                    System.out.println(new MyVisitor(map).visit(tree));
                }


            } catch (UserInterruptException e) {
                // Do nothing
            } catch (EndOfFileException e) {

            }

        }

    }
}

class MyVisitor extends calculatorBaseVisitor<Double> {

    // use this map to store variable and corresponding value
    Map<String, Double> memory = null;

    public MyVisitor(Map<String, Double> map) {
        this.memory = map;
    }
    @Override public Double visitProg(calculatorParser.ProgContext ctx) {
        return visitChildren(ctx);
    }
//

    @Override public Double visitPrintExpr(calculatorParser.PrintExprContext ctx) {
        System.out.println(" Result: " + visit(ctx.expr()));
        return visitChildren(ctx);
    }
//

    @Override public Double visitAssign(calculatorParser.AssignContext ctx) {

        String var = ctx.VARIABLE().getText();
        if (memory.containsKey(var)) {
            memory.remove(var);
        }
        double val = visit(ctx.expr());
        memory.put(var, val);
        //System.out.println("mapsize: " + memory.keySet().size());
        return val;
    }
//

    @Override public Double visitBlank(calculatorParser.BlankContext ctx) {
        return 0.0;
    }
//

    @Override public Double visitACosine(calculatorParser.ACosineContext ctx) {
        double tem = visit(ctx.expr());
        double res = 0.0;
        res = Math.acos(tem);
        return res;
    }
//

    @Override public Double visitMulDiv(calculatorParser.MulDivContext ctx) {
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        double res = 0.0;
        String operator = ctx.op.getText();
        if (operator.equals("*")) {
            res = left * right;
        } else {
            res = left / right;
        }
        return res;
    }
//

    @Override public Double visitAddSub(calculatorParser.AddSubContext ctx) {
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        double res = 0.0;
        String operator = ctx.op.getText();
        if (operator.equals("+")) {
            res = left + right;
        } else {
            res = left - right;
        }
        return res;
    }
//

    @Override public Double visitSigned(calculatorParser.SignedContext ctx) {
        String mark = ctx.op.getText();
        double value = visit(ctx.atom());
        double positive = mark.equals("-") ? -1.0 : 1.0;
        double res = positive * value;
        return res;
    }
//

    @Override public Double visitAtoms(calculatorParser.AtomsContext ctx) {
        //System.out.println("number of this atom: " + ctx.getChildCount() + " about this atom: " + visitChildren(ctx));


        return visitChildren(ctx);
    }

    @Override public Double visitSine(calculatorParser.SineContext ctx) {
        double tem = visit(ctx.expr());
        double res = 0.0;
        res = Math.sin(tem);
        return res;
    }
//

    @Override public Double visitTangent(calculatorParser.TangentContext ctx) {
        double tem = visit(ctx.expr());
        double res = 0.0;
        res = Math.tan(tem);
        return res;
    }
//

    @Override public Double visitNaturalLogarithm(calculatorParser.NaturalLogarithmContext ctx) {
        double value = visit(ctx.expr());
        double res = Math.log(value);
        return res;
    }
//

    @Override public Double visitASine(calculatorParser.ASineContext ctx) {
        double tem = visit(ctx.expr());
        double res = 0.0;
        res = Math.asin(tem);
        return res;
    }
//

    @Override public Double visitLogarithm(calculatorParser.LogarithmContext ctx) {
        double base = visit(ctx.expr(0));
        double top = visit(ctx.expr(1));
        double res = 0.0;
        res = Math.log(top) / Math.log(base);
        return res;
    }
//

    @Override public Double visitSquareRoot(calculatorParser.SquareRootContext ctx) {
        double value = visit(ctx.expr());
        double res = Math.sqrt(value);
        return res;
    }
//

    @Override public Double visitATangent(calculatorParser.ATangentContext ctx) {
        double tem = visit(ctx.expr());
        double res = 0.0;
        res = Math.atan(tem);
        return res;
    }
//

    @Override public Double visitPower(calculatorParser.PowerContext ctx) {
        double base = visit(ctx.expr(0));
        double top = visit(ctx.expr(1));
        double res = Math.pow(base, top);
        return res;
    }
//

    @Override public Double visitCosine(calculatorParser.CosineContext ctx) {
        double tem = visit(ctx.expr());
        double res = Math.cos(tem);
        return res;
    }
//

    @Override public Double visitInteger(calculatorParser.IntegerContext ctx) {
        return Double.parseDouble(ctx.getText());
    }
//

    @Override public Double visitDouble(calculatorParser.DoubleContext ctx) {
        return Double.parseDouble(ctx.getText());
    }
//

    @Override public Double visitConstantPI(calculatorParser.ConstantPIContext ctx) {
        return Math.PI;
    }
//

    @Override public Double visitConstantE(calculatorParser.ConstantEContext ctx) {
        return Math.E;
    }
//

    @Override public Double visitScientific(calculatorParser.ScientificContext ctx) {
        String curr = ctx.getText();
        String pre = "";
        String nxt = "";
        if (curr.contains("E")) {
            pre = curr.split("E")[0];
            nxt = curr.split("E")[1];
        } else {
            pre = curr.split("e")[0];
            nxt = curr.split("e")[1];
        }
        double positive = 1.0;
        String validNxt = "";
        if (nxt.charAt(0) == '+') {
            validNxt = nxt.substring(1, nxt.length());
        } else if (nxt.charAt(0) == '-') {
            positive = -1.0;
            validNxt = nxt.substring(1, nxt.length());
        } else {
            validNxt = nxt;
        }
        double preDouble = Double.parseDouble(pre);
        double nxtDouble = Double.parseDouble(validNxt) * positive;
        double res = Math.pow(10, nxtDouble) * preDouble;
        return res;
    }
//

    @Override public Double visitVariable(calculatorParser.VariableContext ctx) {
//        System.out.println("visited here!");
        String var = ctx.VARIABLE().getText();
//        System.out.println("visited var: " + var);
        if (memory.containsKey(var)) {
            return memory.get(var);
        }
        System.out.println("Error: VARIABLE " + var + " Undefined");
        return (double) 0;
    }
//

    @Override public Double visitBraces(calculatorParser.BracesContext ctx) {

        return visit(ctx.expr());
    }

}

