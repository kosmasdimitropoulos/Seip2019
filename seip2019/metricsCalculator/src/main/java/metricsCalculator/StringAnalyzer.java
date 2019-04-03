package metricsCalculator;

import java.util.List;

public class StringAnalyzer implements Analyzer {

	int count;
	
	public int LinesCounter (List<String> lines){
		this.count = 0;
		boolean flag = false;
		
		for (String x : lines) {
			x.trim();
			
			//Check if different type of comments are included : Javadoc or plain comments
			if (x.startsWith("/*") || x.startsWith("/**") || x.endsWith("*/") || x.startsWith("//")) {
				flag = true;
				continue;
			}
			
			//Check if a line is null and if it starts or ends with a } , which underlies the ending of a method or a class
			if (x == null || ( x.startsWith("}") && x.endsWith("}"))) {
				flag = true;
				continue;
			}
			
			//if the previous prerequisites are not met we count the input as a line
			if (flag == false) {
				this.count++;
			}
		}
		return count;
	}
	
	public int ClassesCounter (List<String> lines) {
		this.count = 0;
		
		for (String x : lines) {
			x.trim();
			if (x.startsWith("public class") || x.startsWith("class") || x.startsWith("final class") || x.startsWith("abstract class") ) {
				this.count++;
			}	
		} return count;
	}
	
	public int MethodsCounter (List<String> lines) {
		this.count = 0;
		
		for (String x : lines) {
			x.trim();
			
			if ( ( (x.startsWith("public")) && !(x.contains("class")) && !(x.contains("=")) )
					|| (x.startsWith("static") && !(x.contains("class")) && !(x.contains("=")))
					|| (x.startsWith("private") && !(x.contains("=")))
					|| (x.startsWith("public static void main"))
					|| (x.startsWith("protected") && !(x.contains("="))) || (x.contains("public void"))) {
				this.count++;
			}
		}
		return count;
	}
}
