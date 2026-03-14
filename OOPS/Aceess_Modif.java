package OOPS;

class Worker{
    private  int id;
    private String name;

    public void setName(String n){
        name=n;
    }
     public String  getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }

}

public class Aceess_Modif {
    public static void main(String[] args) {
        Worker e=new Worker();
        e.setName("Shivanand");
        System.out.println(e.getName());
        e.setId(17);
        System.out.println(e.getId());
        
    }
}
