package org.ufukgoktas;

public class PositionCalculator {
    public static void calculateRelativePosition(SensorData sensorData1, SensorData sensorData2) {

        int relativeX1 = sensorData1.getxPosition();
        int relativeY1 = sensorData1.getyPosition();
        double angle1 = Math.toRadians(sensorData1.getAngle());


        int relativeX2 = sensorData2.getxPosition();
        int relativeY2 = sensorData2.getyPosition();
        double angle2 = Math.toRadians(sensorData2.getAngle());

        double targetX = (relativeX2 * Math.tan(angle2) - relativeX1 * Math.tan(angle1)) / (Math.tan(angle2) - Math.tan(angle1));
        double targetY = (relativeY2 * Math.tan(angle2) - relativeY1 * Math.tan(angle1)) / (Math.tan(angle2) - Math.tan(angle1));

        System.out.println("Target Location - X: " + targetX + ", Y: " + targetY);
    }


}
