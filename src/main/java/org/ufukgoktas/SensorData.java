package org.ufukgoktas;

public class SensorData {
    private String sensorName;
    private double angle;
    private int locationX;
    private int locationY;

    public SensorData(String sensorName, double angle, int xPosition, int yPosition) {
        this.sensorName = sensorName;
        this.angle = angle;
        this.locationX = xPosition;
        this.locationY = yPosition;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public int getLocationX() {
        return locationX;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }
}