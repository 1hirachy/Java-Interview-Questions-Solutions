package design.pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import system.design.elevator.enums.Direction;
import system.design.elevator.enums.FloorNumber;
import system.design.elevator.models.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ElevatorSystemTest {

    private Elevator elevator;
    private ElevatorSystem elevatorSystem;


    @BeforeEach
    void setUp() {
        elevatorSystem = ElevatorSystem.getInstance();

        elevator = new Elevator();
        elevator.setCurrentFloorNumber(FloorNumber.FLOOR_NUMBER_ONE);
        elevator.setDoor(new Door());
        elevator.setInsidePanel(new insidePanel());


        Floor floor1 = new Floor(FloorNumber.FLOOR_NUMBER_ONE, null);
        Floor floor2 = new Floor(FloorNumber.FLOOR_NUMBER_ELEVEN, null);


        elevatorSystem.setElevators(List.of(elevator));
        elevatorSystem.setFloors(Arrays.asList(floor1, floor2));
    }


    // Test to verify Singleton property
    @Test
    void testSingletonInstance() {
        ElevatorSystem newInstance = ElevatorSystem.getInstance();
        Assertions.assertSame(elevatorSystem, newInstance, "ElevatorSystem should follow singleton pattern");
    }

    @Test
    void testRequestClosestElevator() {
        Elevator requestedElevator = elevatorSystem.requestElevator(Direction.UP, new Floor(FloorNumber.FLOOR_NUMBER_FOURTEEN, null));
        assertNotNull(requestedElevator, "An Elevator should be assigned");
    }

    @Test
    void testDoorOperations() {
        assertFalse(elevator.getDoor().isOpen(), "Door should be initially closed");

        elevatorSystem.openDoor(elevator);
        assertTrue(elevator.getDoor().isOpen(), "Door should be open after calling openDoor()");
    }


    @Test
    void testSelectFloor() {
        elevatorSystem.selectFloor(FloorNumber.FLOOR_NUMBER_ELEVEN, elevator);
        assertTrue(elevator.getInsidePanel().isFloorButtonPressed(FloorNumber.FLOOR_NUMBER_ELEVEN.ordinal()));
    }

    /**
     * Test requesting an elevator when none are available
     */
    @Test
    void testRequestElevatorWhenNoneAvailable() {
        elevatorSystem.setElevators(List.of()); //no elevators available
        Elevator requestedElevator = elevatorSystem.requestElevator(Direction.UP, new Floor(FloorNumber.FLOOR_NUMBER_EIGHT, null));

        assertNull(requestedElevator, "Should be null if no elevator available");
    }
}
