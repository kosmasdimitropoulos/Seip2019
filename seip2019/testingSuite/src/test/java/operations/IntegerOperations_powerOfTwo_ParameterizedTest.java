package operations;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * A class which tests the functionality
 * of IntegerOperations.class with parameterized tests
 * @author kosmasdimitropoulos
 */
@RunWith(Parameterized.class)
public class IntegerOperations_powerOfTwo_ParameterizedTest {

	@Parameter (value = 0)
	public int number;
	@Parameter (value = 1)
	public int product;
	
	IntegerOperations iop = new IntegerOperations();
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {{0,1},{1,2},{2,4},{3,8},{4,16},{5,32},{6,64}};
		
		return Arrays.asList(data);
	}
	/**
	 * A test method which checks if the method
	 * powerOfTwo has the proper functionality
	 * with multiple numbers as input*/
	@Test
	public void test_powerOfTwo() {
		Assert.assertEquals(product, iop.powerOfTwo(number));
	}
}
