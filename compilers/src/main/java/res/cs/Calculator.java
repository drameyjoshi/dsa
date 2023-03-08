package res.cs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader is;

		if (args.length < 1) {
			is = new InputStreamReader(System.in);
		} else {
			is = new InputStreamReader(new FileInputStream(args[0]));
		}

		CharStream input = CharStreams.fromReader(is);
		ExprLexer lexer = new ExprLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprParser parser = new ExprParser(tokens);
		ParseTree tree = parser.prog();
		EvalVisitor visitor = new EvalVisitor();
		visitor.visit(tree);
	}
}
