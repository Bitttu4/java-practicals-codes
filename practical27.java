// Write a program that declares an abstract class A with an abstract method display( ). Provide subclasses A1 & A2 that each implements this method. Create instance of these subclasses & invoke that method.

abstract class A {
    abstract void display();
}

class A1 extends A {
    @Override
    void display() {
        System.out.println("Inside A1's implementation of display().");
    }
}

class A2 extends A {
    @Override
    void display() {
        System.out.println("Inside A2's implementation of display().");
    }
}

public class practical27 {
    public static void main(String[] args) {
        A obj1 = new A1();
        obj1.display();
        
        A obj2 = new A2();
        obj2.display();
    }
}
