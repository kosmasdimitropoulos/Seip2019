package operations;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * A class which tests the functionality
 * of IntegerOperations.class
 * @author kosmasdimitropoulos
 */
public class IntegerOperationsTest {
	
	IntegerOperations iop = new IntegerOperations();
	
	/**
	 * A test method which checks if the method
	 * reverseSign has the proper functionality
	 * with positive number as input*/
	@Test
	public void test_getSign_positive() {
		Assert.assertEquals(-3, iop.reverseSign(3));
	}
	
	/**
	 * A test method which checks if the method
	 * reverseSign has the proper functionality 
	 * with negative number as input*/
	@Test
	public void test_getSign_negative() {
		Assert.assertEquals(3, iop.reverseSign(-3));
	}
	
	/**
	 * A test method which checks if the method
	 * reverseSign has the proper functionality
	 *  with number 0 given*/
	@Test
	public void test_getSign_zero() {
		Assert.assertEquals(0, iop.reverseSign(0));
	}
	
	/**
	 * A test method which checks if the method
	 * add throws an exception when non-positive
	 * numbers are given as input*/
	@Test (expected = IllegalArgumentException.class)
	public void test_getNegativeNumber_exception() {
		iop.add(2,-1);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_getNegativeNumberX_exception() {
		iop.add(-6,1);
	}
	
	/**
	 * A test method which checks if the method
	 * add throws an exception when the sum
	 * is greater than Integer.MAX_VALUE */
	@Test (expected = IllegalArgumentException.class)
	public void test_getMaxNumber_exception() {
		iop.add(Integer.MAX_VALUE - 5, 8);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	/**
	 * A test method which checks if the method
	 * powerOfTwo throws an exception when a non-positive
	 * integer is given as input */
	@Test
	public void test_getNegativeInteger_exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage(" is not a positive integer.");
		iop.powerOfTwo(-5);
	}
	
	/**
	 * A test method which checks if the method
	 * powerOfTwp throws an exception when a
	 * numbers square is greater than Integer.MAX_VALUE */
	@Test 
	public void test_getBigInteger_exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("^2 causes an integer overflow.");
		iop.powerOfTwo(36);
	}
	
	@Test
	public void test_normalCase() {
		Assert.assertEquals(70, iop.add(3,67));
	}
	
}
