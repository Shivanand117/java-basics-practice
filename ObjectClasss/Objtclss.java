package ObjectClasss;

class Laptop{
    String model;
    int price;
    public String toString(){
        return model+" : "+price;
    }
    public boolean equals(Object o){
          Laptop l = (Laptop)o;
        return this.model.equals(l.model) && this.price==l.price;
    }
    @Override
    public int hashcode(){
        return model.hashCode()+price;
    }

}

public class Objtclss {
    public static void main(String[] args) {
        Laptop  obj=new Laptop();
        obj.model="HP Victus";
        obj.price=65000;

        Laptop  obj1=new Laptop();
        obj1.model="HP Victus";
        obj1.price=65000;

        boolean result=obj.equals(obj1);
        System.out.println(result);
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
    }
}
