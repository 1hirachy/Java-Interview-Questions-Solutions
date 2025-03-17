package system.design.elevator.enums;

public enum FloorNumber {
    FLOOR_NUMBER_ONE(1),
    FLOOR_NUMBER_TWO(2),
    FLOOR_NUMBER_THREE(3),
    FLOOR_NUMBER_FOUR(4),
    FLOOR_NUMBER_FIVE(5),
    FLOOR_NUMBER_SIX(6),
    FLOOR_NUMBER_SEVEN(7),
    FLOOR_NUMBER_EIGHT(8),
    FLOOR_NUMBER_NINE(9),
    FLOOR_NUMBER_TEN(10),
    FLOOR_NUMBER_ELEVEN(11),
    FLOOR_NUMBER_TWELVE(12),
    FLOOR_NUMBER_THIRTEEN(13),
    FLOOR_NUMBER_FOURTEEN(14),
    FLOOR_NUMBER_FIFTEEN(15);

    private final int value;

    FloorNumber(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }


    public static FloorNumber getValue(int value){
        for (FloorNumber floor: FloorNumber.values()){
            if (floor.getValue() == value){
                return floor;
            }
        }
        throw new IllegalArgumentException("Invalid floor number: " + value);
    }
}
