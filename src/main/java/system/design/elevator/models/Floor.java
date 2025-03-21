package system.design.elevator.models;

import system.design.elevator.enums.FloorNumber;

public class Floor {

    private FloorNumber floorNumber;
    private OutsidePanel outsidePannel;

    public Floor(FloorNumber floorNumber, OutsidePanel outsidePannel) {
        this.floorNumber = floorNumber;
        this.outsidePannel = outsidePannel;
    }

    public FloorNumber getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(FloorNumber floorNumber) {
        this.floorNumber = floorNumber;
    }

    public OutsidePanel getOutsidePannel() {
        return outsidePannel;
    }

    public void setOutsidePannel(OutsidePanel outsidePannel) {
        this.outsidePannel = outsidePannel;
    }
}
