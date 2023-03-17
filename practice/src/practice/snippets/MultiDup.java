package practice.snippets;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiDup {

	public MultiDup() {		
		// Nothing to initialise.
	}

	public static void main(String[] args) {
		for (String arg: args) {
			Dup d = new Dup();
			d.examine(arg);
			fileData.put(arg, d.getFrequencies());
		}
		
		for (Entry<String, Map<String, Integer>> entry: fileData.entrySet()) {
			logger.log(Level.INFO, () -> String.format("File: %s", entry.getKey()));
			Map<String, Integer> freq = entry.getValue();
			for (Entry<String, Integer> fileEntry: freq.entrySet()) {
				logger.log(Level.INFO, () -> String.format("\t%s: %d", fileEntry.getKey(), fileEntry.getValue()));
			}
		}
	}
	
	static {
		fileData = new TreeMap<>();
		System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s%n");
	}
	
	private static Map<String, Map<String, Integer>> fileData;
	private static final Logger logger = Logger.getLogger(MultiDup.class.getName());
}
