package OOPS;
class phone{
    public  void ring(){
        System.out.println("ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating.....");
    }
    public void callFriend(){
        System.out.println("Calling friend Pavyaaaa.....");
    }
}

public class CellPhone {
    public static void main(String[] args) {
        phone p=new phone();
        p.vibrate();
        p.ring();
        p.callFriend();
        
    }
}
