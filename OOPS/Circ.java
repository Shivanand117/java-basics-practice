package OOPS;
import java.util.*;
class Circle{
    double r;
    public double  area(){
        System.out.println("Area of circle is: ");
        return Math.PI*r*r;

    }
}
public class Circ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle c=new Circle();
        System.out.println("Enter Diameter of Circle: ");
        double d=sc.nextDouble();
        c.r=d/2;
        double res=c.area();
        System.out.println(res);

        
    }
}
