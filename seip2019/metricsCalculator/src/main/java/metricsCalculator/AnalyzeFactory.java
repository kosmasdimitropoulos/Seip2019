package metricsCalculator;

/**
 * A class which gives the user
 * the opportunity to choose 
 * between two analyzer techniques,
 * String or Regex.
 * @author kosmasdimitropoulos
 */
public class AnalyzeFactory {

	public static Analyzer createAnalyzer(String analyzerType) {
		Analyzer analyzer = null;
		
		if (analyzerType.equals("String"))
			analyzer = new StringAnalyzer();
		else if (analyzerType.equals("Regex")) 
			analyzer = new RegexAnalyzer();
				
		return analyzer;
		
	}
	
}
