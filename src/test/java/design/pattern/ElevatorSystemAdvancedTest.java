package design.pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import system.design.elevator.enums.Direction;
import system.design.elevator.enums.ElevatorNumber;
import system.design.elevator.enums.FloorNumber;
import system.design.elevator.models.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class ElevatorSystemAdvancedTest {

    private ElevatorSystem elevatorSystem;
    private Elevator elevator1;
    private Elevator elevator2;
    private Elevator elevator3;

    @BeforeEach
    void setUP(){

        elevatorSystem  = ElevatorSystem.getInstance();

        // Initializing them at different floors
        elevator1 = new Elevator(ElevatorNumber.ELEVATOR_NUMBER_ONE, new Door(), new insidePanel(), new Display(), FloorNumber.FLOOR_NUMBER_ONE, Direction.IDLE);
        elevator2 = new Elevator(ElevatorNumber.ELEVATOR_NUMBER_TWO, new Door(), new insidePanel(), new Display(), FloorNumber.FLOOR_NUMBER_SEVEN, Direction.IDLE);
        elevator3 = new Elevator(ElevatorNumber.ELEVATOR_NUMBER_THREE, new Door(), new insidePanel(), new Display(), FloorNumber.FLOOR_NUMBER_ELEVEN, Direction.IDLE);

        Floor floor1 = new Floor(FloorNumber.FLOOR_NUMBER_ONE, null);
        Floor floor5 = new Floor(FloorNumber.FLOOR_NUMBER_FIVE, null);
        Floor floor11 = new Floor(FloorNumber.FLOOR_NUMBER_ELEVEN, null);


        elevatorSystem.setElevators(Arrays.asList(elevator1, elevator2));
        elevatorSystem.setFloors(Arrays.asList(floor1, floor5, floor11));
    }


    /**
     * Test case to ensure multiple elevators are handled efficiently
     */
    @Test
    void testRequestClosestElevator(){
        Elevator requestedElevator = elevatorSystem.requestElevator(Direction.UP, new Floor(FloorNumber.FLOOR_NUMBER_FOURTEEN, null));

        assertNotNull(requestedElevator, "An elevator should be assigned");
        assertEquals(ElevatorNumber.ELEVATOR_NUMBER_TWO, requestedElevator.getElevatorNumber(),
                            "Elevator 2 (closer) should be assigned instead of elevator 1");

    }


    /** Test case to verify elevator doesn't take invalid floor inputs */
    @Test
    void testInvalidFloorRequest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            elevatorSystem.selectFloor(null, elevator1); // Passing null simulates an invalid floor selection
        });

        System.out.println("Exception Message: " + exception.getMessage());

        assertTrue(exception.getMessage().contains("Invalid floor number"),
                "Should throw exception for invalid floor selection");
    }
}
