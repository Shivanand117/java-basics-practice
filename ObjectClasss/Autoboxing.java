package ObjectClasss;

public class Autoboxing {
    static Integer I=10;
    static Integer J=0;
    static Integer N;
    public static void main(String[] args) {
        int i=I;
        int j=J;

        Integer X=10;
        Integer Y=X;
        X++;
        System.out.println(X);
        System.out.println(Y);
        System.out.println(X==Y);

       try {
        int n=N;
        System.out.println(n);
       }
        catch (Exception e) {
        System.out.println("cant assign null to integer!! ");
       }
        // m2(j);
        System.out.println(j);
        
        m1(i);
    }
    public static void m1(Integer K){
        int m=K;
        System.out.println(m);
    }
    //  public static void m2(Integer K){
    //     int m1=K;
    //     System.out.println(m1);
    // }

}
