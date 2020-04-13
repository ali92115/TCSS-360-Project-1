/**
 * Test class for the TemperatureSensor
 */
package tests;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import sensors.HumiditySensor;
import sensors.TemperatureSensor;
import sensors.WindSensor;

/**
 * @author Jonathan Soledad 
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
		assertThrows(IllegalArgumentException.class, () -> {new TemperatureSensor(-1, 45);});
		assertThrows(IllegalArgumentException.class, () -> {new TemperatureSensor(500, 45);});
		
		assertThrows(IllegalArgumentException.class, () -> {new TemperatureSensor(45, -500);});
		assertThrows(IllegalArgumentException.class, () -> {new TemperatureSensor(45, 500);});
	}

	/**
	 * Test method for {@link sensors.TemperatureSensor#getData()}.
	 */
	@Test
	void testGetData() {
		//TODO {somehow test the IF/ELSE blocks in getData method for full coverage.}
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link sensors.TemperatureSensor#allTemperatureIn()}.
	 */
	@Test
	void testAllTemperatureIn() {
		assertFalse(sense.allTemperatureIn().isEmpty());
		assertNotEquals(sense.allTemperatureIn(),sense2.allTemperatureIn());
	}

	/**
	 * Test method for {@link sensors.TemperatureSensor#allTemperatureOut()}.
	 */
	@Test
	void testAllTemperatureOut() {
		assertFalse(sense.allTemperatureOut().isEmpty());
		assertNotEquals(sense.allTemperatureOut(),sense2.allTemperatureOut());
	}

}
