package iss.sensors;

import iss.sensors.base.*;

public class RainSensor implements ISensor<RainData> {
    public class RainData {
        private double currentRainfall;
    }

    @Override
    public RainData getData() {
        return null;
    }
}