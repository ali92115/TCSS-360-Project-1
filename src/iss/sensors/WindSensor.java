package iss.sensors;
import iss.sensors.base.*;

public class WindSensor implements ISensor<WindSensor.WindData> {
    private WindData windData;
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
        @Override
        public String toString() {
            return "Wind Sensor\n" +
                    "Speed: " + speed + "\n" +
                    "Direction: " + direction + "\n";
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
        windData = new WindData();
        windData.speed = 13;
        windData.direction = Direction.NORTHWEST;
        return this;
    }

    @Override
    public WindData getData() {
        return windData;
    }
}