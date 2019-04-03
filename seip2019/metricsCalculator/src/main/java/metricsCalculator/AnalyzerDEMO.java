package metricsCalculator;

public class AnalyzerDEMO {
	
	public static void main(String[] args) {

		if (args.length == 0) {
			System.err.println("2 (Two) arguments required : FilePath , String or Regex");
			System.exit(1);
		}

		CodeAnalyzer analyzer = new CodeAnalyzer();
		analyzer.analyze(args[0], args[1], "./FileMetrics.csv");
	}
	
}
