package sensors;

import java.text.DecimalFormat;

/**
 * This class is simulating a very basic simulation of temperature and displays its data
 * using the getData method of our interface.
 * @author Ali Iftakhar
 * @version 4/5/2020
 */

//Feel free to make changes in this class. This is only a basic class written to demonstrate how the 
//sensor classes should be structured. However, make sure that the final result is provided in getData()
//since our main class will call this method. You can change how the random data is derived.
public class TemperatureSensor implements SensorInterface {
	
	/**
	 * Keeps track of every time the thread runs and every 20 seconds counter increments.
	 */
	private int secondsCounter;
	
	
	/**
	 * Keeps track of the temperature inside the house.
	 */
	private double temperatureIn;
	/**
	 * Keeps track of temperature outside the house.
	 */
	private double temperatureOut;
	
	public TemperatureSensor() {
		temperatureIn = 75; //random value chosen based on realistic assumptions.
		temperatureOut = 55; 
		secondsCounter = 0;
		
	}
	
	/**
	 * This method must be implemented. This method will be the one the main class uses
	 * to get an updated value. Data is updated every 20 seconds.
	 */
	public String getData() {
		secondsCounter++;
		System.out.println(secondsCounter);
		// 12-3pm
		if (secondsCounter <= 540) {
			temperatureOut = temperatureOut + Math.random() - Math.random();
			if (secondsCounter >= 525) {
				if (temperatureOut < 58) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 60) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 345) {
				if (temperatureOut < 57) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 59) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 165) {
				if (temperatureOut < 56) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 58) {
					temperatureOut -= .2;
				}
			}
		}
		// 3-6pm
		else if (secondsCounter <= 1080) {
			temperatureOut = temperatureOut + Math.random() - Math.random();
			if (secondsCounter >= 1065) {
				if (temperatureOut < 58) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 60) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 705) {
				if (temperatureOut < 60) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 62) {
					temperatureOut -= .2;
				}
			}
		}
		// 6-9pm
		else if (secondsCounter <= 1620) {
			temperatureOut = temperatureOut + Math.random() - Math.random();
			if (secondsCounter >= 1605) {
				if (temperatureOut < 51) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 53) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 1425) {
				if (temperatureOut < 53) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 55) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 1245) {
				if (temperatureOut < 55) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 57) {
					temperatureOut -= .2;
				}
			}
		}
		// 9pm-12am
		else if (secondsCounter <= 2160) {
			temperatureOut = temperatureOut + Math.random() - Math.random();
			if (secondsCounter >= 2145) {
				if (temperatureOut < 42) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 44) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 1965) {
				if (temperatureOut < 45) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 47) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 1785) {
				if (temperatureOut < 48) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 50) {
					temperatureOut -= .2;
				}
			}
		}
		// 12-3am
		else if (secondsCounter <= 2700) {
			temperatureOut = temperatureOut + Math.random() - Math.random();
			if (secondsCounter >= 2685) {
				if (temperatureOut < 36) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 38) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 2505) {
				if (temperatureOut < 38) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 40) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 2325) {
				if (temperatureOut < 40) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 42) {
					temperatureOut -= .2;
				}
			}
		}
		// 3-6am
		else if (secondsCounter <= 3240) {
			temperatureOut = temperatureOut + Math.random() - Math.random();
			if (secondsCounter >= 3225) {
				if (temperatureOut < 31) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 33) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 3045) {
				if (temperatureOut < 32) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 34) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 2865) {
				if (temperatureOut < 34) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 36) {
					temperatureOut -= .2;
				}
			}
		}
		// 6-9am
		else if (secondsCounter <= 3780) {
			temperatureOut = temperatureOut + Math.random() - Math.random();
			if (secondsCounter >= 3765) {
				if (temperatureOut < 40) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 42) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 3585) {
				if (temperatureOut < 36) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 38) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 3405) {
				if (temperatureOut < 33) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 35) {
					temperatureOut -= .2;
				}
			}
		}
		// 9-12pm
		else if (secondsCounter <= 4320) {
			temperatureOut = temperatureOut + Math.random() - Math.random();
			if (secondsCounter >= 4305) {
				if (temperatureOut < 52) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 56) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 4125) {
				if (temperatureOut < 49) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 51) {
					temperatureOut -= .2;
				}
			}
			else if (secondsCounter >= 3945) {
				if (temperatureOut < 45) {
					temperatureOut += .2;
				}
				else if (temperatureOut > 47) {
					temperatureOut -= .2;
				}
			}
		}
		temperatureIn = temperatureIn + Math.random() - Math.random();
		//Giving structure and keeping answer to 2 decimal places.
		return new DecimalFormat("##.##").format(temperatureOut) + "\n" +  
				new DecimalFormat("##.##").format(temperatureIn);
	}
}