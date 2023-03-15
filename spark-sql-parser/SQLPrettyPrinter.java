import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class SQLPrettyPrinter {

	public static void main(String[] args) throws Exception {
		if (args.length > 0) {
			String filename = args[0];
			InputStreamReader is = new InputStreamReader(new FileInputStream(filename));
			CharStream input = CharStreams.fromReader(is);
			SqlBaseLexer lexer = new SqlBaseLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			SqlBaseParser parser = new SqlBaseParser(tokens);
			ParseTree tree = parser.singleStatement();
			SqlBaseTransformer t = new SqlBaseTransformer();
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(t, tree);

			String newFile = "new_" + filename;
			
			try (FileOutputStream os = new FileOutputStream(newFile)) {
				os.write(t.getTransformedQuery().getBytes());
			} 
			logger.log(Level.INFO, t::getTransformedQuery);
		} else {
			logger.log(Level.SEVERE, "Need to give the SQL file name.");
		}

	}

	private static Logger logger = Logger.getLogger(SQLPrettyPrinter.class.getName());
}
