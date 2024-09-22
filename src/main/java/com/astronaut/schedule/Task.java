package main.java.com.astronaut.schedule;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Task {
    private String description;
    private LocalTime startTime;
    private LocalTime endTime;
    private String priority;

    // Constructor
    public Task(String description, String startTime, String endTime, String priority) {
        this.description = description;
        this.startTime = parseTime(startTime);
        this.endTime = parseTime(endTime);
        this.priority = priority;
    }

    // Getter methods
    public String getDescription() {
        return description;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getPriority() {
        return priority;
    }

    // Utility method to parse time
    private LocalTime parseTime(String time) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            return LocalTime.parse(time, formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid time format. Please use HH:mm.");
        }
    }

    // Check if this task conflicts with another task
    public boolean conflictsWith(Task otherTask) {
        return (startTime.isBefore(otherTask.getEndTime()) && endTime.isAfter(otherTask.getStartTime()));
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return startTime.format(formatter) + " - " + endTime.format(formatter) + ": " + description + " [" + priority + "]";
    }
}
