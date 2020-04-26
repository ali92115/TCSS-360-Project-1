package iss.sensors;

import iss.sensors.base.*;

public class RainSensor implements ISensor<RainSensor.RainData> {
    private RainData rainData;
    public static class RainData {
        private double currentRainfall;

        public double getCurrentRainfall() {
            return currentRainfall;
        }

        public void setCurrentRainfall(double currentRainfall) {
            this.currentRainfall = currentRainfall;
        }
        @Override
        public String toString() {
            return "Rain Sensor\n" +
                    "Current Rainfall: " + currentRainfall + "\n";
        }
    }

    @Override
    public ISensor<RainData> Start() {
        rainData = new RainData();
        rainData.currentRainfall = 25;
        return this;
    }

    @Override
    public RainData getData() {
        return rainData;
    }
}