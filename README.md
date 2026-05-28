# Smart Academic Planner System

## Project Overview

The **Smart Academic Planner System** is a console-based Java application developed as a **Minimum Viable Product (MVP)** to demonstrate the core Object-Oriented Programming (OOP) concepts learned in:

* V1.0 – Introduction to OOP in Java
* V2.0 – Core OOP Concepts
* V3.0 – Java Inheritance
* V4.0 – Java Polymorphism

This system helps students manage different academic tasks such as:

* Assignments
* Exams
* Presentations

The application allows users to:

* Add tasks
* Display all tasks
* Mark tasks as completed
* Track preparation progress
* Manage tasks dynamically using polymorphism

---

# Features

* Personalized student planner
* Add Assignment Tasks
* Add Exam Tasks
* Add Presentation Tasks
* Display all tasks with task indexes
* Mark tasks as completed
* Automatic preparation update to 100% when completed
* Input validation for preparation percentages
* Runtime polymorphism using superclass references
* Constructor overloading
* Method overriding
* Abstract class implementation

# Technologies Used

* Java
* IntelliJ IDEA
* Object-Oriented Programming (OOP)

---

# Project Structure

```text
planner
│
├── Main.java
├── PlannerSystem.java
├── Student.java
├── Task.java
├── AssignmentTask.java
├── ExamTask.java
└── PresentationTask.java
```

---

# OOP Concepts Demonstrated

## 1. Classes and Objects (V1.0 & V2.0)

The project defines multiple classes with appropriate attributes and methods.

### Example Classes

* Task
* AssignmentTask
* ExamTask
* PresentationTask
* Student
* PlannerSystem

### Object Creation Example

```java
AssignmentTask assignment = new AssignmentTask(
        assignmentTitle,
        assignmentDeadline,
        assignmentPriority,
        subject
);
```

---

# 2. Encapsulation (V1.0 & V2.0)

Private fields are used to protect data.

### Example

```java
private String title;
private boolean completed;
private int preparationPercentage;
```

Getters and setters are implemented for controlled access.

### Example

```java
public String getTitle() {
    return title;
}
```

---

# 3. Inheritance (V3.0)

The project uses inheritance to create an IS-A relationship.

## Class Hierarchy

```text
Task
 ├── AssignmentTask
 ├── ExamTask
 └── PresentationTask
```

### Example

```java
public class ExamTask extends Task{
}
```

Subclasses inherit common fields and methods from the Task superclass, improving code reusability.

---

# 4. Polymorphism (V4.0)

## Runtime Polymorphism (Method Overriding)

Subclasses override methods from the parent class.

### Overridden Methods

```java
displayTask()
calculatePriority()
markcompleted()
```

### Example

```java
@Override
public void calculatePriority() {

    if (isCompleted()) {
        System.out.println("Exam task completed successfully.");
        return;
    }

    if (preparationPercentage < 50) {
        System.out.println("High Priority: More preparation needed!");
    }
}

This demonstrates runtime polymorphism because the JVM dynamically determines which method implementation to execute.
```

---

## Compile-Time Polymorphism (Constructor Overloading)

The project demonstrates constructor overloading. 

Same class name, but different parameters in constructors.  

### Example

```java
public Task(){
}

public Task(String title, String deadline, String priority){
}
```

---

## Superclass References and Dynamic Dispatch

The planner stores different subclass objects using superclass references.

### Example

```java
private ArrayList<Task> tasks;
```

Dynamic method execution:

```java
task.calculatePriority();
```

The JVM automatically calls the correct subclass version at runtime.

---

# 5. Abstraction

The project uses abstraction through the abstract Task class.

The Task class provides a general blueprint for all academic tasks while forcing subclasses to implement their own calculatePriority() method.

### Example

```java
public abstract class Task {
    public abstract void calculatePriority();
}
```

---

# Input Validation

The system validates preparation percentages and levels between 0 and 100.

### Example

```java
do {
    System.out.println("Enter preparation percentage (0-100): ");
    preparationPercentage = input.nextInt();

} while (preparationPercentage < 0 || preparationPercentage > 100);
```

---

# How to Run the Project

## Step 1

Open the project in IntelliJ IDEA.

## Step 2

Compile and run Main.java.

## Step 3

Follow the menu instructions in the console.

---

# Sample Output

```text
=======================================
Wubit's & Tsedi's SMART ACADEMIC PLANNER
=======================================

1. Add Assignment Task
2. Add Exam Task
3. Add Presentation Task
4. Display All Tasks
5. Mark Task as Completed
0. Exit
```

---

# Educational Purpose

This project was created as an academic MVP project to practice:

* OOP Design
* Encapsulation
* Inheritance
* Polymorphism
* Abstraction
* Constructor Overloading
* Dynamic Dispatch
* Java Collections

---

# Authors 

Developed by:
-Wuberst Goshu
-Tsedale Solomon
