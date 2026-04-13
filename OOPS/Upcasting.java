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

public class Upcasting {
  public static void main(String[] args) {
    Animal a=new Dog();
    System.out.println(a.name="browny");
    System.out.println(a.color="brown");
    System.out.println(a.price=150000);
  }  
}
