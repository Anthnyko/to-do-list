public class Tasks {

    private String taskName;
    private boolean isCompleted;

    public Tasks(String taskName) {
        this.taskName = taskName;
        this.isCompleted = false;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void completeTask() {
        this.isCompleted = true;
    }





}
