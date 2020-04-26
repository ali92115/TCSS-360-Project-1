package sensors;
import java.util.concurrent.TimeUnit;

public class mymain {
	public static void main(String[] args) {
		HumiditySensor provider = new HumiditySensor();
		RainSensor rain = new RainSensor();
		WindSensor wind = new WindSensor();
		TemperatureSensor temperature = new TemperatureSensor();
		while(true) {
			System.out.println(provider.getData());
			System.out.println(rain.getData());
			System.out.println(wind.getData());
			System.out.println(temperature.getData());
			System.out.println(provider.allOuterHum());
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
