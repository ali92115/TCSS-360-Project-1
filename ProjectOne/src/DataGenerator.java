import java.text.DecimalFormat;

public class DataGenerator {
	private static double temperatureOut;
	
	private static double temperatureIn;
	
	public DataGenerator() {
		temperatureOut = 42;
		temperatureIn = 75;
	}
	
	public String getTemperatureOut() {
		temperatureOut = temperatureOut + Math.random() - Math.random();
		return new DecimalFormat("##.##").format(temperatureOut);
	}
	
	public String getTemperatureIn() {
		temperatureIn = temperatureIn + Math.random() - Math.random();
		return new DecimalFormat("##.##").format(temperatureIn);
	}
}
