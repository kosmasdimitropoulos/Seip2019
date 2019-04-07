package metricsCalculator;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A class which provides the
 * functionality of reading and
 * generating a file.
 * @author kosmasdimitropoulos
 */
public class FileIOUtilities {
	
	private FileIOUtilities() {
	}
	
	/**
	 * A method which reads a file
	 * and return the number of it's
	 * lines
	 */
	public static List<String> readFile (String filePath) {
		
		BufferedReader br = null;
		FileInputStream i = null;
		InputStreamReader ir = null;
		List<String> lines = new ArrayList<String>();
		String cur = null;
		
		try {
			
			i = new FileInputStream(filePath);
			ir = new InputStreamReader(i);
			br = new BufferedReader(ir);
			
			while ((cur = br.readLine()) != null) {
				lines.add(cur);
			}
		} catch (IOException e) {
			System.err.println("Error" + e);
		}
		
		return lines;
	}
	
	/**
	 * A method which generates a csv file
	 * with the 3 metrics results
	 */
	public static void generateCSVFile(String filePath, List<String> metricsResults) {

		FileWriter writer = null;

		try {

			writer = new FileWriter(filePath);
		
			writer.append(metricsResults.get(0));
			writer.append(",");
			writer.append(metricsResults.get(1));
			writer.append(",");
			writer.append(metricsResults.get(2));

		} catch (IOException e) {
			System.err.print("Error" + e);
		} finally {
			try {
				writer.flush();
				writer.close();
			} catch (IOException e) {
				System.err.print("Error" + e);
			}
		}
	}
}
