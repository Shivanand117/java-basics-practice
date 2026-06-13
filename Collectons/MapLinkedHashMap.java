package Collectons;

import java.util.LinkedHashMap;

public class MapLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();
        lhm.put(101, "Alex");
        lhm.put(102, "Bob");
        lhm.put(103, "Mosh");
        lhm.put(104, "Alies");
        System.out.println(lhm);
        //get
        System.out.println(lhm.get(101));
       //contains Key
       System.out.println(lhm.containsKey(102));
       //remove
       lhm.remove(103);
       System.out.println(lhm);
       //returnall keys
       System.out.println(lhm.keySet());
       //return all values
       System.out.println(lhm.values());
       //return all entries
       System.out.println(lhm.entrySet());
    }
}
