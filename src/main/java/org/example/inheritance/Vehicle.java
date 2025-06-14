package org.example.inheritance;

public abstract class Vehicle {
    private int speed;

    public void setSpeed (int speed) {
        this.speed = Math.max(0, speed);
    }

    public int getSpeed () {
        return speed;
    }

    public abstract void increaseSpeed();
    public abstract void decreaseSpeed();
}
