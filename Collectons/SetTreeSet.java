package Collectons;

import java.util.TreeSet;

public class SetTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>();
        //Addding elements
        ts.add(40);
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(10);
        //Duplicates  ignored
        //only one null is allowed sorted
        System.out.println("Elements: "+ts);

        //Accessing
        System.out.println("First Elemnt: "+ts.first());
        System.out.println("Last Element: "+ts.last());

        //Sorting
        System.out.println("Contains() "+ts.contains(30));

        //removig
        ts.remove(20);
        System.out.println("size(): "+ts.size());

        //size
        System.out.println("size: "+ts.size());

        //chk empty
        System.out.println("isEmpty?: "+ts.isEmpty());

        //clear all 
        ts.clear();
        System.out.println(ts);
    }
}
