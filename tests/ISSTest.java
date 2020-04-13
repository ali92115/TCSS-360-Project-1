/**
 * Test class for the ISS
 */
package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import iss.ISS;

/**
 * @author Jonathan Soledad
 *
 */
class ISSTest {
	static ISS testIss;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		testIss = new ISS();
	}

	/**
	 * Test method for {@link iss.ISS#run()}.
	 */
	@Test
	void testRun() {
		//TODO {need to get the String from run method to check if null.}
		//TODO {Somehow test the timer, java coverage marks it red.
		
	}

}
