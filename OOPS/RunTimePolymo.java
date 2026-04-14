package OOPS;
class E{
    void work(){
        System.out.println("-----Employee Works for the company----");
    }
}
class D extends E{
    @Override
    void work(){
        super.work();
        System.out.println("----Developer Develps Apllications----");
    }
}

public class RunTimePolymo {
    public static void main(String[] args) {
       E e=new D();
       e.work();
        // E e=new E();
        // e.work();
    }
}
