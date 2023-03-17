package practice.snippets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class WordCount {
    public WordCount() {
        freq = new TreeMap<>();
    }

    public void count(final String filename) {
        Path path = Path.of(filename);
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(this::split);
        } catch (IOException e) {
            logger.log(Level.SEVERE, e::getMessage);
        }
    }

    private void split(String line) {
        Arrays.stream(line.split("\\s+")).forEach(this::check);
    }

    private void check(String word) {
        if (word.length() > 0) {
            if (freq.containsKey(word)) {
                freq.put(word, freq.get(word) + 1);
            } else {
                freq.put(word, 1);
            }
        }
    }

    public void reveal() {
        for (Entry<String, Integer> entry : freq.entrySet()) {
            logger.log(Level.INFO, () -> String.format("%s: %d", entry.getKey(), entry.getValue()));
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            WordCount wc = new WordCount();
            wc.count(args[0]);
            wc.reveal();
        } else {
            logger.log(Level.SEVERE, "At least one file should be given as an argument.");
        }
    }

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s%n");
    }

    private Map<String, Integer> freq;
    private static final Logger logger = Logger.getLogger(WordCount.class.getName());
}
