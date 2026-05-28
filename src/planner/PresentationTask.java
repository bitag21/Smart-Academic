package planner;

public class PresentationTask extends Task{

    //Field specific to presentations
    private int preparationLevel;

    //Default constructor
    public PresentationTask(){
        super();
        this.preparationLevel = 0;
    }

    //Parameterized constructor
    public PresentationTask(String title, String deadline, String priority, int preparationLevel){
        super(title, deadline, priority);
        this.preparationLevel = preparationLevel;
    }

    //Getter
    public int getPreparationLevel(){
        return preparationLevel;
    }

    //Setter
    public void setPreparationLevel(int preparationLevel){
        this.preparationLevel = preparationLevel;
    }

    //Overridden display method
    @Override
    public void displayTask() {
        super.displayTask();
        System.out.println("PreparationLevel: " +preparationLevel + "%");
    }


    //Overridden markCompleted
    @Override
    public void markCompleted() {
        super.markCompleted();
        preparationLevel = 100;
    }


    //overridden priority calculation method
    @Override
    public void calculatePriority() {

        if (isCompleted()){
            System.out.println("Presentation task completed successfully.");
            return;
        }

        if (preparationLevel < 50){
            System.out.println("High priority: More preparation needed! ");
        }
        else {
            System.out.println("Presentation preparation is going well.");
        }
    }
}
