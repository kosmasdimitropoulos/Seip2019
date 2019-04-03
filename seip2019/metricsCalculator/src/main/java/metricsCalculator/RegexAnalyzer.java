package metricsCalculator;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAnalyzer implements Analyzer {

	int count;
	
	public int LinesCounter (List<String> lines){
		this.count = 0;
		Pattern y = Pattern.compile("(\"^((?!//).)*$\"])");
		Matcher x;
		
		for (String c : lines) {
			
			x = y.matcher(c);
			
			if (x.matches()) {
				count++;
			}
		}
		return count;
	}
	
	
	public int ClassesCounter (List<String> lines) {
		this.count = 0;
		Pattern y = Pattern.compile("(((|public|final|abstract|private|static|protected)(\\\\s+))?(class)(\\\\s+)(\\\\w+)(<.*>)?(\\\\s+extends\\\\s+\\\\w+)?(<.*>)?(\\\\s+implements\\\\s+)?(.*)?(<.*>)?(\\\\s*))\\\\{$");
		Matcher x;
		
		for (String c : lines) {
			
			x = y.matcher(c);
			
			if (x.matches()) {
				count++;
			}
		}
		return count;
	}
	
	public int MethodsCounter (List<String> lines) {
		this.count = 0;
		Pattern y = Pattern.compile("(public|protected|private|static|\\\\s) +[\\\\w\\\\<\\\\>\\\\[\\\\]]+\\\\s+(\\\\w+) *\\\\([^\\\\)]*\\\\) *(\\\\{?|[^;])");
		Matcher x;
		
		for (String c : lines) {
			
			x = y.matcher(c);
			
			if (x.matches()) {
				count++;
			}
		}
		return count;
	}
}

