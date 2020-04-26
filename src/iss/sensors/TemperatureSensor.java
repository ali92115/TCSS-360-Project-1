package iss.sensors;

import iss.sensors.base.*;

public class TemperatureSensor implements ISensor<TemperatureSensor.TemperatureData> {

    public class TemperatureData {
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
    }

    @Override
    public ISensor<TemperatureData> Start() {
        return this;
    }

    @Override
    public TemperatureData getData()
    {
        return null;
    }
}