package org.example;

import org.example.inheritance.Bike;
import org.example.inheritance.Car;
import org.example.inheritance.ElectricCar;
import org.example.linkedList.DoublyLinkedList;
import org.example.list.LinkedListManager;
import org.example.list.VectorManager;
import org.example.properties.PropertiesTryOut;

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