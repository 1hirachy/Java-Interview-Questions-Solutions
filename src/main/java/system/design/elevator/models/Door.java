package system.design.elevator.models;

import system.design.elevator.enums.DoorAction;

public class Door {

    private DoorAction doorAction;

    public Door(DoorAction doorAction) {
        this.doorAction = doorAction;
    }

    public Door() {
    }


    public void openDoor() {
        doorAction = DoorAction.OPEN;
    }

    public void closeDoor() {
        doorAction = DoorAction.CLOSE;
    }
}
