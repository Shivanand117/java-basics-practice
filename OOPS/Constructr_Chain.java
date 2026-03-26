package OOPS;
 
public class Constructr_Chain{

     Constructr_Chain() {
        System.out.println("Hello Students.....");
    }
      public Constructr_Chain(int id) {
        this();
            System.out.println( id);
        
    }
     Constructr_Chain(String name,int id){
       this(id);
  
    System.out.println(name);
  }
     
    
    public static void main(String[] args) {
        Constructr_Chain c=new Constructr_Chain("Mosh",102);

    }
}