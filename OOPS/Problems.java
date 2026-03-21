package OOPS;
class Sqare{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class Problems {
    public static void main(String[] args) {
        Sqare s=new Sqare();
        s.side=3;
        System.out.println(s.area());
        System.out.println(s.perimeter());
        
    }
}
