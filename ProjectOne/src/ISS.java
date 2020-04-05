import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ISS {
	
	public static void main(String[] args) {
		DataGenerator provider = new DataGenerator();
		while(true) {
			System.out.println("Temperature In: " + provider.getTemperatureIn());
			System.out.println("Temperature Out: " + provider.getTemperatureOut());
			System.out.println("Time: " + new Date());
			try {
				TimeUnit.SECONDS.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
