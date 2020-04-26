package iss.sensors;

import iss.sensors.base.*;

public class HumiditySensor implements ISensor<HumiditySensor.HumidityData> {

    public class HumidityData {
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
    public ISensor<HumidityData> Start() {
        return this;
    }

    @Override
    public HumidityData getData() {
        return null;
    }
}