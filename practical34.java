// Write a program that creates an Array List and adds a Loan object , a Date object , a string, and a Circle object to the list, and use a loop to display all elements in the list by invoking the object’s to String() method.

import java.util.ArrayList;
import java.util.Date;

class Loan {
    double amount;
    
    public Loan(double amount) {
        this.amount = amount;
    }
    
    @Override
    public String toString() {
        return "Loan object [amount=" + amount + "]";
    }
}

class Circle {
    double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return "Circle object [radius=" + radius + "]";
    }
}

public class practical34 {
    public static void main(String[] args) {
        // Create an ArrayList of type Object to hold different types of objects
        ArrayList<Object> list = new ArrayList<>();
        
        // Add various objects to the list
        list.add(new Loan(5000.0));
        list.add(new Date());
        list.add("Hello, I am a String!");
        list.add(new Circle(3.5));
        
        // Use a loop to display all elements by invoking their toString() method
        System.out.println("Elements in the ArrayList:");
        for (Object obj : list) {
            System.out.println("- " + obj.toString());
        }
    }
}