package iss.sensors;
import iss.sensors.base.*;

public class WindSensor implements ISensor<WindSensor.WindData> {

    public static class WindData {
        private double speed;
        private Direction direction;

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public Direction getDirection() {
            return direction;
        }

        public void setDirection(Direction direction) {
            this.direction = direction;
        }
    }

    public enum Direction
    {
        NORTH,
        NORTHEAST,
        EAST,
        SOUTHEAST,
        SOUTH,
        SOUTHWEST,
        WEST,
        NORTHWEST
    }

    @Override
    public ISensor<WindData> Start() {
        return this;
    }

    @Override
    public WindData getData() {
        return null;
    }
}