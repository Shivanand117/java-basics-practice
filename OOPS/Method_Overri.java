package OOPS;

class Emp{
    int id;

    void action(){
        System.out.println("Employee works for th ecompany");
    }
}
class Develop extends Emp{
   
    @Override
    void action(){
        super.id=200;
        super.action();
        System.out.println("Developer develops apllication");
    }
}
public class Method_Overri {

    public static void main(String[] args) {
        Develop d =new Develop();
        d.action();
        System.out.println(d.id);
    }
}
