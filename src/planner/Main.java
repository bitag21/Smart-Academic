package planner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Student Information
        System.out.println("Enter student name: ");
        String name = input.nextLine();

        System.out.println("Enter department: ");
        String department = input.nextLine();

        System.out.println("Enter year level: ");
        int yearLevel = input.nextInt();
        input.nextLine();

        //Create Student Info
        Student student = new Student(name, department, yearLevel);

        //Display student info
        student.displayStudentInfo();

        //Create planner system
        PlannerSystem planner= new PlannerSystem();
        int choice;

        do {
            System.out.println("\n===================================");
            System.out.println(student.getName() + "'s SMART ACADEMIC PLANNER");
            System.out.println("===================================");
            System.out.println("1. Add Assignment Task");
            System.out.println("2. Add Exam Task");
            System.out.println("3. Add Presentation Task");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Mark Task as Completed");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice){

                case 1:
                    System.out.println("Enter title: ");
                    String assignmentTitle = input.nextLine();

                    System.out.println("Enter deadline: ");
                    String assignmentDeadline = input.nextLine();

                    System.out.println("Enter priority: ");
                    String assignmentPriority = input.nextLine();

                    System.out.println("Enter subject: ");
                    String subject = input.nextLine();

                    AssignmentTask assignment = new AssignmentTask(
                            assignmentTitle,
                            assignmentDeadline,
                            assignmentPriority,
                            subject
                    );

                    planner.addTask(assignment);

                    break;

                case 2:
                    System.out.println("Enter title: ");
                    String examTitle = input.nextLine();

                    System.out.println("Enter deadline: ");
                    String examDeadline = input.nextLine();

                    System.out.println("Enter priority");
                    String examPriority = input.nextLine();

                    int preparationPercentage;
                    do {

                        System.out.println("Enter preparation percentage(0-100): ");
                        preparationPercentage = input.nextInt();
                        input.nextLine();

                        if (preparationPercentage < 0 || preparationPercentage > 100) {
                            System.out.println("Invalid percentage. Please enter between 0 and 100.");
                        }
                    }while (preparationPercentage < 0 || preparationPercentage > 100);

                    ExamTask exam = new ExamTask(
                            examTitle,
                            examDeadline,
                            examPriority,
                            preparationPercentage
                    );

                    planner.addTask(exam);

                    break;

                case 3:
                    System.out.println(" Enter title: ");
                    String presentationTitle = input.nextLine();

                    System.out.println("Enter deadline: ");
                    String presentationDeadline = input.nextLine();

                    System.out.println("Enter priority: ");
                    String presentationPriority = input.nextLine();

                    int preparationLevel;
                    do {

                        System.out.println("Enter preparation level(0-100): ");
                        preparationLevel = input.nextInt();
                        input.nextLine();

                        if (preparationLevel < 0 || preparationLevel>100){
                            System.out.println("Invalid level. Please enter between 0 and 100.");
                        }
                    }while (preparationLevel < 0 || preparationLevel > 100);

                    PresentationTask presentation = new PresentationTask(
                            presentationTitle,
                            presentationDeadline,
                            presentationPriority,
                            preparationLevel
                    );

                    planner.addTask(presentation);

                    break;

                case 4:

                    planner.displayAllTasks();

                    break;

                case 5:

                    System.out.println("Enter task index: ");
                    int index = input.nextInt();
                    input.nextLine();

                    planner.completeTask(index);

                    break;

                case 0:

                    System.out.println("Thank you for using the planner system!");

                    break;

                default:
                    System.out.println("Invalid choice.");
            }
       }
        while (choice !=0);

        input.close();
    }
}
