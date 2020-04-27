package iss.sensors;

import iss.sensors.base.*;

public class HumiditySensor implements ISensor<HumiditySensor.HumidityData> {

    private HumidityData humidityData;
    public static class HumidityData {
        private double inner;
        private double outer;

        public double getInner() {
            return inner;
        }

        public void setInner(double inner) {
            this.inner = inner;
        }

        public double getOuter() {
            return outer;
        }

        public void setOuter(double outer) {
            this.outer = outer;
        }

        @Override
        public String toString() {
            return "Humidity Sensor\n" +
                    "Inner Humidity: " + inner + "\n" +
                    "Outer Humidity: " + outer + "\n";
        }
    }

    @Override
    public ISensor<HumidityData> Start() {
        humidityData = new HumidityData();
        humidityData.inner = 25;
        humidityData.outer = 26;
        return this;
    }

    @Override
    public HumidityData getData() {
        return humidityData;
    }
}