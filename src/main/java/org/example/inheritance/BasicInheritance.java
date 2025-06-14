package org.example.inheritance;

// Parent will hold the shared state. Here speed is shared state

class Vehicle {
    private int speed;

    public void setSpeed (int speed) {
        this.speed = speed;
    }

    public int getSpeed () {
        return speed;
    }
}

class Car1 extends Vehicle {

    public void increaseSpeed () {
        setSpeed(getSpeed() + 2);
    }

    public void decreaseSpeed () {
        if(getSpeed() <= 0) return;

        setSpeed(getSpeed() - 2);
    }
}

class Car2 extends Vehicle {

    public void increaseSpeed () {
        setSpeed(getSpeed() + 4);
    }

    public void decreaseSpeed () {
        if(getSpeed() <= 0) return;

        setSpeed(getSpeed() - 4);
    }
}

class ElectricCar extends Vehicle {
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

public class BasicInheritance {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.increaseSpeed();
        car1.increaseSpeed();
        System.out.println("Car1: " + car1.getSpeed());

        Car2 car2 = new Car2();
        car2.increaseSpeed();
        System.out.println("Car2: " + car2.getSpeed());

        ElectricCar eCar = new ElectricCar();
        eCar.increaseSpeed();
        eCar.increaseSpeed();
        eCar.decreaseSpeed();
        System.out.println("ElectricCar: speed = " + eCar.getSpeed() + ", battery level = " + eCar.getBatteryLevel() + "%");
    }
}
