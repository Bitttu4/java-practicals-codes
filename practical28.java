// Write a program using interface inheritance. Make two interfaces one is Shape2D which contains a method to calculate the area of the circle and the second interface Shape3D which contains method to calculate the volume of the sphere. Both the classes, Circle and Sphere extends  one  abstract  class  Shape  which contains a method display( ) to display the area and volume.

interface Shape2D {
    void calculateArea();
}

// Interface inheritance: Shape3D inherits from Shape2D
interface Shape3D extends Shape2D {
    void calculateVolume();
}

abstract class Shape {
    double area;
    double volume;

    public void display() {
        System.out.println("Area: " + area);
        if (volume > 0) {
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume: N/A (2D Shape)");
        }
    }
}

class Circle extends Shape implements Shape2D {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        this.area = Math.PI * radius * radius;
        this.volume = 0; // A 2D circle does not have volume
    }
}

class Sphere extends Shape implements Shape3D {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        this.area = 4 * Math.PI * radius * radius; // Surface area of a sphere
    }

    @Override
    public void calculateVolume() {
        this.volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // Volume of a sphere
    }
}

public class practical28 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.calculateArea();
        System.out.println("--- Circle Details ---");
        circle.display();

        System.out.println();

        Sphere sphere = new Sphere(5.0);
        sphere.calculateArea();
        sphere.calculateVolume();
        System.out.println("--- Sphere Details ---");
        sphere.display();
    }
}
