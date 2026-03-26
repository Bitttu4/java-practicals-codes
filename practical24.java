//Write a program to create a class Employee with data members name, age, salary and empno. Create an array of 10 employees and display the details of all the employees.

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
        System.out.println();
    }
}

public class practical24 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Aarya", 20, 50000);
        employees[1] = new Employee("Chesha", 20, 60000);
        employees[2] = new Employee("Ruchi", 20, 55000);
        employees[3] = new Employee("Vinai", 20, 70000);
        employees[4] = new Employee("Amit", 28, 45000);
        employees[5] = new Employee("Sneha", 35, 80000);
        employees[6] = new Employee("Vikram", 40, 90000);
        employees[7] = new Employee("Pooja", 29, 58000);
        employees[8] = new Employee("Rajesh", 32, 65000);
        employees[9] = new Employee("Kavita", 27, 52000);
       

        System.out.println("Details of Employees:");
        for (Employee emp : employees) {
            emp.display();
        }
    }
}
