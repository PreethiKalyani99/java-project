package org.example.rover;

public enum Direction {
    N, E, S, W;

    public Direction turnLeft () {
        return values()[(this.ordinal() + 3) % 4];
    }

    public Direction turnRight () {
        return values()[(this.ordinal() + 1) % 4];
    }
}
