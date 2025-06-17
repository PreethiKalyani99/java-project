package org.example.marsrover;

import java.util.Map;

public class MarsRover {
   private static final Map<Character, Integer> DIRECTION_MAP = Map.of(
           'N', 1,
            'E', 2,
           'S', 3,
           'W', 4
   );

    private final int maxX;
    private final int maxY;

    public MarsRover (int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    int x = 0;
    int y = 0;
    int facing = DIRECTION_MAP.get('N');

    public boolean isOutOfBounds (int x, int y) {
        return x < 0 || y < 0 || x > maxX || y > maxY;
    }

    public void setPosition (int x, int y, Character facing) {
        if (isOutOfBounds(x, y)) return;
        if(!DIRECTION_MAP.containsKey(facing)) return;

        this.x = x;
        this.y = y;
        this.facing = DIRECTION_MAP.get(facing);
    }

    private void setPosition (int x, int y) {
        if (isOutOfBounds(x, y)) return;

        this.x = x;
        this.y = y;
    }

    public char getDirection (int facingValue) {
        return DIRECTION_MAP.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == facingValue)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }

    public String getCurrentPosition () {
        char direction = getDirection(facing);
        return String.format("%d %d %s", this.x, this.y, direction);
    }

    public String processCommands (String commands) {
        commands = commands.toUpperCase();

        for (int i = 0; i < commands.length(); i++) {
            move(commands.charAt(i));
        }
        return getCurrentPosition();
    }

    public void move (char command) {
        switch (command) {
            case 'L':
                turnLeft();
                break;
            case 'R':
                turnRight();
                break;
            case 'M':
                moveForward();
                break;
            default:
                break;
        }
    }

     public void turnLeft () {
        facing = (facing - 1) < 1 ? DIRECTION_MAP.get('W') : facing - 1;
     }

     public void turnRight () {
        facing = (facing + 1) > DIRECTION_MAP.get('W') ? DIRECTION_MAP.get('N') : facing + 1;
     }

     public void moveForward () {
        switch (facing) {
            case 1:
                setPosition(this.x, this.y + 1);
                break;
            case 2:
                setPosition(this.x + 1, this.y);
                break;
            case 3:
                setPosition(this.x, this.y - 1);
                break;
            case 4:
                setPosition(this.x - 1, this.y);
                break;
            default:
                break;
        }
     }
}
