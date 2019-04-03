package metricsCalculator;

import java.util.List;

public interface Analyzer {
	
	public int LinesCounter(List<String> lines);
	public int ClassesCounter(List<String> lines);
	public int MethodsCounter(List<String> lines);
	
}
