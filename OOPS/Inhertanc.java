package OOPS;

class Base{
   public  int x;
    public int  getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in base and seetting X now: ");
        this.x=x;
    }
    public void printMe(){
        System.out.println("I am Constructor...");
    }
}
class Derived extends Base{
    public int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am  in the derived class: ");
        this.y = y;
    }
}

public class Inhertanc {
    public static void main(String[] args) {
        Base b=new Base();
        b.setX(5);
        System.out.println(b.getX());

        Derived d =new Derived();
        d.setX(4);
        System.out.println(d.getX());
         d.setY(6);
         System.out.println(d.getY());
         d.setX(8);
         System.out.println(d.getX());

        
    }
}
