package OOPS;
interface Add{
    int add(int a,int b);
}
class Task implements Add{
    public int add(int a,int b){
        return  a+b;
    }
}
public class Interface {
    public static void main(String[] args) {
        Task t=new Task();
        System.out.println(t.add(4, 13));
    }
    
}
