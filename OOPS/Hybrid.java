package OOPS;
class Vehicle{
    void start(){
        System.out.println("Vehicle is Starting");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("car is driving");
    }
}
class Bike extends Vehicle{
    void ride(){
        System.out.println("bike is riding");
    }
}
interface Electricc{
    void charge();
}
class ElectricCarr extends Car implements Electricc{
    public void charge(){
        System.out.println("Electric car is Charging");
    }
}
public class Hybrid {
    public static void main(String[] args) {
        ElectricCarr e=new ElectricCarr();
        e.start();
        e.drive();
        e.charge();
    }
    
}
