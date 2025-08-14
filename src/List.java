import java.util.ArrayList;
import java.util.Scanner;

public class List extends Menu {

    private ArrayList<Tasks> taskList;
    private Scanner scanner = new Scanner(System.in);

    public List() {
        taskList = new ArrayList<Tasks>();
        System.out.println("Welcome to the To-Do List App!");
    }

    public void addTask() {
        System.out.print("Enter the task description: ");
        String taskName = scanner.nextLine();
        Tasks task = new Tasks(taskName);
        taskList.add(task);
        System.out.println("Task added successfully!");
    }

    public void viewTasks() {
        System.out.println("To-Do List:");
        for (int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).isCompleted() == false) {
                System.out.println(i + 1 + ". " + taskList.get(i).getTaskName());
            }            
        }
    }

    public void markTaskAsCompleted() {
        viewTasks();
        System.out.println();
        System.out.print("Enter the task number to mark as completed: ");
        int completedTask = scanner.nextInt();
        scanner.nextLine();
        taskList.get(completedTask-1).completeTask();
        taskList.remove(completedTask-1);
        System.out.println("Task marked as completed!");
    }
}
