package OOPS;
class Vehile{
    String brand;
    String color;
    double price;
    
}
class Car extends Vehile{
    String engine;
}

public class Singl_levl_inhr {
    public static void main(String[] args) {
        Car c=new Car();
        c.brand="BMW";
        c.color="Black";
        c.price=2500000.00;
        c.engine="1000cc";
        System.out.println(c.brand);
        System.out.println(c.color);
        System.out.println(c.price);
        System.out.println(c.engine);

    }
}
