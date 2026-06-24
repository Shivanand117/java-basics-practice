package  Collectons;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList<>();
        l1.add("Mosh");
        l1.add(30);
        l1.add(null);
        l1.add("Mosh");
        System.out.println(l1);
        l1.add(0, "James");
        l1.add(0, "Alex");
        l1.addFirst("Ameran");
        l1.removeLast();
        System.out.println(l1);
    }
}
