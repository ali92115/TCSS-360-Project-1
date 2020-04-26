package iss.sensors;
import iss.sensors.base.*;

public class WindSensor implements ISensor<WindData> {
    public class WindData {
        private double speed;
        private Direction direction;
    }

    public enum Direction
    {

    }

    @Override
    public WindData getData() {
        return null;
    }
}