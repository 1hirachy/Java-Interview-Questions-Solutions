package design.pattern;

import org.junit.jupiter.api.Test;
import system.design.elevator.Main;
import system.design.elevator.enums.Direction;
import system.design.elevator.enums.DoorAction;
import system.design.elevator.enums.ElevatorNumber;
import system.design.elevator.enums.FloorNumber;
import system.design.elevator.models.Display;
import system.design.elevator.models.Door;
import system.design.elevator.models.Elevator;
import system.design.elevator.models.InsidePannel;

import static org.junit.jupiter.api.Assertions.*;

public class ElevatorTest {

    @Test
    void testDoorOperation(){
        Door door = new Door(DoorAction.OPEN);
    }



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
    @Test
    void shouldExecuteWithoutExceptions() {
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
    */


}
