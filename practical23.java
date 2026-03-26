// Write a program that defines a Circle class with two constructors. The  first  form  accepts  a  double  value  that represents the radius of the circle. The second form accepts the integer radius of the circle and calculates the area of the circle
class circle{
    double radius;
    circle(double r){
        radius = r;
    }
    circle(int r){
        radius = r;
    }
    double area(){
        return Math.PI * radius * radius;
    }
    double circumference(){
        return 2 * Math.PI * radius;
    }
    void display(){
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }
}
public class practical23 {
    public static void main(String[] args) {
        circle c1 = new circle(5.5); // Using the constructor that accepts a double value
        circle c2 = new circle(7); // Using the constructor that accepts an integer value        System.out.println("Circle 1:");
        c1.display();
        System.out.println("\nCircle 2:");
        c2.display();
    }
        
}
