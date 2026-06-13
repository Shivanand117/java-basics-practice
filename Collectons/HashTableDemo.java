package Collectons;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String>ht=new Hashtable<>();
        ht.put(105, "Alex");
        ht.put(1, "smith");
        ht.put(101, "Rosy");
        ht.put(102, "Alean");

        System.out.println(ht);

        //hashtable
        //doesnot maintain insertion order
        //doesnot not mmaintaoin asecenf=ding order
        //doesnot maintain descending order

        System.out.println(ht.get(101));
        System.out.println(ht.containsKey(102));
        ht.remove(102);
        
    }
}
