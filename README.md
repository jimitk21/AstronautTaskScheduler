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

AstronautTaskScheduler/
├── src
│   └── main
│       └── java
│           └── com
│               └── astronaut
│                   └── schedule
│                       ├── Main.java                     # Main application class with the user interface
│                       ├── Task.java                     # Class representing the Task object
│                       ├── TaskFactory.java              # Factory class for creating tasks based on priority
│                       ├── ScheduleManager.java          # Singleton class for managing task addition, removal, and viewing
│                       ├── TaskConflictObserver.java     # Interface for conflict notifications
│                       ├── ConflictNotifier.java         # Class implementing conflict detection for tasks
├── LICENSE
└── README.md

   
