package org.example.rover;

public class Position {
    private int x;
    private int y;
    private final int maxX;
    private final int maxY;

    public Position (int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public boolean isOutOfBounds (int x, int y) {
        return x < 0 || y < 0 || x > maxX || y > maxY;
    }

    public void move (Direction direction) {
        int newX = x;
        int newY = y;

        switch (direction) {
            case N -> newY++;
            case E -> newX++;
            case S -> newY--;
            case W -> newX--;
        }

        if (isOutOfBounds(newX, newY)) return;

        this.x = newX;
        this.y = newY;
    }

    public String toString (Direction direction) {
        return String.format("%d %d %s", x, y, direction.name());
    }

    public void set (int x, int y) {
        if (!isOutOfBounds(x, y)) {
            this.x = x;
            this.y = y;
        }
    }
}
