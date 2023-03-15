import java.util.logging.Logger;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.logging.Level;

public class SqlBaseTransformer extends SqlBaseParserBaseListener {
	public SqlBaseTransformer() {
		indentationLevel = 0;
		stringBuilder = new StringBuilder();
	}

	@Override
	public void enterSelectClause(SqlBaseParser.SelectClauseContext ctx) {
		stringBuilder.append(ctx.getChild(0).getText().toLowerCase());
		stringBuilder.append("\n");
		SqlBaseParser.NamedExpressionSeqContext nesCtx = ctx.namedExpressionSeq();
		for (int i = 0; i < nesCtx.getChildCount(); ++i) {
			if (nesCtx.getChild(i) instanceof TerminalNode) {
				stringBuilder.append(nesCtx.getChild(i).getText());
				stringBuilder.append("\n");
			} else {
				addIndent(indentationLevel);
				stringBuilder.append(nesCtx.getChild(i).getText());
			}
		}
		stringBuilder.append("\n");
	}

	@Override
	public void enterFromClause(SqlBaseParser.FromClauseContext ctx) {
		addIndent(--indentationLevel);
		stringBuilder.append(ctx.getChild(0).getText().toLowerCase());
		stringBuilder.append("\n");
		addIndent(++indentationLevel);
		SqlBaseParser.RelationContext relCtx = ctx.relation(0);
		for (int i = 0; i < relCtx.getChildCount(); ++i) {
			if (relCtx.getChild(i) instanceof SqlBaseParser.RelationPrimaryContext) {
				splitAndPrint(relCtx.getChild(i));
			} else if (relCtx.getChild(i) instanceof SqlBaseParser.RelationExtensionContext) {
				SqlBaseParser.JoinRelationContext localRoot = (SqlBaseParser.JoinRelationContext) relCtx.getChild(i)
						.getChild(0);
				for (int j = 0; j < localRoot.getChildCount(); ++j) {
					splitAndPrint(localRoot.getChild(j));
				}
			}
		}
		stringBuilder.append(" \n");

	}

	private void splitAndPrint(ParseTree t) {
		if (t instanceof TerminalNode) {
			stringBuilder.append(t.getText());
			stringBuilder.append(" ");
		} else {
			for (int i = 0; i < t.getChildCount(); ++i) {
				if (t.getChild(i) instanceof SqlBaseParser.BooleanExpressionContext) {
					stringBuilder.append("\n");
					addIndent(indentationLevel);
					stringBuilder.append("(\n");
					addIndent(++indentationLevel);
				}
				stringBuilder.append(t.getChild(i).getText());
				stringBuilder.append(" ");
				if (t.getChild(i) instanceof SqlBaseParser.BooleanExpressionContext) {
					stringBuilder.append("\n");
					addIndent(--indentationLevel);
					stringBuilder.append(")");
				}

			}
		}
	}

	private void addIndent(int nTabs) {
		for (int i = 0; i <= nTabs; ++i) {
			stringBuilder.append(SqlBaseTransformer.SINGLE_TAB);
		}
	}

	public void logTransformedQuery() {
		logger.log(Level.INFO, () -> "\n" + stringBuilder.toString());
	}

	public String getTransformedQuery() {
		return stringBuilder.toString();
	}

	private int indentationLevel;
	private StringBuilder stringBuilder;
	private static final String SINGLE_TAB = "  ";
	private static final Logger logger = Logger.getLogger(SqlBaseTransformer.class.getName());
}
