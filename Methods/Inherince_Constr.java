package Methods;

class Base1{
    Base1(){
        System.out.println("I am a Base class consructor..");
    }
    Base1(int x){
        System.out.println("I am a Base class consructor with a value of x  as: "+ x);
    }

}
class Derived1 extends Base1{

    Derived1() {
      //  super(0);
        System.out.println("I am a derived class constructor..");
    }
    Derived1(int x,int y) {
        super(x);
        System.out.println("I am an overloaded constructor with the value of y : "+y);
    }   
}
class ChildofDerived extends Derived1{

    ChildofDerived() {
        System.out.println("I am childofDerived class constructor... ");
    }
    ChildofDerived(int x,int y,int z) {
        super(x, y);
        System.out.println("I am an overloaded constructor with the value of  z: "+z);
    }
    
}

public class Inherince_Constr {
    public static void main(String[] args) {
       // Base1 b=new Base1();
      //  Derived1 d=new Derived1();

     //  Derived1 d=new Derived1(17,18);

     ChildofDerived cd=new ChildofDerived(10,11,12);

        
    }
}
