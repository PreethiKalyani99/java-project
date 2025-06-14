package org.example.inheritance;

public class ElectricCar extends Vehicle{
    private int batteryLevel = 100;

    public void increaseSpeed () {
        setSpeed(getSpeed() + 2);
        batteryLevel -= 2;
    }

    public void decreaseSpeed () {
        if(getSpeed() <= 0) return;
        if (batteryLevel <= 0) throw new IllegalStateException("Battery is drained!");

        setSpeed(getSpeed() - 1);
        batteryLevel -= 1;
    }

    public int getBatteryLevel () {
        return batteryLevel;
    }
}
