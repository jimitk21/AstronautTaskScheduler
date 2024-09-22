package main.java.com.astronaut.schedule;

import java.util.ArrayList;
import java.util.List;

public class ConflictNotifier implements TaskConflictObserver {

    private List<Task> tasks;

    public ConflictNotifier() {
        tasks = new ArrayList<>();
    }

    @Override
    public void notifyConflict(Task newTask, Task conflictingTask) {
        System.out.println("Conflict detected!");
        System.out.println("New Task: " + newTask);
        System.out.println("Conflicting Task: " + conflictingTask);
    }

    // Add a task to the notifier's list
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Check for conflicts and notify observers
    public void checkForConflicts(Task newTask) {
        for (Task task : tasks) {
            if (newTask.conflictsWith(task)) {
                notifyConflict(newTask, task);
                return;
            }
        }
        // Add the new task if no conflicts
        tasks.add(newTask);
    }
}
