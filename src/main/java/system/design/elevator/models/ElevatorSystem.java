package system.design.elevator.models;

import system.design.elevator.enums.Direction;
import system.design.elevator.enums.FloorNumber;

import java.util.List;

public class ElevatorSystem {

    public List<Elevator> elevators;
    private List<Floor> floors;

    private ElevatorSystem() {
    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }


    private static volatile ElevatorSystem elevatorSystemInstance;


    public static ElevatorSystem getInstance() {
        if (elevatorSystemInstance == null) {
            synchronized (ElevatorSystem.class) {
                if (elevatorSystemInstance == null) {
                    return elevatorSystemInstance = new ElevatorSystem();
                }
            }
        }

        return elevatorSystemInstance;
    }

    public Elevator requestElevator(Direction direction, Floor floor) {

        //Implemented: returning elevator using smart dispatch, setting up the properties of the elevator


        if (elevators == null || elevators.isEmpty()) {
            return null; // No elevators available
        }


        Elevator closestElevator = null;
        int minDistance = Integer.MAX_VALUE;

        for (Elevator elevator : elevators) {
            // skipping busy elevators
            if (elevator.getCurrentDirection() != Direction.IDLE) {
                continue;
            }

            if (elevator.getCurrentDirection() == null) {
                continue;
            }

            int distance = Math.abs(elevator.getCurrentFloorNumber().getValue() - floor.getFloorNumber().getValue());

            // find the closest idle elevator
            if (distance < minDistance) {
                minDistance = distance;
                closestElevator = elevator;
            }
        }

        if (closestElevator != null) {
            closestElevator.setCurrentFloorNumber(floor.getFloorNumber());

            // set elevators current direction
            closestElevator.setCurrentDirection(direction);
        }
        return closestElevator;
    }


    public void openDoor(Elevator elevator) {
        elevator.getDoor().openDoor();
    }

    public void closeDoor(Elevator elevator) {
        elevator.getDoor().closeDoor();
    }

    public void selectFloor(FloorNumber floorNumber, Elevator elevator) {
        if (floorNumber == null) {
            throw new IllegalArgumentException("Invalid floor number: " + floorNumber);
        }
        elevator.getInsidePanel().pressFloorButtons(floorNumber.ordinal());
    }


}
