package OOPS;

class EkClass{
    int a;

    public int getA(){
        return a;
    }

     EkClass(int v) {
       this. a=v;
    }
    public int returnone(){
        return 1;
    }
    
}
class Doclass extends EkClass{

    Doclass(int c) {
      super(c);
        System.out.println("I am a constructor..");
    }
    
}

public class This_Super {
    public static void main(String[] args) {
        EkClass e=new EkClass(4);
        Doclass d=new Doclass(5);
        System.out.println(e.getA());
        
    }
}
