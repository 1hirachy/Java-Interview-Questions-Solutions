package design.pattern;

import org.junit.jupiter.api.Test;
import system.design.elevator.enums.Direction;
import system.design.elevator.enums.ElevatorNumber;
import system.design.elevator.enums.FloorNumber;
import system.design.elevator.models.Elevator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ElevatorTest {


    @Test
    void testElevatorSettersAndGetters() {
        Elevator elevator = new Elevator();

        elevator.setElevatorNumber(ElevatorNumber.ELEVATOR_NUMBER_ONE);
        elevator.setCurrentFloorNumber(FloorNumber.FLOOR_NUMBER_FIVE);
        elevator.setCurrentDirection(Direction.DOWN);

        assertEquals(ElevatorNumber.ELEVATOR_NUMBER_ONE, elevator.getElevatorNumber());
        assertEquals(FloorNumber.FLOOR_NUMBER_FIVE, elevator.getCurrentFloorNumber());
        assertEquals(Direction.DOWN, elevator.getCurrentDirection());
    }


    @Test
    void testElevatorMovesToCorrectFloor() {
        Elevator elevator = new Elevator();

        elevator.setCurrentFloorNumber(FloorNumber.FLOOR_NUMBER_FIVE);
        assertEquals(FloorNumber.FLOOR_NUMBER_FIVE, elevator.getCurrentFloorNumber());
    }


    @Test
    void testDirectionChange() {
        Elevator elevator = new Elevator();

        elevator.setCurrentDirection(Direction.UP);
        assertEquals(Direction.UP, elevator.getCurrentDirection());

        elevator.setCurrentDirection(Direction.DOWN);
        assertEquals(Direction.DOWN, elevator.getCurrentDirection());
    }

    @Test
    void testInvalidFloorAssignment() {
        Elevator elevator = new Elevator();

        assertThrows(IllegalArgumentException.class, () -> {
            elevator.setCurrentFloorNumber(null);
        });
    }

    /**
     Run this test to check if the application running as expected
     @Test void shouldExecuteWithoutExceptions() {
     assertDoesNotThrow(() -> Main.main(new String[]{}));
     }
     */


}
