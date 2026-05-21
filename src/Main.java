import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Task list storage
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            // Main menu
            System.out.println("\n==========================");
            System.out.println("     TASK MANAGER");
            System.out.println("==========================");
		// Console user interface
            System.out.println("1. Add task");
            System.out.println("2. Show tasks");
            System.out.println("3. Delete task");
            System.out.println("4. Exit");

            System.out.print("\nChoose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    // Add new task
                    System.out.print("Enter task name: ");

                    String task = scanner.nextLine();

                    tasks.add("[TODO] " + task);

                    System.out.println("Task added successfully.");
		    System.out.println("Keep going, productivity matters.");
                    break;

                case 2:

                    // Display tasks
                    System.out.println("\n===== TASK LIST =====");

                    if (tasks.isEmpty()) {

                        System.out.println("No tasks available.");

                    } else {

                        for (int i = 0; i < tasks.size(); i++) {
                        // Display each task with its status
                            System.out.println(
                                    (i + 1) + ". " + tasks.get(i)
                            );
                        }
                    }

                    break;

                case 3:

                    // Delete task
                    System.out.print("Task number to delete: ");

                    int index = scanner.nextInt();

                    if (index > 0 && index <= tasks.size()) {

                        tasks.remove(index - 1);

                        System.out.println("Task deleted.");

                    } else {

                        System.out.println("Invalid task number.");
                    }

                    break;

                case 4:

                    System.out.println("Exiting application...");
                    System.out.println("See you next time.");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
