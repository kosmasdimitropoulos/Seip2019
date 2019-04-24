package operations;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * A class which is used as a suite for all
 * the IntegerOperation Test classes
 * @author kosmasdimitropoulos
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({IntegerOperationsTest.class, IntegerOperations_powerOfTwo_ParameterizedTest.class})
public class IntegerOperationsTestSuite {
}
