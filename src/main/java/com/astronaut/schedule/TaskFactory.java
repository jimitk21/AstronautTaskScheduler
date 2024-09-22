package main.java.com.astronaut.schedule;

public class TaskFactory {

    // Factory method to create a Task object
    public static Task createTask(String description, String startTime, String endTime, String priority) {
        if (isValidPriority(priority)) {
            return new Task(description, startTime, endTime, priority);
        } else {
            throw new IllegalArgumentException("Invalid priority level. Choose Low, Medium, or High.");
        }
    }

    // Helper method to validate the priority level
    private static boolean isValidPriority(String priority) {
        return priority.equalsIgnoreCase("Low") ||
               priority.equalsIgnoreCase("Medium") ||
               priority.equalsIgnoreCase("High");
    }
}

