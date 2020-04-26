package iss.sensors;

import iss.sensors.base.*;

public class HumiditySensor implements ISensor<HumidityData> {
    public class HumidityData {
        private double inner;
        private double outer;
    }

    @Override
    public HumidityData getData() {
        return null;
    }
}