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

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");
    }

    private static final Logger logger = Logger.getLogger(TheApp.class.getName());

    private static final String HELP_FILE = "/Help.txt";

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                List<? extends Token> tokens = readInput(args[0]);

                PrettyPrinter pp = new PrettyPrinter();
                String beautified = pp.buildFormattedStatement(tokens);

                if (showTokens(args)) {
                    pp.showTokens(tokens);
                }
                writeOutput(beautified, args[0]);
            } catch (IOException e) {
                logger.log(Level.SEVERE, e.getMessage());
            }
        } else {
            showHelp();
        }
    }

    private static boolean showTokens(String[] args) {
        boolean result = false;

        for (String arg : args) {
            if (arg.compareTo("-t") == 0) {
                result = true;
                break;
            }
        }

        return result;
    }

    private static List<? extends Token> readInput(final String OldFileName) throws IOException {
        InputStreamReader is = new InputStreamReader(new FileInputStream(OldFileName));
        CharStream input = CharStreams.fromReader(is);
        SqlBaseLexer lexer = new SqlBaseLexer(input);
        List<? extends Token> tokens = lexer.getAllTokens();
        logger.log(Level.INFO, () -> String.format("Found %d tokens.", tokens.size()));

        return tokens;
    }

    private static void showHelp() {
        String message = new BufferedReader(new InputStreamReader(TheApp.class.getResourceAsStream(HELP_FILE))).lines()
                .collect(Collectors.joining("\n"));
        logger.log(Level.SEVERE, message);
    }

    private static void writeOutput(final String beautified, final String oldFileName) throws IOException {
        Path newPath = Path.of("new_" + oldFileName);
        if (Files.exists(newPath)) {
            Files.writeString(newPath, beautified, StandardOpenOption.TRUNCATE_EXISTING);
        } else {
            Files.writeString(newPath, beautified, StandardOpenOption.CREATE_NEW);
        }

    }

    public TheApp() {
        // Nothing to initialise
    }
}
