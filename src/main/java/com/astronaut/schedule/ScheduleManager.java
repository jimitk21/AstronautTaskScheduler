package main.java.com.astronaut.schedule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance = null;
    private List<Task> tasks;

    // Private constructor to prevent instantiation
    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    // Singleton instance getter
    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    // Add a new task to the schedule
    public void addTask(Task newTask) {
        if (validateTask(newTask)) {
            tasks.add(newTask);
            System.out.println("Task added successfully.");
        } else {
            System.out.println("Error: Task conflicts with existing tasks.");
        }
    }

    // Remove a task by description
    public void removeTask(String description) {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Error: Task not found.");
        }
    }

    // View tasks sorted by start time
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }
        // Sort tasks by start time
        Collections.sort(tasks, Comparator.comparing(Task::getStartTime));
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // Validate if a task conflicts with existing tasks
    private boolean validateTask(Task newTask) {
        for (Task task : tasks) {
            if (newTask.conflictsWith(task)) {
                return false;
            }
        }
        return true;
    }
}
