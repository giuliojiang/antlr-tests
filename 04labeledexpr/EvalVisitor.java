import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {

    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
	String id = ctx.ID().getText(); // left hand side of the =
	int value = visit(ctx.expr()); // compute the rhs
	memory.put(id, value); // store in memory
	return value;
    }

    @Override
    public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
	Integer value = visit(ctx.expr()); // evaluate the expr child
	System.out.println(value);
	return 0;
    }

    @Override
    public Integer visitInt(LabeledExprParser.IntContext ctx) {
	return Integer.parseInt(ctx.INT().getText());
    }

    @Override
    public Integer visitId(LabeledExprParser.IdContext ctx) {
	String id = ctx.ID().getText();
	if (memory.containsKey(id)) {
	    return memory.get(id);
	} else {
	    return 0;
	}
    }

    @Override
    public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) {
	Integer lhs = visit(ctx.expr(0));
	Integer rhs = visit(ctx.expr(1));
	if (ctx.op.getType() == LabeledExprLexer.MUL) {
	    return lhs * rhs;
	} else {
	    return lhs / rhs;
	}
    }

    @Override
    public Integer visitAddSub(LabeledExprParser.AddSubContext ctx) {
	Integer lhs = visit(ctx.expr(0));
	Integer rhs = visit(ctx.expr(1));
	if (ctx.op.getType() == LabeledExprLexer.ADD) {
	    return lhs + rhs;
	} else {
	    return lhs - rhs;
	}
    }

    @Override
    public Integer visitParens(LabeledExprParser.ParensContext ctx) {
	return visit(ctx.expr());
    }

    @Override
    public Integer visitClear(LabeledExprParser.ClearContext ctx) {
	String id = ctx.ID().getText();
	if (memory.containsKey(id))
	{
	    memory.remove(id);
	}
	return 0;
    }

}
