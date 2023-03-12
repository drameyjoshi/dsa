package res.cs;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EvalVisitor extends ExprBaseVisitor<Double> {
	private Map<String, Double> symbols = new HashMap<>();
	private static final Logger logger = LoggerFactory.getLogger(EvalVisitor.class.getName());

	@Override
	public Double visitNumber(ExprParser.NumberContext ctx) {
		return Double.parseDouble(ctx.NUMBER().getText());
	}

	@Override
	public Double visitIdentifier(ExprParser.IdentifierContext ctx) {
		String name = ctx.ID().getText();

		if (symbols.containsKey(name)) {
			return symbols.get(name);
		} else {
			return 0.0d;
		}
	}

	@Override
	public Double visitAssign(ExprParser.AssignContext ctx) {
		String name = ctx.ID().getText();
		Double value = visit(ctx.expr());
		symbols.put(name, value);
		return value;
	}

	@Override
	public Double visitAddSub(ExprParser.AddSubContext ctx) {
		if (ctx.PLUS() != null) {
			return visit(ctx.expr(0)) + visit(ctx.expr(1));
		} else {
			return visit(ctx.expr(0)) - visit(ctx.expr(1));
		}
	}

	@Override
	public Double visitMulDiv(ExprParser.MulDivContext ctx) {
		if (ctx.MUL() != null) {
			return visit(ctx.expr(0)) * visit(ctx.expr(1));
		} else {
			return visit(ctx.expr(0)) / visit(ctx.expr(1));
		}
	}
	
	@Override
	public Double visitExponentiation(ExprParser.ExponentiationContext ctx) {
		return Math.pow(visit(ctx.expr(0)), visit(ctx.expr(1)));
	}
	
	@Override
	public Double visitPrintExpr(ExprParser.PrintExprContext ctx) {
		String output = String.format("%f", visit(ctx.expr()));
		logger.info(output);
		return 0.0d;
	}
	
	@Override
	public Double visitParens(ExprParser.ParensContext ctx) {
		return visit(ctx.expr());
	}
	
	@Override
	public Double visitClear(ExprParser.ClearContext ctx) {
		symbols.clear();
		return 0.0d;
	}
}
