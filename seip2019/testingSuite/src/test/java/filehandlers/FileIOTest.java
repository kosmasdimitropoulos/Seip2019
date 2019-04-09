package filehandlers;

import org.junit.Assert;
import org.junit.Test;

/**
 * A class which tests the functionality
 * of FileIO.class
 * @author kosmasdimitropoulos
 */
public class FileIOTest {
	
	FileIO fio = new FileIO();
	
	int[] linesArray = new int[] {1,2,3,54,21};
	
	/**
	 * A test method which checks if a text file
	 * given with valid numbers, has the proper 
	 * functionality when the method readFile() is called 
	 */
	@Test
	public void getvalidInput() {
		Assert.assertArrayEquals(linesArray, fio.readFile("../testingSuite/src\\test\\resources\\validIntegers.txt"));
	}
	
	/**
	 * A test method which checks if a text file
	 * given with invalid characters, throws 
	 * NumberFormatException when the method readFile() is called 
	 */
	@Test (expected = NumberFormatException.class)
	public void getInvalidInputException() {
		fio.readFile("..\\testingSuite\\src\\test\\resources\\invalidCharacters.txt");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void cannotFindFile() {
		fio.readFile("non-existing");
	}
	
	@Test (expected = NumberFormatException.class)
	public void outOfBounds() {
		fio.readFile("..\\testingSuite\\src\\test\\resources\\bigIntegers.txt");
	}
	
}
