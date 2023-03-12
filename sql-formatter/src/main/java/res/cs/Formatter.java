package res.cs;

import java.nio.file.Files;
import java.nio.file.Path;

import com.github.vertical_blank.sqlformatter.SqlFormatter;
import com.github.vertical_blank.sqlformatter.core.FormatConfig;

public class Formatter {

	public Formatter() {
		config = FormatConfig.builder().uppercase(false).maxColumnLength(80).build();
	}
	
	public String format(final String original) {
		return SqlFormatter.format(original, config);
	}

	public static void main(String[] args) throws Exception {
		Path fileName = null;
		
		if (args.length > 0) {
			fileName = Path.of(args[0]);
		} else {
			throw new Exception("Need file name");
		}
		
		String sqlCode = Files.readString(fileName);
		Formatter formatter = new Formatter();
		String formatted = formatter.format(sqlCode);
		System.out.println(formatted);
	}
	
	FormatConfig config;

}
