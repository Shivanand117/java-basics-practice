package Methods;
class Student{
    int id;
    int marks;
    String name;

     Student(int id,int marks,String name) {
        this.id=id;
        this.marks=marks;
        this.name=name;
    }
    public String toString(){
        return id+" ";
    }
    public boolean equals(Student s){
        if(this.id==s.id && this.marks==s.marks){
            return true;
        }
        return false;
    }
    
}

public class ToStringToeql {
    public static void main(String[] args) {
        Student s1=new Student(12, 99,"abc");
        Student s2=new Student(12, 99,"xyz");
        System.out.println(s1);
        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));

    }
    
}
