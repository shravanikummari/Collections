package taskmanagementsystem;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
public class TaskManagementApp {
    private List<Task> taskList;
        // Constructor
        public TaskManagementApp() {
            taskList = new LinkedList<Task>();
        }

        // Method to add a task to the list
        public void addTask(Task task) {
            taskList.add(task);
        }

        // Method to remove a task from the list by taskName
        public void removeTask(String taskName) {
            Iterator<Task> iterator = taskList.iterator();
            while (iterator.hasNext()) {
                Task task = iterator.next();
                if (task.getTaskName().equals(taskName)) {
                    iterator.remove();
                    System.out.println("Task '" + taskName + "' removed successfully.");
                    return;
                }
            }
            System.out.println("Task '" + taskName + "' not found.");
        }

        // Method to display all tasks in the list
        public void displayTasks() {
            if (taskList.isEmpty()) {
                System.out.println("No tasks in the list.");
            } else {
                System.out.println("List of tasks:");
                for (Task task : taskList) {
                    System.out.println(task);
                    System.out.println("----------------------");
                }
            }
        }

        // Method to move a task to the top of the list by taskName
        public void moveTaskToTop(String taskName) {
            Iterator<Task> iterator = taskList.iterator();
            while (iterator.hasNext()) {
                Task task = iterator.next();
                if (task.getTaskName().equals(taskName)) {
                    iterator.remove();
                    taskList.add(0, task); // Add task to the beginning of the list
                    System.out.println("Task '" + taskName + "' moved to the top.");
                    return;
                }
            }
            System.out.println("Task '" + taskName + "' not found.");
        }

        // Main method for testing
        public static void main(String[] args) {
            TaskManagementApp app = new TaskManagementApp();

            // Adding tasks
            app.addTask(new Task("Task 1", "Description of Task 1"));
            app.addTask(new Task("Task 2", "Description of Task 2"));
            app.addTask(new Task("Task 3", "Description of Task 3"));

            // Display tasks
            System.out.println("Initial list of tasks:");
            app.displayTasks();

            // Removing a task
            app.removeTask("Task 2");

            // Display tasks after removal
            System.out.println("\nList of tasks after removing 'Task 2':");
            app.displayTasks();

            // Moving a task to the top
            app.moveTaskToTop("Task 3");

            // Display tasks after moving to top
            System.out.println("\nList of tasks after moving 'Task 3' to the top:");
            app.displayTasks();
        }
    }