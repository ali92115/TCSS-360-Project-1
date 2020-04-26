package iss.sensors;

import iss.sensors.base.*;

public class RainSensor implements ISensor<RainSensor.RainData> {

    public class RainData {
        private double currentRainfall;

        public double getCurrentRainfall() {
            return currentRainfall;
        }

        public void setCurrentRainfall(double currentRainfall) {
            this.currentRainfall = currentRainfall;
        }
    }

    @Override
    public ISensor<RainData> Start() {
        return this;
    }

    @Override
    public RainData getData() {
        return null;
    }
}