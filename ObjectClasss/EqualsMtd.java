package ObjectClasss;
class Studentt{
    String name;
    int rollno;
    Studentt(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
}
public class EqualsMtd {
    public static void main(String[] args) {
        Studentt s1=new Studentt("Durga", 101);
        Studentt s2=new Studentt("Ravi", 102);
        Studentt s3=new Studentt("Durga", 101);
        Studentt s4=s1;
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        
    }
}
