package gradeshistogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * @author kosmasdimitropoulos the purpose of this class is to generate a Histogram by getting a
 *  .txt file with students grades as an input from the command line. 
 *
 */
public class HistogramGenerator {
	
	/*
	 * Receives a single dimension Integer array. From this array the dataset
	 * that will be used for the visualization is generated. Finally, The chart
	 * is generated with the use of the aforementioned dataset and then
	 * presented in the screen.
	 * 
	 * @param gradeValues Single dimension integer array
	 */
	public void generateChart(int[] gradeValues) {
		/*
		 * The XYSeriesCollection object is a set XYSeries series (dataset) that
		 * can be visualized in the same chart
		 */
		XYSeriesCollection dataset = new XYSeriesCollection();
		
		/*
		 * The XYSeries that are loaded in the dataset. There might be many
		 * series in one dataset.
		 */
		XYSeries data = new XYSeries("Grades");
		
		/*
		 * Populating the XYSeries data object from the input Integer array
		 * values.
		 */
		int i = 0;
		for(int x : gradeValues){
			data.add(i, x);
			i++;
		}
		
		// add the series to the dataset
		dataset.addSeries(data);

		boolean legend = false; // do not visualize a legend
		boolean tooltips = false; // do not visualize tooltips
		boolean urls = false; // do not visualize urls
		
		// Declare and initialize a createXYLineChart JFreeChart
		JFreeChart chart = ChartFactory.createXYLineChart("Histogram of Grades", "Grades", "Frequency", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);

		/*
		 * Initialize a frame for visualizing the chart and attach the
		 * previously created chart.
		 */
		ChartFrame frame = new ChartFrame("First", chart);
		frame.pack();
		
		// makes the previously created frame visible
		frame.setVisible(true);
	}

	
	public static void main(String[] args) {
		/*
		 * Checking if the user has put an argument from the command line,
		 * if not a message is shown and the program stops running
		 */
		if (args.length == 0) {
			System.out.println("No file is given! Please give a file as an argument!");
			System.exit(1);
		}
		/*
		 * Initialize a file which is given as an argument via the 
		 * command line (.txt file)
		 */
		File file = new File(args[0]);
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			System.err.println("Error" + e);
		}
		
		/*
		 * gradeValues is an array of integers, where the grades 
		 * of the students will be stored  
		 */
		
		int[] gradeValues = new int [11];
		
		for (int y = 0; y <= 10; y++)
			gradeValues[y] = 0;
		
		/*
		 * Initialize an st String variable an check if every
		 * line of the file that was given is not null. If the line
		 * is not null an integer y variable is initialized by
		 * changing the st String variable into an integer. Then this
		 * integer is added in the dataValues array.
		 */
		String st;
		try {
			while ((st = br.readLine()) != null) {
				int f = Integer.parseInt(st);
				gradeValues[f]++;
			}
		} catch (IOException e) {
			System.err.println("Error" + e);
		}
		
		/*
		 * We make an object of the generateChart method so
		 * as to call it from the main method
		 */
		HistogramGenerator generateChart = new HistogramGenerator();
		generateChart.generateChart(gradeValues);
		
	}
}
