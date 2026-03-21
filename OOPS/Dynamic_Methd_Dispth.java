package OOPS;

class Phone{
    public void showtime(){
        System.out.println("Time is 11 am");
    }
    public void on(){
        System.out.println("Turning on Phone..");

    }
}
class Smartphone extends Phone{
    public void music(){  
        System.out.println("Playing the Music"); 
    }

    public void on(){
        System.out.println("Turning on smaart Phone..");
    }
}

public class Dynamic_Methd_Dispth {
    public static void main(String[] args) {
        // Phone p=new Phone();Allowed
         //Phone p =new SmartPhone();//Allowed
         //SmartPhone s=new SmartPhone();//Allowed
        // p.greet();
        // p.on();
        Phone p=new Smartphone(); //yes it is allowed
      //  p.music();not allowed
        p.on();
        p.showtime();


        
    }
}
