package practice.snippets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class Dup {
	public Dup() {
		freq = new HashMap<>();
	}

	public void examine(final String filename) {
		Path path = Path.of(filename);
		try (Stream<String> lineStream = Files.lines(path)) {
			lineStream.forEach(this::check);
		} catch (IOException e) {
			logger.log(Level.SEVERE, e::getMessage);
		}
	}

	public void reveal() {
		for (Entry<String, Integer> entry : freq.entrySet()) {
			if (entry.getValue() > 1) {
				logger.log(Level.INFO, () -> String.format("%s: %d", entry.getKey(), entry.getValue()));
			}
		}
	}

	public static void main(String[] args) {
		if (args.length > 0) {
			Dup dup = new Dup();
			dup.examine(args[0]);
			dup.reveal();
		} else {
			logger.log(Level.SEVERE, "Need at least one file as an argument.");
		}

	}

	private void check(final String line) {
		if (line.length() > 0) {
			if (freq.containsKey(line)) {
				freq.put(line, freq.get(line) + 1);
			} else {
				freq.put(line, 1);
			}
		}
	}

	public Map<String, Integer> getFrequencies() {
		return freq;
	}

	static {
		System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s%n");
	}

	private Map<String, Integer> freq;
	private static final Logger logger = Logger.getLogger(Dup.class.getName());
}
