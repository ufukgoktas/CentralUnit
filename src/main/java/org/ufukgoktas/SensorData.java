package org.ufukgoktas;

public class SensorData {
    private String sensorName;
    private double angle;
    private int xPosition;
    private int yPosition;

    public SensorData(String sensorName, double angle, int xPosition, int yPosition) {
        this.sensorName = sensorName;
        this.angle = angle;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
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

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}