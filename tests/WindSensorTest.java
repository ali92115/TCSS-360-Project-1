/**
 * Test class for the WindSensor
 */
package tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import sensors.RainSensor;
import sensors.TemperatureSensor;
import sensors.WindSensor;

/**
 * @author Jonathan Soledad
 *
 */
class WindSensorTest {
	static WindSensor sense; 
	static WindSensor sense2; 
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		sense = new WindSensor();
		for(int testTime = 1; testTime <= 20; testTime++) {
			sense.getData();
		}
		
	//test data for another sensor with 20 data points
		sense2 = new WindSensor();
		for(int testTime = 1; testTime <= 20; testTime++) {
			sense2.getData();
		}
	}

	/**
	 * Test method for {@link sensors.WindSensor#WindSensor()}.
	 */
	@Test
	void testWindSensor() {
		assertThrows(IllegalArgumentException.class, () -> {new WindSensor(0, 203);});
		assertThrows(IllegalArgumentException.class, () -> {new WindSensor(0, -10);});
	
	}

	/**
	 * Test method for {@link sensors.WindSensor#getData()}.
	 */
	@Test
	void testGetData() {
		//fail("Not yet implemented");
		//TODO {somehow test the IF/ELSE blocks in getData method for full coverage.}
	}

	/**
	 * Test method for {@link sensors.WindSensor#allWindDirection()}.
	 */
	@Test
	void testAllWindDirection() {
		assertFalse(sense.allWindDirection().isEmpty());
		assertEquals(20, sense.allWindDirection().size());
		assertNotEquals(sense.allWindDirection(), sense2.allWindDirection());
	}

	/**
	 * Test method for {@link sensors.WindSensor#allWindSpeed()}.
	 */
	@Test
	void testAllWindSpeed() {
		assertFalse(sense.allWindSpeed().isEmpty());
		assertEquals(20, sense.allWindSpeed().size());
		assertNotEquals(sense.allWindSpeed(), sense2.allWindSpeed());
	}

}
