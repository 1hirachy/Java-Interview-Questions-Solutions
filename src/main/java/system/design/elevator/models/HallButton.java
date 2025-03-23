package system.design.elevator.models;

import system.design.elevator.enums.Direction;
import system.design.elevator.interfaces.Button;

public class HallButton implements Button {
    private boolean status;
    private Direction direction;

    // Updating to make sure direction is always set
    public HallButton(Direction direction) {
        this.status = false; // Defaulted to unpressed state
        this.direction = direction;
    }

    public HallButton(boolean status, Direction direction) {
        this.status = status;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public boolean isPressed(){
        return status;
    }


    public boolean press(){
        this.status  = !this.status;
        return this.status;
    }

    // New method if required in other classes
    public boolean isFloorButtonPressed() {
        return status;
    }

}
