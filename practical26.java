//Create a class Vehicle, which has single variable NoOfWheels.  Develop  two  subclasses, TwoWheeler  and  FourWheeler.  Develop subclasses  of  these  2  subclasses.  Create instances of these classes and print appropriate details. (use super keyword).
class Vehicle {
    int NoOfWheels;

    Vehicle(int NoOfWheels) {
        this.NoOfWheels = NoOfWheels;
    }
}

class TwoWheeler extends Vehicle {
    TwoWheeler() {
        super(2);
    }
}

class FourWheeler extends Vehicle {
    FourWheeler() {
        super(4);
    }
}

class Bike extends TwoWheeler {
    String modelName;
    
    Bike(String modelName) {
        super(); // Calls the constructor of TwoWheeler
        this.modelName = modelName;
    }
    
    void displayDetails() {
        System.out.println("Vehicle Type: Bike, Model: " + modelName + ", Number of Wheels: " + NoOfWheels);
    }
}

class Car extends FourWheeler {
    String modelName;
    
    Car(String modelName) {
        super(); // Calls the constructor of FourWheeler
        this.modelName = modelName;
    }
    
    void displayDetails() {
        System.out.println("Vehicle Type: Car, Model: " + modelName + ", Number of Wheels: " + NoOfWheels);
    }
}

public class practical26 {
    public static void main(String[] args) {
        Bike myBike = new Bike("Royal Enfield");
        myBike.displayDetails();

        Car myCar = new Car("Honda Civic");
        myCar.displayDetails();
    }
}
