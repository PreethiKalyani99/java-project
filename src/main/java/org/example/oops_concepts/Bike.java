package org.example.oops_concepts;

public class Bike extends Vehicle{
    public void increaseSpeed () {
        setSpeed(getSpeed() + 4);
    }

    public void decreaseSpeed () {
        if(getSpeed() <= 0) return;

        setSpeed(getSpeed() - 4);
    }
}
