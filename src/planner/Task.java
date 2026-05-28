package planner;

public abstract class Task {

    //Encapsulated fields
    private String title;
    private String deadline;
    private String priority;
    private boolean completed;

    //Default constructor
    public Task(){
        this.title = "Unknown Task";
        this.deadline = "No Deadline";
        this.priority = "Medium";
        this.completed = false;
    }
    //Parameterized constructor
    public Task(String title, String deadline, String priority){
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
        this.completed = false;
    }

    //Getters
    public String getTitle(){return title;}
    public String getDeadline(){
        return deadline;
    }
    public String getPriority(){
        return priority;
    }
    public boolean isCompleted(){
        return completed;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    //Mark task as completed
    public void markCompleted(){
        completed = true;
    }

    //Method to display task information
    public void displayTask(){
        System.out.println("Title :" +title);
        System.out.println("Deadline : "+deadline);
        System.out.println("Priority :"+priority);
        System.out.println("Completed :"+completed);
    }

    //Abstract method for polymorphism
    public abstract void calculatePriority();
}
