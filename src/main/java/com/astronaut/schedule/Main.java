package main.java.com.astronaut.schedule;

import java.util.Scanner;

public class Main {

    private static ScheduleManager scheduleManager = ScheduleManager.getInstance();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nAstronaut Daily Schedule Organizer");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    removeTask(scanner);
                    break;
                case 3:
                    scheduleManager.viewTasks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter Task Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Start Time (HH:mm): ");
        String startTime = scanner.nextLine();

        System.out.print("Enter End Time (HH:mm): ");
        String endTime = scanner.nextLine();

        System.out.print("Enter Priority (Low/Medium/High): ");
        String priority = scanner.nextLine();

        Task newTask = TaskFactory.createTask(description, startTime, endTime, priority);
        scheduleManager.addTask(newTask);
    }

    private static void removeTask(Scanner scanner) {
        System.out.print("Enter Task Description to Remove: ");
        String description = scanner.nextLine();
        scheduleManager.removeTask(description);
    }
}
