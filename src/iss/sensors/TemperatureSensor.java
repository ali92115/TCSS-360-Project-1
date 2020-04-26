package iss.sensors;

import iss.sensors.base.*;

public class TemperatureSensor implements ISensor<TemperatureData> {

    public class TemperatureData {
        private double inner;
        private double outer;
    }
    
    @Override
    public TemperatureData getData()
    {
        return null;
    }
}