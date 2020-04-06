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
	 * Keeps track of the temperature inside the house.
	 */
	private double temperatureIn;
	/**
	 * Keeps track of temperature outside the house.
	 */
	private double temperatureOut;
	
	public TemperatureSensor() {
		temperatureIn = 75; //random value chosen based on realistic assumptions.
		temperatureOut = 42; 
	}
	
	/**
	 * This method must be implemented. This method will be the one the main class uses
	 * to get an updated value.
	 */
	public String getData() {
		temperatureOut = temperatureOut + Math.random() - Math.random();
		temperatureIn = temperatureIn + Math.random() - Math.random();
		//Giving structure and keeping answer to 2 decimal places.
		return new DecimalFormat("##.##").format(temperatureOut) + "\n" +  
				new DecimalFormat("##.##").format(temperatureIn);
	}
}

