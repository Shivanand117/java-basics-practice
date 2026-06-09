package Collectons;

import java.util.HashSet;

public class SetHashSet {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(40);
        hs.add(10);
        hs.add(30);
        hs.add(20);
        hs.add(10);
        hs.add(40);

        //Duplicates ignored,insertion order is not manitaned
        //only one null value is allowwed
        System.out.println("Elements : "+ hs);

        //searchng
        System.out.println("contains(): "+hs.contains(30));
        //removing
        hs.remove(20);
        System.out.println("After removing 20: "+hs);

        //size
        System.out.println("size(): "+hs.size());

        //isEmpty
        System.out.println("isEmpty() :"+hs.isEmpty());

        //clear()
         hs.clear();
        System.out.println("After clear(): "+ hs);
    }
}
