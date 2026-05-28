package planner;

public class ExamTask extends Task{

    //Field specific to exams
    private int preparationPercentage;

    //Default constructor
    public ExamTask(){
        super();
        this.preparationPercentage = 0;
    }

    //Parameterized constructor
    public ExamTask(String title, String deadline, String priority, int preparationPercentage){
        super(title, deadline, priority);
        this.preparationPercentage = preparationPercentage;
    }

    //Getter
    public int getPreparationPercentage() {
        return preparationPercentage;
    }

    //Setter
    public void setPreparationPercentage(int preparationPercentage) {
        this.preparationPercentage = preparationPercentage;
    }

    //Overridden display method
    @Override
    public void displayTask() {
        super.displayTask();
        System.out.println("Preparation Percentage: " +preparationPercentage +"%");
    }


    //Override markCompleted
    @Override
    public void markCompleted() {
        super.markCompleted();
        preparationPercentage = 100;
    }


    //Method overridden priority calculation
    @Override
    public void calculatePriority() {
        if (isCompleted()){
            System.out.println("Exam task completed successfully.");
            return;
        }

        if (preparationPercentage < 50){
            System.out.println("High Priority: More preparation needed!");
        }
        else {
            System.out.println("Good exam preparation progress.");
        }
    }
}
