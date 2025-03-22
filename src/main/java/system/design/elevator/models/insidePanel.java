package system.design.elevator.models;

import system.design.elevator.enums.DoorAction;
import system.design.elevator.enums.FloorNumber;
import system.design.elevator.interfaces.Panel;

import java.util.ArrayList;
import java.util.List;

public class insidePanel implements Panel {

    private boolean status;
    private List<ElevatorButton> elevatorButtonList;
    private List<DoorButton> doorButtons;

    public insidePanel() {

        elevatorButtonList = new ArrayList<>();
        doorButtons = new ArrayList<>();

        for (int i = 0; i < FloorNumber.values().length; i++) {
            elevatorButtonList.add(new ElevatorButton(false, FloorNumber.values()[i]));
        }

        for (int i = 0; i < DoorAction.values().length; i++) {
            doorButtons.add(new DoorButton(false, DoorAction.values()[i]));
        }
    }

    public boolean pressFloorButtons(int floorNumber) {
        return elevatorButtonList.get(floorNumber).press();
    }

    public boolean pressDoorButton(int doorNumber) {
        return doorButtons.get(doorNumber).press();
    }

    public boolean isFloorButtonPressed() {
        return status;
    }

    public boolean isFloorButtonPressed(int floorNumber) {
        if (floorNumber < 0 || floorNumber >= elevatorButtonList.size()) {
            throw new IllegalArgumentException("Invalid floor number: " + floorNumber);
        }

        return elevatorButtonList.get(floorNumber).isPressed();
    }

}
