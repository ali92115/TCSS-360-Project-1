package iss;

import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import iss.sensors.base.*;
import iss.sensors.*;

/**
 * This is the ISS application, which will capture data generated by from
 * sensors.
 * 
 * @author Phong Hoang Le
 * @version 1.0
 */
public class ISS {
	private final ArrayList<ISensor<?>> sensors;

	public ISS() {
		sensors = new ArrayList<>();
		sensors.add(new RainSensor().Start());
		sensors.add(new TemperatureSensor().Start());
		sensors.add(new WindSensor().Start());
		sensors.add(new HumiditySensor().Start());
	}

	public void run() {
		var task = new TimerTask() {
			@Override
			public void run() {
				StringBuilder output = new StringBuilder();
				output.append("Timestamp: ").append(new Date()).append("\n");
				for(ISensor<?> sensor: sensors)
				{
					output.append(sensor.getData().toString());
					output.append("\n");
				}
				System.out.println(output);
				System.out.println();
			}
		};
		var myTimer = new Timer();
		myTimer.schedule(task, 0, 10000);
	}
}