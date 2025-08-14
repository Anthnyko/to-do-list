import java.util.Scanner;
public class Menu {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List toDoList = new List();
        while (true) {
            int option = displayMenu();
            if (option == 1) {
                toDoList.addTask();
            } else if (option == 2) {
                toDoList.viewTasks();
            } else if (option == 3) {
                toDoList.markTaskAsCompleted();
            } else {
                break;
            }
        }   
        System.out.println("Goodbye!"); 
    }

    public static int displayMenu() {
        System.out.println("To-Do List Menu:");
        System.out.println("-------------------");
        System.out.println();
        System.out.println("1. Add a task");
        System.out.println("2. View tasks");
        System.out.println("3. Mark a Task as Completed");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("-------------------");
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return choice;
    }
}