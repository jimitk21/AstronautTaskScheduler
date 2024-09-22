package main.java.com.astronaut.schedule;

public interface TaskConflictObserver {
    void notifyConflict(Task newTask, Task conflictingTask);
}
