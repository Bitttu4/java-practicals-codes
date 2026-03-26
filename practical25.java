// Write  a  program  to  create  a  class  called Teaching having one member nameOfSubject and another class called NonTeaching having member typeOfWork. Both the classes extend the Employee class. Provide information of two Teaching  and  two  NonTeaching  employees. Print all the information of employee by the given empNo.
import java.util.Scanner;
class Employee {
    String name;
    int age;
    double salary;
    int empno;

    private static int empCounter = 0;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.empno = ++empCounter;
    }

    public void display() {
        System.out.println("Employee Number: " + empno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

class Teaching extends Employee {
    String nameOfSubject;

    public Teaching(String name, int age, double salary, String nameOfSubject) {
        super(name, age, salary);
        this.nameOfSubject = nameOfSubject;
    }


    public void display() {
        super.display();
        System.out.println("Subject: " + nameOfSubject);
        System.out.println();
    }
}

class NonTeaching extends Employee {
    String typeOfWork;

    public NonTeaching(String name, int age, double salary, String typeOfWork) {
        super(name, age, salary);
        this.typeOfWork = typeOfWork;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type of Work: " + typeOfWork);
        System.out.println();
    }
}


public class practical25 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new Teaching("Aarya Patel", 20,85000, "Physics");
        employees[1] = new Teaching("Chesha Patel", 20,78000, "Mathematics");
        employees[2] = new NonTeaching("Ruchi Tanwar", 20, 45000, "Administration");
        employees[3] = new NonTeaching("Vinai Pansuriya", 20, 38000, "Library Management");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Number to search: ");
        int searchEmpNo = sc.nextInt();
        sc.close();
        System.out.println("Searching for Employee Number: " + searchEmpNo);

        boolean found = false;
        for (Employee emp : employees) {
            if (emp.empno == searchEmpNo) {
                System.out.println("\nEmployee Found. Details:");
                emp.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee with Employee Number " + searchEmpNo + " not found.");
        }
    }
}