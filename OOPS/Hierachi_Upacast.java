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
class Cat  extends Animal{
    void sound(){
        System.out.println("Meow Meow");
    }
}

public class Hierachi_Upacast {
    public static void main(String[] args) {
        Animal a=new Cat();
        Cat c=(Cat)a;
        c.sound();
            System.out.println(c.name="browny");
            System.out.println(c.color="brown");
            System.out.println(c.price=150000);


    }
    
}
