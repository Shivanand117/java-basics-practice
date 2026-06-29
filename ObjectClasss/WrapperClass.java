package ObjectClasss;

public class WrapperClass {
 public static void main(String[] args) {
    Boolean b=new Boolean("true");
    Boolean  b1=new Boolean("True");
    Boolean b2=new Boolean("TRUe");
    System.out.println(b);
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b.equals(b2));
    System.out.println(b.equals(b1));
    Boolean b3=new Boolean("yes");
    Boolean b4=new Boolean("no");
    System.out.println(b3);
    System.out.println(b4);
    System.out.println(b3.equals(b4));
    Boolean b5=new Boolean("False");
    System.out.println(b5);
    System.out.println(b1.equals(b5));
    Boolean b6=new Boolean("false");
    System.out.println(b6);
    System.out.println(b5.equals(b6));
    // Boolean b5=new Boolean('"malika');
 }   
}
