// Write a program of constructor overloading and make zero argument constructor to set a default values of student name, roll no and total marks. And make another constructor with all the three parameters and make use of ‘this’ keyword. Using methods, display values of both the constructors. 
class Student {
    private String name;
    private int rollNo;
    private double totalMarks;

    // Zero-argument constructor
    public Student() { // default constructor printing default values
        this.name = "Default Name";
        this.rollNo = 0;
        this.totalMarks = 0.0;
    }

    // Three-argument constructor
    public Student(String name, int rollNo, double totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
    }
}

public class practical22 {
    public static void main(String[] args) {
        // Using zero-argument constructor
        Student student1 = new Student();
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        // Using three-argument constructor
        Student student2 = new Student("Aarya Patel",19,8.5);
        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();
    }    
}
