package sensors;

import java.text.DecimalFormat;

public class RainSensor implements SensorInterface {
    /**
     * The rainfall amount format
     */
    private static final DecimalFormat RAINFALL_FORMAT = new DecimalFormat("###.##\"");
    
    /**
     * The amount of rainfall in inches
     */
    private double currentRainfall;
    
    /**
     * The default constructor
     */
    public RainSensor() {
        currentRainfall = 0;
    }
    
    /**
     * The primary constructor. The initial amount, in inches, of rainfall can be set
     * 
     * An IllegalArgumentException will be thrown if curr is negative.
     * 
     * @param curr -- the initial rainfall amount in inches
     */
    public RainSensor(double curr) {
        if (curr < 0) {
            throw new IllegalArgumentException("The amount of rainfall cannot be negative");
        }
        
        currentRainfall = curr;
    }
    
    /**
     * Returns the amount of rainfall as a string
     */
    public String getData() {
        if (Math.random() > 0.9) {
            currentRainfall = Math.random() * 0.04;
        } else {
            currentRainfall = 0;
        }
        return "{rainfall: " + RAINFALL_FORMAT.format(currentRainfall) + "}";
    }

}
