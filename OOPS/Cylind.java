package OOPS;

class  Cylinder{
    private int radius;
    private int height;
    public Cylinder(int radius,int height){
        this.height=height;
        this.radius=radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void  surfacArea(){
        double area=2*Math.PI*radius*height+2*Math.PI*radius*radius;
        System.out.println(area);
    }
    public void  volume(){
        double vol=Math.PI*radius*radius*height;
        System.out.println(vol);
    }

}

public class Cylind {
    public static void main(String[] args) {
        Cylinder c=new Cylinder(9,12);
        // c.setRadius(9);
        // c.setHeight(12);
        // System.out.println(c.getRadius());
        // System.out.println(c.getHeight());
        // c.surfacArea();
        // c.volume();
       System.out.println( c.getRadius());
       System.out.println(c.getHeight());
        
        c.volume();
        c.surfacArea();
        
    }
}
