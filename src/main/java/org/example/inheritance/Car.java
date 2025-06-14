package org.example.inheritance;

public class Car extends Vehicle{
    public void increaseSpeed () {
        setSpeed(getSpeed() + 2);
    }

    public void decreaseSpeed () {
        if(getSpeed() <= 0) return;

        super.setSpeed(getSpeed() - 2);
    }
}
