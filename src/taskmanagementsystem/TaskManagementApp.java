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

        public static void main(String[] args) {
            TaskManagementApp app = new TaskManagementApp();

            app.addTask(new Task("Task 1", "Description of Task 1"));
            app.addTask(new Task("Task 2", "Description of Task 2"));
            app.addTask(new Task("Task 3", "Description of Task 3"));

            System.out.println("Initial list of tasks:");
            app.displayTasks();

            app.removeTask("Task 2");

            System.out.println("\nList of tasks after removing 'Task 2':");
            app.displayTasks();

            app.moveTaskToTop("Task 3");

            System.out.println("\nList of tasks after moving 'Task 3' to the top:");
            app.displayTasks();
        }
    }