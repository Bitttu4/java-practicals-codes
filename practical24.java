//Write a program to create a class employee with data members name, age, salary and empno. Create an array of 10 employees and display the details of all the employees.

class employee {
    String name;
    int age;
    double salary;
    int empno;

    private static int empCounter = 0;

    public employee(String name, int age, double salary) {
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
        employee[] emp = new employee[10];

        emp[0] = new employee("Aarya", 20, 50000);
        emp[1] = new employee("Chesha", 20, 60000);
        emp[2] = new employee("Ruchi", 20, 55000);
        emp[3] = new employee("Vinai", 20, 70000);
        emp[4] = new employee("Amit", 28, 45000);
        emp[5] = new employee("Sneha", 35, 80000);
        emp[6] = new employee("Vikram", 40, 90000);
        emp[7] = new employee("Pooja", 29, 58000);
        emp[8] = new employee("Rajesh", 32, 65000);
        emp[9] = new employee("Kavita", 27, 52000);
       

        System.out.println("Details of Employees:");
        for (employee e : emp) {
            e.display();
        }
    }
}
