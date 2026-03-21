package OOPS;

class Employee{
    int id;
    String name;
    int salary;

public void printdetails(){
    System.out.println("My ID is:"+id);
    System.out.println("My Name is:"+name);
}
public int getsalary(){
    return salary;
}
}
public class Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee e=new Employee();
        e.id=17;
        e.name="Harry";
        e.salary=12000;
        // e.getSalary();
         e.printdetails();
         System.out.println(e.getsalary());

        // Employeee r=new Employeee();
        // r.id=18;
        // r.name="Virat";
        // r.salary=15000;
        // r.printdetails();
        // int salary=r.getsalary();
        // System.out.println(salary);

        
    }
}
