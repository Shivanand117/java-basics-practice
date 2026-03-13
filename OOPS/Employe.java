package OOPS;
class Employeee{
    int sal;
    String name;
    public int getSalary(){
        return sal;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
//     public void setSalary(int s){
//     sal = s;
// }

}

public class Employe {
    public static void main(String[] args) {
        Employeee harry=new Employeee();
        harry.setName("JOHN");
        harry.sal=12000;
     //   harry.setSalary(12000);
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
    }
}
