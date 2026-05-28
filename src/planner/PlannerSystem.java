package planner;

import java.util.ArrayList;

public class PlannerSystem {

    //ArrayList to store different tasks
    private ArrayList<Task> tasks;

    //Constructor
    public PlannerSystem(){
        tasks = new ArrayList<>();
    }

    //Add task
    public void addTask(Task task){
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    //Display all tasks
    public void displayAllTasks(){

        if (tasks.isEmpty()){
            System.out.println("No tasks available");
            return;
        }

        System.out.println("\n==== TASK LIST ====");

        int index = 0;
        for (Task task : tasks){
            System.out.println("\nTask Index: " + index);
            System.out.println("~~~~~~~~~~~~~~~~~~~~");

            //Runtime polymorphism
            task.displayTask();

            //Dynamic dispatch
            task.calculatePriority();

            index++;
        }
    }

    //Mark task as completed
    public void completeTask(int index){
        if (index >= 0 && index < tasks.size()){
            tasks.get(index).markCompleted();
            System.out.println("Task marked as completed.");
        }
        else {
            System.out.println("Invalid task index.");
        }
    }

}
