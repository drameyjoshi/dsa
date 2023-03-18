package res.cs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class TheApp {

    public TheApp() {
        // Nothing to initialise
    }    

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                InputStreamReader is = new InputStreamReader(new FileInputStream(args[0]));
                CharStream input = CharStreams.fromReader(is);
                SqlBaseLexer lexer = new SqlBaseLexer(input);
                List<? extends Token> tokens = lexer.getAllTokens();
                logger.log(Level.INFO, () -> String.format("Found %d tokens.", tokens.size()));

                PrettyPrinter pp = new PrettyPrinter();
                String beautified = pp.buildFormattedStatement(tokens);                
                Files.writeString(Path.of("new_" + args[0]), beautified, StandardOpenOption.CREATE);
            } catch (IOException e) {
                logger.log(Level.SEVERE, e.getMessage());
            }
        } else {
            showHelp();
        }
    }

    public static void showHelp() {
        String message = new BufferedReader(new InputStreamReader(TheApp.class.getResourceAsStream(HELP_FILE))).lines()
                .collect(Collectors.joining("\n"));
        logger.log(Level.SEVERE, message);
    }

    
    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");       
    }

    private static final Logger logger = Logger.getLogger(TheApp.class.getName());
    private static final String HELP_FILE = "/Help.txt";
}
