package org.example;

import org.example.oops_concepts.Bike;
import org.example.oops_concepts.Car;
import org.example.oops_concepts.ElectricCar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        System.out.println("Car: " + car.getSpeed());

        Bike bike = new Bike();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.decreaseSpeed();
        System.out.println("Bike: " + bike.getSpeed());

        ElectricCar eCar = new ElectricCar();
        eCar.increaseSpeed();
        eCar.increaseSpeed();
        eCar.decreaseSpeed();
        System.out.println("ElectricCar: speed = " + eCar.getSpeed() + ", battery level = " + eCar.getBatteryLevel() + "%");
    }
}