package OOPS;
interface Calc{
    // int add(int a,int b);
}
class Taskk implements Calc{
    public int add(int a,int b){
        return  a+b;
    }
}
public class Abstract {
    public static void main(String[] args) {
        // Calc c=new Taskk();
        // int res=c.add(12, 2);
        // System.out.println(res);

        Taskk t=new Taskk();
        System.out.println(t.add(45, 2));
    }
}
