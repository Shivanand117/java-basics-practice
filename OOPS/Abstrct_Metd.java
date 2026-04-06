package OOPS;
abstract class Add{
    //*abstract int add(int a,int b);
}
class Task extends Add{
    int add(int a,int b){
        return a+b;
    }
    
}


public class Abstrct_Metd {
    public static void main(String[] args) {
        Task t =new Task();
        System.out.println(t.add(4,7));
    }
}
