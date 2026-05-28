package planner;

public class Student {

    private String name;
    private String department;
    private int yearLevel;

    //Constructor
    public Student(String name, String department, int yearLevel){
        this.name = name;
        this.department = department;
        this.yearLevel = yearLevel;
    }

    //Getter
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    //Display method
    public void displayStudentInfo(){
        System.out.println("\n==== STUDENT INFORMATION ====");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Year Level: " + yearLevel);
    }
}
