package ObjectClasss;
class Student3{
    String name;
    int rollno;

     Student3(String name,int rollno) {
        this.name=name;
        this.rollno=rollno;
    }
    //equals method
    public boolean equals(Object obj){
        try{
        Student3 s=(Student3)obj;
        if(name.equals(s.name) && rollno==s.rollno){
            return true;
        }else{
            return false;
        }
    }catch(ClassCastException c){
        return false;
    }catch(NullPointerException n){
        return false;
    }
    }
    
}
public class Equla2Mtd {
    public static void main(String[] args) {
        Student3 s=new Student3("durga", 101);
        Student3 s1=new Student3("ravi", 102);
         Student3 s2=new Student3("durga", 101);
         Student3 s3=s;
         System.out.println(s.equals(s1));
         System.out.println(s.equals(s2));
         System.out.println(s.equals(s3));
         System.out.println(s.equals("durga"));
         System.out.println(s.equals(null));
    }
}
