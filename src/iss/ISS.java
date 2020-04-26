package iss;

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
	private List<ISensor<object>> sensors;

	public ISS() {
		sensors = new List<ISensor<object>>();
		sensors.Add(new RainSensor());
		sensors.Add(new TemperatureSensor());
		sensors.Add(new WindSensor());
		sensors.Add(new HumiditySensor());
	}

	public void run() {
		var task = new TimerTask()
		{
			String output;

			for(ISensor<object> sensor: sensors)
			{
				output+= sensor.getData().toString();
				output+="\n";
			}
			System.out.println(output);
			System.out.println();
		};
		var myTimer = new Timer();
		myTimer.schedule(task, 0, 10000);
	}
}