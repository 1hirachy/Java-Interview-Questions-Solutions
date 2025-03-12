package system.design.elevator.models;

import system.design.elevator.enums.Direction;
import system.design.elevator.interfaces.Button;

public class HallButton implements Button {
    private boolean status;
    private Direction direction;

    public HallButton() {
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
        status =! status;
        return status;
    }

}
