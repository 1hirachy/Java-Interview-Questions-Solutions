package design.pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import system.design.elevator.enums.Direction;
import system.design.elevator.enums.ElevatorNumber;
import system.design.elevator.enums.FloorNumber;
import system.design.elevator.models.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ElevatorSystemAdvancedTest {

    private ElevatorSystem elevatorSystem;
    private Elevator elevator1;
    private Elevator elevator2;


    @BeforeEach
    void setUP(){

        elevatorSystem  = ElevatorSystem.getInstance();

        // Initializing them at different floors
        elevator1 = new Elevator(ElevatorNumber.ELEVATOR_NUMBER_ONE, new Door(), new InsidePanel(), new Display(), FloorNumber.FLOOR_NUMBER_ONE, Direction.IDLE);
        elevator2 = new Elevator(ElevatorNumber.ELEVATOR_NUMBER_THREE, new Door(), new InsidePanel(), new Display(), FloorNumber.FLOOR_NUMBER_FIVE, Direction.IDLE);

        Floor floor1 = new Floor(FloorNumber.FLOOR_NUMBER_ONE, null);
        Floor floor5 = new Floor(FloorNumber.FLOOR_NUMBER_FIVE, null);
        Floor floor11 = new Floor(FloorNumber.FLOOR_NUMBER_ELEVEN, null);


        elevatorSystem.setElevators(Arrays.asList(elevator1, elevator2));
        elevatorSystem.setFloors(Arrays.asList(floor1, floor5, floor11));
    }


    @Test
    void testRequestClosestElevator(){
        Elevator requestedElevator = elevatorSystem.requestElevator(Direction.UP, new Floor(FloorNumber.FLOOR_NUMBER_FOURTEEN, null));
        assertNotNull(requestedElevator, "An Elevator should be assigned");
    }
}
