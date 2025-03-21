package system.design.elevator.models;

import system.design.elevator.enums.DoorAction;
import system.design.elevator.enums.FloorNumber;
import system.design.elevator.interfaces.Panel;

import java.util.ArrayList;
import java.util.List;

public class InsidePanel implements Panel {

    private List<ElevatorButton> elevatorButtonList;
    private List<DoorButton> doorButtons;

    public InsidePanel() {

        elevatorButtonList = new ArrayList<>();
        doorButtons = new ArrayList<>();

        for (int i = 0; i < FloorNumber.values().length; i++){
            elevatorButtonList.add(new ElevatorButton(false, FloorNumber.values()[i]));
        }

        for (int i = 0; i < DoorAction.values().length; i++){
            doorButtons.add(new DoorButton(false, DoorAction.values()[i]));
        }
    }

    public boolean pressFloorButtons(int floorNumber){
        return elevatorButtonList.get(floorNumber).press();
    }

    public boolean pressDoorButton(int doorNumber){
        return doorButtons.get(doorNumber).press();
    }
}
