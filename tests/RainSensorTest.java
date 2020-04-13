/**
 * Test class for the RainSensor
 */
package tests;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import sensors.HumiditySensor;
import sensors.RainSensor;

/**
 * @author Jonathan Soledad
 *
 */
class RainSensorTest {
	static RainSensor sense;
	static RainSensor sense2;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		sense = new RainSensor();
		for(int testTime = 1; testTime <= 20; testTime++) {
			sense.getData();
		}
		sense2 = new RainSensor();
		for(int testTime = 1; testTime <= 20; testTime++) {
			sense2.getData();
		}
	}

	/**
	 * Test method for {@link sensors.RainSensor#RainSensor()}.
	 */
	@Test
	void testRainSensor() {
		sense = new RainSensor(10);
		assertThrows(IllegalArgumentException.class, () -> {new RainSensor(-1);});
		assertEquals(0, sense.getCRASize());
	}


	/**
	 * Test method for {@link sensors.RainSensor#getData()}.
	 */
	@Test
	void testGetData() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link sensors.RainSensor#allCurrentRainfall()}.
	 */
	@Test
	void testAllCurrentRainfall() {
		assertNotNull(sense.allCurrentRainfall());
		assertFalse(sense.allCurrentRainfall().isEmpty());
		assertNotEquals(sense.allCurrentRainfall(),sense2.allCurrentRainfall());
	}

}
