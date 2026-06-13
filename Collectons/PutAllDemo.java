package Collectons;

import java.util.HashMap;

public class PutAllDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>hm1=new HashMap<>();
        hm1.put(101, "Alex");
        hm1.put(102, "Aion");
        System.out.println("hm1: "+hm1);

        HashMap<Integer,String>hm2=new HashMap<>();
        hm2.put(105, "Bob");
        hm2.put(104, "Boron");
        System.out.println("hm2: "+hm2);
        //Adding hm2 into hm1
        hm1.putAll(hm2);
        System.out.println(hm1);
    }
}
