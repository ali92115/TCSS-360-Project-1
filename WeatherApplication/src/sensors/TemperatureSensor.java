package sensors;

import java.text.DecimalFormat;

/**
 * This class simulates a temperature sensor.
 * 
 * @author Benjamin Munoz
 * @version 4/5/2020
 */

public class TemperatureSensor implements SensorInterface {
    /**
     * The minimum possible temperature, in Fahrenheit, that the 
     * console can display for the inside of the house.
     * Derived from the specifications.
     */
    private static final double INNER_TEMP_MIN_RANGE = 32;
    
    /**
     * The maximum possible temperature, in Fahrenheit, that the 
     * console can display for the outside of the house.
     */
    private static final double INNER_TEMP_MAX_RANGE = 140;
    
    /**
     * The minimum possible temperature, in Fahrenheit, that the 
     * console can display for the inside of the house.
     */
    private static final double OUTER_TEMP_MIN_RANGE = -40;
    
    /**
     * The maximum possible temperature, in Fahrenheit, that the 
     * console can display for the outside of the house.
     */
    private static final double OUTER_TEMP_MAX_RANGE = 150;
    
    /**
     * The format of the temperature values. This in accordance with the 
     * given limits for the inner and outer temperatures as well as the 
     * listed "resolution" of the data, which is 0.1°F. 
     */
    private static final DecimalFormat TEMP_FORMAT = new DecimalFormat("###.#°F");
    
	/**
	 * The temperature inside the house (in degrees Fahrenheit)
	 */
	private double temperatureIn;
	
	/**
	 * The temperature outside the house (in degrees Fahrenheit)
	 */
	private double temperatureOut;
	
	/**
	 * The default constructor. The sensor starts with an inside 
	 * temperature of 75°F and an outside temperature of 
	 * 42°F. 
	 */
	public TemperatureSensor() {
		this(75, 42);
	}
	
	/**
	 * The primary constructor. It allows the sensor to be set to 
	 * some initial temperatures (in °F).
	 * 
	 * An IllegalArgument Exception will be thrown under the following
	 * conditions:
	 * <ul>
	 *     <li>tIn is less than 32°F or greater than 140°F</li>
	 *     <li>tOut is less than -40°F or greater than 150°F</li>
	 * </ul>
	 * 
	 * @param tIn - The initial inner temperature
	 * @param tOut - The initial outer temperature
	 */
	public TemperatureSensor(double tIn, double tOut) {
	    if (tIn < INNER_TEMP_MIN_RANGE || tIn > INNER_TEMP_MAX_RANGE) {
	        String errString = "The inner temperature can only be between ";
	        errString = errString + INNER_TEMP_MIN_RANGE + " and " + INNER_TEMP_MAX_RANGE;
	        errString = errString + " degrees Fahrenheit";
	        throw new IllegalArgumentException(errString);
	    }
	    
	    if (tOut < OUTER_TEMP_MIN_RANGE || tOut > OUTER_TEMP_MAX_RANGE) {
	        String errString = "The outer temperature can only be between ";
	        errString = errString + OUTER_TEMP_MIN_RANGE + " and " + OUTER_TEMP_MAX_RANGE;
	        errString = errString + " degrees Fahrenheit";
	        throw new IllegalArgumentException(errString);
	    }
	    
	    temperatureIn = tIn;
	    temperatureOut = tOut;
	}
	
	/**
	 * Returns the string representing the temperature, in degrees Fahrenheit,
	 * inside and outside of the house.
	 */
	public String getData() {
		temperatureOut += (Math.random() * 2) - 1;
		temperatureIn += (Math.random() * 2) - 1;
		
		if (temperatureIn < INNER_TEMP_MIN_RANGE) {
		    temperatureIn = INNER_TEMP_MIN_RANGE;
		} else if (temperatureIn > INNER_TEMP_MAX_RANGE) {
		    temperatureIn = INNER_TEMP_MAX_RANGE;
		}
		
		if (temperatureOut < OUTER_TEMP_MIN_RANGE) {
		    temperatureOut = OUTER_TEMP_MIN_RANGE;
		} else if (temperatureOut > OUTER_TEMP_MAX_RANGE) {
		    temperatureOut = OUTER_TEMP_MAX_RANGE;
		}
		
		String outerTempString = TEMP_FORMAT.format(temperatureOut);
		String innerTempString = TEMP_FORMAT.format(temperatureIn);
		
		return "{outsideTemperature: " + outerTempString 
		        + ", insideTemperature: " + innerTempString + "}";  
	}
}
