package org.example.rover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MarsRoverTest {
    MarsRover marsRover = new MarsRover(5, 5);

    @Nested
    class MovementTests {

        @BeforeEach
        void setUp () {
            marsRover.setPosition(1,2, Direction.N);
        }

        @Test
        void shouldMoveForwardWhenCommandIsM () {
            assertEquals("1 3 N", marsRover.processCommands("M"));
        }

        @Test
        void shouldRotateLeftWhenCommandIsL () {
            assertEquals("1 2 W", marsRover.processCommands("L"));
        }

        @Test
        void shouldRotateRightWhenCommandIsR () {
            assertEquals("1 2 E", marsRover.processCommands("R"));
        }

        @Test
        void shouldNotMoveIfCommandIsInvalid () {
            assertEquals("1 2 N", marsRover.processCommands("wq"));
        }
    }

    @Nested
    class SequenceCommandsTest {

        @Test
        void shouldReachExpectedPositionAfterValidCommandSequence () {
            marsRover.setPosition(1,2, Direction.N);
            assertEquals("1 3 N", marsRover.processCommands("LMLMLMLMM"));
        }

        @Test
        void shouldIgnoreInvalidCommandsInTheSequence () {
            marsRover.setPosition(3,3, Direction.E);
            assertEquals("5 1 S", marsRover.processCommands("MMWRMasMRoMRRMR"));
        }
    }

    @Nested
    class BoundaryTest {

        @BeforeEach
        void setUp () {
            marsRover.setPosition(3,3,Direction.E);
        }

        @Test
        void shouldNotMoveBeyondBoundaryAlongXAxisLeft () {
            assertEquals("0 3 W", marsRover.processCommands("RRMMMMMM"));
        }

        @Test
        void shouldNotMoveBeyondBoundaryAlongXAxisRight () {
            assertEquals("5 3 E", marsRover.processCommands("RRRRMMMMMM"));
        }

        @Test
        void shouldNotMoveBeyondBoundaryAlongYAxisUpper () {
            assertEquals("0 5 N", marsRover.processCommands("RRMMMMRMMMMM"));
        }

        @Test
        void shouldNotMoveBeyondBoundaryAlongYAxisLower () {
            assertEquals("0 0 S", marsRover.processCommands("RRMMMMLMMMMM"));
        }
    }
}
