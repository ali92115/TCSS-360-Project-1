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
import sensors.TemperatureSensor;

/**
 * @author Juan
 *
 */
class TemperatureSensorTest {
	static TemperatureSensor sense; 
	static TemperatureSensor sense2; 
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		sense = new TemperatureSensor();
		for(int testTime = 1; testTime <= 20; testTime++) {
			sense.getData();
		}
		
	//test data for another sensor with 20 data points
		sense2 = new TemperatureSensor();
		for(int testTime = 1; testTime <= 20; testTime++) {
			sense2.getData();
		}
	}


	/**
	 * Test method for {@link sensors.TemperatureSensor#TemperatureSensor()}.
	 */
	@Test
	void testTemperatureSensor() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link sensors.TemperatureSensor#TemperatureSensor(double, double)}.
	 */
	@Test
	void testTemperatureSensorDoubleDouble() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link sensors.TemperatureSensor#getData()}.
	 */
	@Test
	void testGetData() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link sensors.TemperatureSensor#allTemperatureIn()}.
	 */
	@Test
	void testAllTemperatureIn() {
		assertTrue(!sense.allTemperatureIn().isEmpty());
		assertNotEquals(sense.allTemperatureIn(),sense2.allTemperatureIn());
	}

	/**
	 * Test method for {@link sensors.TemperatureSensor#allTemperatureOut()}.
	 */
	@Test
	void testAllTemperatureOut() {
		assertTrue(!sense.allTemperatureOut().isEmpty());
		assertNotEquals(sense.allTemperatureOut(),sense2.allTemperatureOut());
	}

}
