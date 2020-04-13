/**
 * 
 */
package tests;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import sensors.HumiditySensor;

/**
 * @author Jonathan Soledad
 *
 */
class HumiditySensorTest {
	static HumiditySensor sense; 
	static HumiditySensor sense2; 
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	//test data for one sensor with 20 data points
		sense = new HumiditySensor();
		for(int testTime = 1; testTime <= 20; testTime++) {
			sense.getData();
		}
		
	//test data for another sensor with 20 data points
		sense2 = new HumiditySensor();
		for(int testTime = 1; testTime <= 20; testTime++) {
			sense2.getData();
		}
	}

	/**
	 * Test method for {@link sensors.HumiditySensor#HumiditySensor()}.
	 */
	@Test
	void testHumiditySensor() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link sensors.HumiditySensor#HumiditySensor(double, double)}.
	 */
	@Test//(expected = IllegalArgumentException.class)
	void testHumiditySensor(double in, double out) { //TODO
		in = 0;
		for (int test = 0; test <= 4; test++) {
			if(in < 1) {
				//assertTrue("The inner humidity must be in the interval [1,100]");
			}
		}
	}

	/**
	 * Test method for {@link sensors.HumiditySensor#getData()}.
	 */
	@Test
	void testGetData() {
		assertTrue(!sense.getData().equals(null));
	}

	/**
	 * Test method for {@link sensors.HumiditySensor#allInnerHum()}.
	 */
	@Test
	void testAllInnerHum() {
		assertTrue(!sense.allInnerHum().isEmpty());
		assertNotEquals(sense.allInnerHum(),sense2.allInnerHum());
	}

	/**
	 * Test method for {@link sensors.HumiditySensor#allOuterHum()}.
	 */
	@Test
	void testAllOuterHum() {
		assertTrue(!sense.allOuterHum().isEmpty());
		assertNotEquals(sense.allOuterHum(),sense2.allOuterHum());
	}

}
