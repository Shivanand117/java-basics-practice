package OOPS;
class Animal{
    String name;
    String color;
    double price;
}
class Dog  extends Animal{
    void sound(){
        System.out.println("The Dog is barking like bow---bow");
    }
}

public class Downcasting {
    public static void main(String[] args) {
        Animal a=new Dog();
        Dog d=(Dog)a;
            System.out.println(d.name="browny");
            System.out.println(d.color="brown");
            System.out.println(d.price=150000);
            d.sound();
    }
    
}
