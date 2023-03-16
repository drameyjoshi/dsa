package res.cs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.logging.*;

import com.github.vertical_blank.sqlformatter.SqlFormatter;
import com.github.vertical_blank.sqlformatter.core.FormatConfig;

public class Beautifier {

	public Beautifier() {
		config = FormatConfig.builder().uppercase(false).maxColumnLength(80).build();
	}
	
	public String beautify(final String original) {
		return SqlFormatter.format(original, config);
	}
	
	public static void main(String[] args) {
		if (args.length > 0) {
			String filename = args[0];
			Path filePath = Path.of(filename);
			try {
				String original = Files.readString(filePath);
				Beautifier b = new Beautifier();
				String beautified = b.beautify(original);
				logger.log(Level.FINE, () -> b.beautify(beautified));
				
				String newFile = "new_" + filename;
				Path newpath = Files.writeString(Path.of(newFile), beautified, StandardOpenOption.CREATE);
				logger.log(Level.INFO, () -> String.format("Beautified query is in %s.", newpath.getFileName()));
			} catch (IOException e) {
				logger.log(Level.WARNING, e.getMessage());
			}
			
		} else {
			logger.log(Level.SEVERE, "SQL file not given on command line.");
		}
	}

	private FormatConfig config;
	private static Logger logger = Logger.getLogger(Beautifier.class.getName());
}
