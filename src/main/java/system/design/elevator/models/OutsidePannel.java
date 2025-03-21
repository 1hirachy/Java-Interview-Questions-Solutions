package system.design.elevator.models;

import system.design.elevator.enums.Direction;
import system.design.elevator.interfaces.Pannel;

import java.util.ArrayList;
import java.util.List;

public class OutsidePannel implements Pannel {

    private List<HallButton> hallButtons;

    public OutsidePannel() {
        hallButtons = new ArrayList<>();
        hallButtons.add(new HallButton(false, Direction.UP));
        hallButtons.add(new HallButton(false, Direction.DOWN));
        hallButtons.add(new HallButton(false, Direction.IDLE));
    }

    public void moveUp() {

    }

    public void moveDown() {

    }

}
