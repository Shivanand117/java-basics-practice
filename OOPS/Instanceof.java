package OOPS;
class Animall{
    String name;
    String clolor;
    double price; 
}
class Dogg extends Animall{
    void sound(){
        System.out.println("Barking dog");
    }
}

public class Instanceof {
    public static void main(String[] args) {
        Animall a=new Dogg();
        if(a instanceof Dogg){
            Dogg d =(Dogg)a;
            d.sound();
        }
    }
    
}
