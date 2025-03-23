package design.pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import system.design.elevator.enums.Direction;
import system.design.elevator.enums.ElevatorNumber;
import system.design.elevator.enums.FloorNumber;
import system.design.elevator.models.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexElevatorSystemTest {

    private ElevatorSystem elevatorSystem;
    private Elevator elevator1;
    private Elevator elevator2;
    private Elevator elevator3;

    @BeforeEach
    void setUP() {

        elevatorSystem = ElevatorSystem.getInstance();

        // Initializing them at different floors
        elevator1 = new Elevator(ElevatorNumber.ELEVATOR_NUMBER_ONE, new Door(), new insidePanel(), new Display(), FloorNumber.FLOOR_NUMBER_ONE, Direction.IDLE);
        elevator2 = new Elevator(ElevatorNumber.ELEVATOR_NUMBER_TWO, new Door(), new insidePanel(), new Display(), FloorNumber.FLOOR_NUMBER_SEVEN, Direction.IDLE);
        elevator3 = new Elevator(ElevatorNumber.ELEVATOR_NUMBER_THREE, new Door(), new insidePanel(), new Display(), FloorNumber.FLOOR_NUMBER_ELEVEN, Direction.IDLE);

        Floor floor1 = new Floor(FloorNumber.FLOOR_NUMBER_ONE, null);
        Floor floor5 = new Floor(FloorNumber.FLOOR_NUMBER_FIVE, null);
        Floor floor11 = new Floor(FloorNumber.FLOOR_NUMBER_ELEVEN, null);


        elevatorSystem.setElevators(Arrays.asList(elevator1, elevator2, elevator3));
        elevatorSystem.setFloors(Arrays.asList(floor1, floor5, floor11));
    }


    /**
     * Test case to ensure multiple elevators are handled efficiently
     */
    @Test
    void testRequestClosestElevator() {
        Elevator requestedElevator = elevatorSystem.requestElevator(Direction.UP, new Floor(FloorNumber.FLOOR_NUMBER_EIGHT, null));

        assertNotNull(requestedElevator, "An elevator should be assigned");
        assertEquals(ElevatorNumber.ELEVATOR_NUMBER_TWO, requestedElevator.getElevatorNumber(),
                "Elevator 2 (closer) should be assigned instead of elevator 1");

    }


    /**
     * Test case to verify elevator doesn't take invalid floor inputs
     */
    @Test
    void testInvalidFloorRequest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            elevatorSystem.selectFloor(null, elevator1); // Passing null simulates an invalid floor selection
        });

        System.out.println("Exception Message: " + exception.getMessage());

        assertTrue(exception.getMessage().contains("Invalid floor number"),
                "Should throw exception for invalid floor selection");
    }

    /**
     * Test case to check elevator moving to the right direction
     */
    @Test
    void testElevatorDirection() {
        elevator1.setCurrentDirection(Direction.UP);
        assertEquals(Direction.UP, elevator1.getCurrentDirection(), "Elevator direction should be UP");

        elevator2.setCurrentDirection(Direction.IDLE);
        assertEquals(Direction.IDLE, elevator2.getCurrentDirection(), "Elevator direction should be IDLE");

        elevator3.setCurrentDirection(Direction.DOWN);
        assertEquals(Direction.DOWN, elevator3.getCurrentDirection(), "Elevator direction should be DOWN");
    }

    /**
     * Test case for handling multiple elevator request
     */
    @Test
    void testMultipleElevatorRequest() {

        Elevator firstRequest = elevatorSystem.requestElevator(Direction.UP, new Floor(FloorNumber.FLOOR_NUMBER_EIGHT, null));
        Elevator secondRequest = elevatorSystem.requestElevator(Direction.UP, new Floor(FloorNumber.FLOOR_NUMBER_ELEVEN, null));

        assertNotNull(firstRequest, "First request should be assigned to an elevator");
        assertNotNull(secondRequest, "Second request should also be assigned an elevator");
        assertNotEquals(firstRequest, secondRequest, "There should be two different elevators completing the request");

    }

    /**
     * Test case to simulate all elevators are busy
     */
    @Test
    void testIfAllElevatorsAreBusy() {

        elevator1.setCurrentDirection(Direction.UP);
        elevator2.setCurrentDirection(Direction.UP);
        elevator3.setCurrentDirection(Direction.UP);

        Elevator newRequest = elevatorSystem.requestElevator(Direction.DOWN, new Floor(FloorNumber.FLOOR_NUMBER_ONE, null));
        assertNull(newRequest, "Should return null if all elevators are busy");
    }


    /**
     * Test case associated with elevator reaching towards destination
     */
    @Test
    void testingElevatorReachesDestination() {
        Elevator assignedElevator = elevatorSystem.requestElevator(Direction.DOWN, new Floor(FloorNumber.FLOOR_NUMBER_THREE, null));
        assertNotNull(assignedElevator, "An elevator should be assigned");

        assignedElevator.setCurrentFloorNumber(FloorNumber.FLOOR_NUMBER_SEVEN);
        assertEquals(FloorNumber.FLOOR_NUMBER_SEVEN, assignedElevator.getCurrentFloorNumber());
    }


}
