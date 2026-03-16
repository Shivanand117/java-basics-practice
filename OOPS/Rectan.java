package OOPS;

class  Rectangle{
    private  int length;
    private int breadth;

    public Rectangle(){
        this.length=4;
        this.breadth=5;
    }

    public Rectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }

}

public class Rectan {
 public static void main(String[] args) {
    Rectangle r=new Rectangle(5,14);
    System.out.println(r.getBreadth());
    System.out.println(r.getLength());

    
 }   
}
