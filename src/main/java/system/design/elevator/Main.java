package system.design.elevator;

import system.design.elevator.enums.Direction;
import system.design.elevator.enums.DoorAction;
import system.design.elevator.enums.FloorNumber;
import system.design.elevator.models.Door;
import system.design.elevator.models.Elevator;
import system.design.elevator.models.ElevatorButton;
import system.design.elevator.models.ElevatorSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Elevator elevator = new Elevator();

        // Display Menu for Elevator
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nElevator System Simulation: ");
            System.out.println("1. Request Elevator");
            System.out.println("2. Show Elevator Status");
            System.out.println("3. Exit");


            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // Request an Elevator
                    System.out.println("Enter floor number (1-15): ");
                    int floor = scanner.nextInt();
                    if (floor < 1 || floor > 15) {
                        System.out.println("Invalid floor number");
                        break;
                    }
                    elevator.setCurrentFloorNumber(FloorNumber.getValue(floor));


                case 2: // Show Elevator Status
                    System.out.println("Elevator is currently on Floor " + elevator.getCurrentFloorNumber());

                case 3: //Exit
                    System.out.println("Exiting Elevator System Simulation. Good bye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("invalid Choice! Please try again. ");
            }




        }
    }
}
