/**
 * 
 */
package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import sensors.TemperatureSensor;
import sensors.WindSensor;

/**
 * @author Juan
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
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link sensors.WindSensor#WindSensor(double, double)}.
	 */
	@Test
	void testWindSensorDoubleDouble() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link sensors.WindSensor#getData()}.
	 */
	@Test
	void testGetData() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link sensors.WindSensor#allWindDirection()}.
	 */
	@Test
	void testAllWindDirection() {
		assertTrue(!sense.allWindDirection().isEmpty());
		assertEquals(20, sense.allWindDirection().size());
		assertNotEquals(sense.allWindDirection(), sense2.allWindDirection());
	}

	/**
	 * Test method for {@link sensors.WindSensor#allWindSpeed()}.
	 */
	@Test
	void testAllWindSpeed() {
		assertTrue(!sense.allWindSpeed().isEmpty());
		assertEquals(20, sense.allWindSpeed().size());
		assertNotEquals(sense.allWindSpeed(), sense2.allWindSpeed());
	}

}
