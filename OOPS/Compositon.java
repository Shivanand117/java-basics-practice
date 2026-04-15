package OOPS;
class Engine{
   String engineType;

  Engine(String engineType) {
    this.engineType=engineType;
    }
    void startEngine(){
        System.out.println("Start engine");
    }
}
class Carr{
    String brand;
    Engine engine;

     Carr(String brand) {
        this .brand=brand;
        engine=new Engine("Petrol");
    }
    void startCar(){
        engine.startEngine();
        System.out.println("Car Started and brand of this car is "+brand);
    }
    
}
public class Compositon {
    public static void main(String[] args) {
        Carr c=new Carr("bmw");
        c.startCar();
    }
    
}
