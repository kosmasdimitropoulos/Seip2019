package metricsCalculator;

import java.util.List;

/**
 * A class which initializes
 * the 3 metric counters
 * @author kosmasdimitropoulos
 */
public interface Analyzer {
	
	public int LinesCounter(List<String> lines);
	public int ClassesCounter(List<String> lines);
	public int MethodsCounter(List<String> lines);
	
}
