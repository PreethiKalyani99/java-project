package org.example.rover;

public class MarsRover implements Rover{
  private final Position position;
  private Direction direction;

  public MarsRover (int maxX, int maxY) {
      this.position = new Position(maxX, maxY);
      this.direction = Direction.N;
  }

  public void setPosition (int x, int y, Direction direction) {
      this.direction = direction;
      position.set(x,y);
  }

  @Override
  public String processCommands (String commands) {
      for (char c: commands.toUpperCase().toCharArray()) {
          switch (c) {
              case 'L' -> direction = direction.turnLeft();
              case 'R' -> direction = direction.turnRight();
              case 'M' -> position.move(direction);
          }
      }

      return position.toString(direction);
  }
}
