# Elevator System Design Documentation

## Overview
This Elevator System is a comprehensive implementation using Java that follows Object-Oriented Design principles, including:
- **Enum-based floor management**
- **Interface-driven behaviors for buttons and panels**
- **Singleton Design Pattern for elevator instance control**
- **Multiple Models for modular functionality**

The design ensures scalability, maintainability, and clear separation of concerns.

---
## Key Features
✅ Multi-layered architecture using Enums, Interfaces, and Models  
✅ Singleton Design Pattern to maintain a single Elevator instance  
✅ Robust input validation to handle floor selection errors  
✅ Supports multiple elevator requests efficiently  
✅ Implements Observer Pattern for dynamic floor request tracking

---
## Architecture Overview
```
/src
 ┣ /enums
 ┃ ┗ FloorNumber.java
 ┣ /interfaces
 ┃ ┣ Button.java
 ┃ ┣ ControlPanel.java
 ┃ ┗ Door.java
 ┣ /models
 ┃ ┣ Elevator.java
 ┃ ┣ Floor.java
 ┃ ┣ ElevatorButton.java
 ┃ ┣ InsidePanel.java
 ┃ ┗ OutsidePanel.java
 ┗ Main.java
```

---
## Class Details
### 1. Enums
- **`FloorNumber`** — Enum to define floors from 1 to 15 with their respective values and retrieval logic.

### 2. Interfaces
- **`Button`** — Defines methods for button interactions like `press()` and `isPressed()`.
- **`ControlPanel`** — Manages user interaction for selecting floors.
- **`Door`** — Interface to control elevator door operations.

### 3. Models
- **`Elevator`** (Singleton) — Core class to manage floor movement, door operations, and state management.
- **`Floor`** — Represents individual floors with their assigned number and outside panel.
- **`ElevatorButton`** — Provides button interactions for elevator requests.
- **`InsidePanel` & `OutsidePanel`** — Manage user interaction for requesting floors from inside/outside the elevator.

### 4. Main Execution (`Main.java`)
- Provides a simple command-line interface for:
    - Requesting the elevator to a specific floor
    - Displaying elevator status
    - Exiting the application

---
## How to Run the Application
1. **Clone the Repository**
   ```sh
   git clone <repository_link>
   cd <repository_folder>
   ```

2. **Compile the Code**
   ```sh
   javac -d out $(find . -name "*.java")
   ```

3. **Run the Application**
   ```sh
   java -cp out system.design.elevator.Main
   ```

4. **Sample Interaction**
```
Elevator System Simulation:
1. Request Elevator
2. Show Elevator Status
3. Exit
Choose an option: 1
Enter floor number (1-10): 5
Elevator moving to Floor 5...
```

---
## Future Enhancements
🔹 Add support for multiple elevators with intelligent dispatching  
🔹 Implement security features like keycard access for restricted floors  
🔹 Introduce priority handling for emergency situations  
🔹 Add comprehensive unit tests to ensure code stability

---
## Best Practices Followed
✅ **Singleton Design Pattern** — Ensures only one Elevator instance is active  
✅ **Encapsulation** — Ensures proper access control and modular design  
✅ **Robust Error Handling** — Provides informative error messages for invalid inputs  
✅ **SOLID Principles** — Ensures scalable and maintainable code

---
## Conclusion
This design effectively demonstrates a scalable and structured Elevator System suitable for complex real-world scenarios. The implementation leverages Java best practices to ensure high-quality, robust code.

