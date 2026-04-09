package OOPS;
class Vehicle {
    void start() {
        System.out.println("Vehicle is Starting");
    }
}

// Hierarchical Inheritance
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is Driving");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is Riding");
    }
}

// Interface (for Multiple Inheritance)
interface Electric {
    void charge();
}

interface GPS {
    void navigate();
}

// Multiple Inheritance + Hierarchical = Hybrid
class ElectricCar extends Car implements Electric, GPS {
    public void charge() {
        System.out.println("Electric Car is Charging");
    }

    public void navigate() {
        System.out.println("GPS Navigation is ON");
    }
}

public class HybridExample {
    public static void main(String[] args) {

        ElectricCar e = new ElectricCar();

        e.start();     
        e.drive();     
        e.charge();    
        e.navigate();  
    }
}