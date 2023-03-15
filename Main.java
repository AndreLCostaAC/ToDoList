import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ToDoList toDoList = new ToDoList();
    boolean running = true;
    while (running) {
        System.out.println("\nWhat would you like to do?");
        System.out.println("1. Add a task");
        System.out.println("2. Remove a task");
        System.out.println("3. Display tasks");
        System.out.println("4. Quit");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter the task: ");
                String task = scanner.nextLine();
                toDoList.addTask(task);
                break;
            case 2:
                System.out.print("Enter the task number to remove: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                toDoList.removeTask(index);
                break;
            case 3:
                toDoList.displayTasks();
                break;
            case 4:
                running = false;
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    scanner.close();
}
}