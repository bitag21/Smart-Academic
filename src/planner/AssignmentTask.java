package planner;

public class AssignmentTask extends Task{

    //Additional field specific to assignments
    private String subject;

    //Default constructor
    public AssignmentTask(){
        super();
        this.subject ="Unknown subject";
    }

    //Parameterized constructor
    public AssignmentTask(String title, String deadline, String priority, String subject){
        super(title, deadline, priority);
        this.subject = subject;
    }

    //Getter
    public String getSubject(){
        return subject;
    }

    //Setter
    public void setSubject(String subject) {
        this.subject = subject;
    }

    //Overridden display method
    @Override
    public void displayTask() {
        super.displayTask();
        System.out.println("Subject: " +subject);
    }

    //Method overridden priority calculation
    @Override
    public void calculatePriority() {

        if (isCompleted()){
            System.out.println("Assignment completed successfully.");
            return;
        }


        System.out.println("Assignment tasks should be completed before the deadline.");
    }
}
