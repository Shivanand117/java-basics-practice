package Collectons;

import java.util.HashMap;

public class Map_HashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(5, "D");
        hm.put(4, "E");

        System.out.println("elements: "+hm);
        //getkey
        System.out.println(hm.get(5));
        //containsKey
        System.out.println(hm.containsKey(2));
        //containsvalue
        System.out.println(hm.containsValue("Z"));
        //removeKey
        System.out.println(hm.remove(2));
        System.out.println(hm);
        //keyset
        System.out.println(hm.keySet());
        //values
        System.out.println(hm.values());
        //entryset
        System.out.println(hm.entrySet());
        //size
        System.out.println(hm.size());
        //isEmpty
        System.out.println(hm.isEmpty());
        //clear
        hm.clear();
        System.out.println(hm);


    }
}
