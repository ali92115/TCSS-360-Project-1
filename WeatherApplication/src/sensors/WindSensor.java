package sensors;

import java.text.DecimalFormat;

/**
 * This class simulates a wind sensor.
 * 
 * @author Benjamin Munoz
 *
 */
public class WindSensor implements SensorInterface {

    /**
     * The maximum wind speed in mph.
     */
    private static final double MAX_WIND_SPEED = 200;
    
    /**
     * The format of the wind direction
     */
    private static final DecimalFormat WIND_DIR_FORMAT = new DecimalFormat("###°");
    
    /**
     * The format of the wind speed
     */
    private static final DecimalFormat WIND_SPEED_FORMAT = new DecimalFormat("###mph");
    
    /**
     * The wind direction °, measured clockwise from the North direction
     */
    private double windDirection;
    
    /**
     * The wind speed in mph.
     */
    private double windSpeed;
    
    /**
     * The default constructor. It sets
     * the wind speed and wind direction to 10mph and 0°, 
     * respectively.
     */
    public WindSensor() {
        this(0, 10);
    }
    
    /**
     * The primary constructor. The initial 
     * wind speed (in mph) and wind direction can be set here.
     * 
     * An IllegalArgumentException will be thrown if the wind speed 
     * is negative or exceeds 200mph.
     * 
     * @param dir  -- the initial direction of the wind
     * @param speed -- the initial wind speed
     */
    public WindSensor(double dir, double speed) {
       if (speed < 0 || speed > MAX_WIND_SPEED) {
           throw new IllegalArgumentException("The wind speed must be between 0mph and 200mph");
       }
        
       windDirection = dir % 360;
       if (windDirection < 0) {
           windDirection += 360;
       }
       windSpeed = speed;
    }
    
    /**
     * A string representing the measurements of this wind sensor.
     */
    public String getData() {
        windDirection += (Math.random() * 2) - 1;
        windDirection %= 360;
        if (windDirection < 0) {
            windDirection += 360;
        }
        
        windSpeed += (Math.random() * 2) - 1;
        if (windSpeed < 0) {
            windSpeed = 0;
        } else if (windSpeed > MAX_WIND_SPEED) {
            windSpeed = MAX_WIND_SPEED;
        }
        
        String dirString = WIND_DIR_FORMAT.format(windDirection);
        String speedString = WIND_SPEED_FORMAT.format(windSpeed);
        
        return "{windSpeed: " + speedString + ", windDirection: " + dirString + "}";
    }

}
