package OOPS;

class Student{
    private int id;
    private String name;

    public Student(String myname,int myid){
        id=myid;
        name=myname;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

}
public class Constructor {
    public static void main(String[] args) {
        Student s=new Student("Abhi", 15);
        System.out.println(s.getName());
        System.out.println(s.getId());
        
    }
}
