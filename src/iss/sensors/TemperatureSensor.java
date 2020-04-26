package iss.sensors;

import iss.sensors.base.*;

public class TemperatureSensor implements ISensor<TemperatureSensor.TemperatureData> {
    private TemperatureData temperatureData;
    public static class TemperatureData {
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
            return "Temperature Sensor\n" +
                    "Inner Temperature: " + inner + "\n" +
                    "Outer Temperature: " + outer + "\n";
        }
    }

    @Override
    public ISensor<TemperatureData> Start() {
        temperatureData = new TemperatureData();
        temperatureData.inner = 38;
        temperatureData.outer = 35;
        return this;
    }

    @Override
    public TemperatureData getData()
    {
        return temperatureData;
    }
}