package Collectons;

import java.util.TreeMap;

public class MapTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(103, "Alex");
        tm.put(101, "Bob");
        tm.put(102, "Hacker");
        //keys automatically  sorted
        System.out.println(tm);
        System.out.println(tm.get(101));
        System.out.println(tm.containsKey(102));
        tm.remove(103);
        System.out.println(tm);
        System.out.println(tm.keySet());
        System.out.println(tm.values());
        System.out.println(tm.entrySet());
    }
}
