package metricsCalculator;

import java.util.List;

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
		count = 0;
		boolean flag = false;
		
		for (String c : lines) {
			
			if (c.trim().matches("\\s*") || (c.trim().matches("^}") && c.trim().matches("$}"))
					|| c.trim().matches("$}") || c.trim().matches(".//")
					|| c.trim().matches("$*/")) {
				continue;
			}
			if (flag == false) {
				count ++;
			}
		}
		return count;
	}
	
	public int ClassesCounter (List<String> lines) {
	count = 0;
		for (String c : lines) {
			if (c.trim().matches("^public class") || c.trim().matches("^final class") 
					|| c.trim().matches("^abstract class") || c.trim().matches("^class")) { 
				count ++;
			}
		}
		return count;
	}
	
	
	public int MethodsCounter (List<String> lines) {
		count = 0;
		for (String c : lines) {
			if ((c.trim().matches("^public") && !c.trim().matches("=")) || (c.trim().matches("^static") && !c.trim().matches("="))
					|| (c.trim().matches("^private") && !c.trim().matches("=")) && c.trim().matches("\\{")) {
				count++;
			}
		}
		return count;
	}
}

