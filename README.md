# EI-Assignments

- **Exercise 1: Problem Statement on Design Patterns**  
  [Repository Link 1](https://github.com/jimitk21/design-pattern-java)

- **Exercise 2: Problem Statement for Mini-projects**  
   Astronaut Daily Schedule Organizer Programming Exercise  
  [Repository Link 2](https://github.com/jimitk21/AstronautTaskScheduler)

---


# AstronautTaskScheduler

**Exercise 2 of Education Initiatives**  
This is a console-based application that helps astronauts organize their daily schedules. The application allows users to add, remove, and view daily tasks. Each task has a description, start time, end time, and priority level.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Git (for cloning the repository)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/jimitk21/AstronautTaskScheduler.git

2. Navigate to the directory of the project:
   ```bash
   cd src
3. Complie the code:
   ```bash
   javac main/java/com/astronaut/schedule/*.java
4. Run the code:
   ```bash
   java -cp . main.java.com.astronaut.schedule.Main
   ```


## Project Folder Structure

- `src/` - Source code directory
  - `main/` - Main application package
    - `java/` - Java files
      - `com/` - Package for the application
        - `astronaut/` - Main package for the application
          - `schedule/` - Package for scheduling classes
            - `Main.java` - Main application class with the user interface
            - `Task.java` - Class representing the Task object
            - `TaskFactory.java` - Factory class for creating tasks based on priority
            - `ScheduleManager.java` - Singleton class for managing task addition, removal, and viewing
            - `TaskConflictObserver.java` - Interface for conflict notifications
            - `ConflictNotifier.java` - Class implementing conflict detection for tasks
  - `LICENSE` - License file for the project
  - `README.md` - Documentation for the project



   
### Features
- Add a new task with a description, start time, end time and priority level.
- Remove an existing task.
- View all tasks sorted by start time.
- Validation that new tasks do not overlap with existing tasks.
- Provide appropriate error messages for invalid operations.

## Usage 
- Initial Screen
![image](https://github.com/user-attachments/assets/e45f3577-0050-43b3-9795-f03e0aca207f)

