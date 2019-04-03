package metricsCalculator;

import java.util.ArrayList;
import java.util.List;

public class CodeAnalyzer {
	
	public void analyze (String pathOfFile, String analysisType, String fileProduced) {
		int loc; //loc : Lines of Code
		int noc; //noc : Numbers of Classes
		int nom; //nom : Number of Methods
		
		List<String> metrics = new ArrayList<String>();
		List<String> lines = new ArrayList<String>();
		
		lines = FileIOUtilities.readFile(pathOfFile);
		
		Analyzer analyzer = AnalyzeFactory.createAnalyzer(analysisType);
		loc = analyzer.LinesCounter(lines);
		noc = analyzer.ClassesCounter(lines);
		nom = analyzer.MethodsCounter(lines);
		metrics = CodeAnalyzer.metricsConcatenation(loc, noc, nom);
		
		FileIOUtilities.generateCSVFile(fileProduced, metrics);
		
	}
	
	
	public static List<String> metricsConcatenation (int loc, int noc, int nom) {
		List<String> m = new ArrayList<String>();
		m.add(String.valueOf(loc));
		m.add(String.valueOf(noc));
		m.add(String.valueOf(nom));		
		
		return m;		
	}
	
	
}
