package system.design.elevator.models;

import system.design.elevator.enums.Direction;
import system.design.elevator.enums.ElevatorNumber;
import system.design.elevator.enums.FloorNumber;

public class Elevator {

    private ElevatorNumber elevatorNumber;
    private Door door;
    private insidePanel insidePanel;
    private Display display;
    private FloorNumber currentFloorNumber;
    private Direction currentDirection;


    public Elevator(ElevatorNumber elevatorNumber, Door door, insidePanel insidePanel, Display display, FloorNumber currentFloorNumber, Direction currentDirection) {
        this.elevatorNumber = elevatorNumber;
        this.door = door;
        this.insidePanel = insidePanel;
        this.display = display;
        this.currentFloorNumber = currentFloorNumber;
        this.currentDirection = currentDirection;
    }

    public Elevator() {
    }

    public ElevatorNumber getElevatorNumber() {
        return elevatorNumber;
    }

    public void setElevatorNumber(ElevatorNumber elevatorNumber) {
        this.elevatorNumber = elevatorNumber;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public insidePanel getInsidePanel() {
        return insidePanel;
    }

    public void setInsidePanel(insidePanel insidePanel) {
        this.insidePanel = insidePanel;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public FloorNumber getCurrentFloorNumber() {
        return currentFloorNumber;
    }

    public void setCurrentFloorNumber(FloorNumber currentFloorNumber) {
        this.currentFloorNumber = currentFloorNumber;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }
}
