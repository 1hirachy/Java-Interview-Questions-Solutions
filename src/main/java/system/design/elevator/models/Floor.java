package system.design.elevator.models;

import system.design.elevator.enums.FloorNumber;

public class Floor {

    private FloorNumber floorNumber;
    private OutsidePannel outsidePannel;

    public Floor(FloorNumber floorNumber, OutsidePannel outsidePannel) {
        this.floorNumber = floorNumber;
        this.outsidePannel = outsidePannel;
    }

    public FloorNumber getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(FloorNumber floorNumber) {
        this.floorNumber = floorNumber;
    }

    public OutsidePannel getOutsidePannel() {
        return outsidePannel;
    }

    public void setOutsidePannel(OutsidePannel outsidePannel) {
        this.outsidePannel = outsidePannel;
    }
}
