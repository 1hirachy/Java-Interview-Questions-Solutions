package design.pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import system.design.elevator.enums.FloorNumber;
import system.design.elevator.models.*;

import java.util.Arrays;
import java.util.List;

public class ElevatorSystemTest {

    private Elevator elevator;
    private ElevatorSystem elevatorSystem;


    @BeforeEach
    void setUp(){
        elevatorSystem = ElevatorSystem.getInstance();

        elevator = new Elevator();
        elevator.setCurrentFloorNumber(FloorNumber.FLOOR_NUMBER_ONE);
        elevator.setDoor(new Door());
        elevator.setInsidePannel(new InsidePanel());


        Floor floor1 = new Floor(FloorNumber.FLOOR_NUMBER_ONE, null);
        Floor floor2 = new Floor(FloorNumber.FLOOR_NUMBER_ELEVEN, null);


        elevatorSystem.setElevators(List.of(elevator));
        elevatorSystem.setFloors(Arrays.asList(floor1, floor2));
    }


    // Test to verify Singleton property
    @Test
    void testSingletonInstance(){
        ElevatorSystem newInstance = ElevatorSystem.getInstance();
        Assertions.assertSame(elevatorSystem, newInstance, "ElevatorSystem should follow singleton pattern");
    }
}
