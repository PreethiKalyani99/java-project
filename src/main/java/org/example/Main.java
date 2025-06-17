package org.example;

import org.example.rover.Direction;
import org.example.rover.MarsRover;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MarsRover marsrover = new MarsRover(5,5);

        marsrover.setPosition(3,3, Direction.E);
        System.out.println(marsrover.processCommands("MMRMMdgegreRMRRM"));
    }
}