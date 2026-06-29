package ObjectClasss;
class Student{
    int id;
    String name;

    Student(int id,String name) {
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return name+" "+id;
    }
    
}
public class ToStringDemo {
    public static void main(String[] args) {
        Student s1=new Student(101, "Vaniii");
        Student s2=new Student(102, "Shivanand");
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);
        
    }
}
