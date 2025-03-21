package system.design.elevator.models;

import system.design.elevator.enums.Direction;
import system.design.elevator.interfaces.Panel;

import java.util.ArrayList;
import java.util.List;

public class OutsidePanel implements Panel {

    private List<HallButton> hallButtons;

    public OutsidePanel() {
        hallButtons = new ArrayList<>();
        hallButtons.add(new HallButton(false, Direction.UP));
        hallButtons.add(new HallButton(false, Direction.DOWN));
        hallButtons.add(new HallButton(false, Direction.IDLE));
    }

     public void pressButton(Direction direction) {
        for(HallButton button : hallButtons){
            if (button.getDirection() == direction){
                button.setStatus(true);
                System.out.println(direction + " button pressed");
                return;
            }
        }
         System.out.println("Invalid button pressed");
    }

    public boolean isButtonPressed(Direction direction) {
        for (HallButton button : hallButtons){
            if (button.getDirection() == direction){
                return button.isPressed();
            }
        }
        return false;
    }

}
