package operations;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import filehandlers.FileIO;
import operations.ArrayOperrations;

/**
 * A class which tests the functionality
 * of ArrayOperations.class
 * @author kosmasdimitropoulos
 */
public class ArrayOperationsTest {
	
	FileIO fio = mock(FileIO.class);
	IntegerOperations io = mock(IntegerOperations.class);
	ArrayOperrations ao = new ArrayOperrations(fio, io);
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	/**
	 * A test method which checks if the method
	 * findMaxInFile throws an exception
	 * when an empty text file is given as input 
	 */
	@Test
	public void test_emptyFile_Mocking() {
		
		int[] linesArray = new int[] {};
		when(fio.readFile("empty")).thenReturn(linesArray);
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The array should not be empty.");
		ao.findMaxInFile("empty");
		
	}
	
	/**
	 * A test method which checks if the method
	 * findMaxInFile operates properly
	 */
	@Test
	public void test_findMaxReguralOperation_Mocking() {
		
		int[] linesArray = new int[] {1,2,3,54,21};
		when(fio.readFile("array")).thenReturn(linesArray);
		
		Assert.assertEquals(54, ao.findMaxInFile("array"));
		
	}
	
	/**
	 * A test method which checks if the method
	 * reverseArray throws an exception
	 * when an empty text file is given as input 
	 */
	@Test
	public void test_emptyFileReverse_Mocking() {
		
		int[] linesArray = new int[] {};
		when(fio.readFile("empty")).thenReturn(linesArray);
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Cannot reverse the signs of an empty array");
		ao.reverseArray("empty");
		
	}
	
	/**
	 * A test method which checks if the method
	 * reverseArray operates properly 
	 */
	@Test
	public void test_FileReverse_Mocking() {
		when(fio.readFile("test")).thenReturn(new int[] {-15,5,0,20});
		when(io.reverseSign(-15)).thenReturn(15);
		when(io.reverseSign(5)).thenReturn(-5);
		when(io.reverseSign(0)).thenReturn(0);
		when(io.reverseSign(20)).thenReturn(-20);
		
		Assert.assertArrayEquals(new int[] {15, -5, 0, -20}, ao.reverseArray("test"));
		
	}
}
