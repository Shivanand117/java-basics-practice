package Collectons;

import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList l=new ArrayList<>();
        l.add("A");
        l.add(10);
        l.add(null);
        l.add("A");
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.add(2, "M");
        l.add("N");
        System.out.println(l);
    }
}
