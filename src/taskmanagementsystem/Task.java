package taskmanagementsystem;

public class Task {
    private String taskName;

    public Task(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    private String taskDescription;

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }
    @Override
    public String toString() {
        return "Task Name: " + taskName + ", Task Description: " + taskDescription;
    }
}
