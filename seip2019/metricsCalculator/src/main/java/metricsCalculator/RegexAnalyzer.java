package metricsCalculator;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A class which analyzes the file given
 * into 3 metrics via Regex Analysis:
 * lines of code (Lines Counter),
 * number of classes (Classes Counter),
 * number of methods (Methods Counter)
 * @author kosmasdimitropoulos
 *
 */
public class RegexAnalyzer implements Analyzer {

	int count;

	public int LinesCounter (List<String> lines){
		this.count = 0;
		Pattern y = Pattern.compile("(\"^((?!//).)*$\"])");
		Matcher x;

		for (String c : lines) {

			x = y.matcher(c);

			if (!x.matches()) {
				count++;
			}
		}
		return count;
	}


	public int ClassesCounter (List<String> lines) {
		this.count = 0;
		Pattern y = Pattern.compile("(((|public|final|abstract|private|static|protected)(\\s+))?(class)(\\s+)(\\w+)(<.*>)?(\\s+extends\\s+\\w+)?(<.*>)?(\\s+implements\\s+)?(.*)?(<.*>)?(\\s*))\\{$");
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
		Pattern y = Pattern.compile("((|public|protected|private|static)(\\s+))?[^class]");
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
