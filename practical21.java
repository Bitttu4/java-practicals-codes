// Write an application that declares a class named Person. It should have instance variables to record name, age & salary. Use the new operator to create a Person object. Set & display its instance variables. 
 class Person {
    private String name;
    private int age;
    private double salary;

    public Person(){}
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void setdata(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void displaydata(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
};
public class practical21 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setdata("Aarya Patel", 20, 50000.0);
        p1.displaydata();
        p2.setdata("Chesha Patel", 20, 60000.0);
        p2.displaydata();
    }
}
