package org.example;

import org.example.marsrover.MarsRover;
import org.example.oops_concepts.Bike;
import org.example.oops_concepts.Car;
import org.example.oops_concepts.ElectricCar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MarsRover marsrover = new MarsRover(5,5);

        marsrover.setPosition(1,2, 'N');
        System.out.println(marsrover.processCommands("LMLAMLMLMMAMMRRRRRM"));
    }
}