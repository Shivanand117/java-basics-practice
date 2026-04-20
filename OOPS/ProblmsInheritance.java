package OOPS;

class Circlle{
    public int radius;

     Circlle(int r) {
        System.out.println("This is Circle class Constructor");
        this.radius=r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinderr extends Circlle{
    public int height;

     Cylinderr(int r,int h) {
        super(r);
        System.out.println("I am Cylinder constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
    
}
public class ProblmsInheritance {
    public static void main(String[] args) {
    //     Circlle c=new Circlle(12);
         Cylinderr c1=new Cylinderr(10, 8);
    }
   
}
