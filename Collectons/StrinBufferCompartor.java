package Collectons;

import java.util.Comparator;
import java.util.TreeSet;

public class StrinBufferCompartor {
    public static void main(String[] args) {
        TreeSet t=new TreeSet<>(new MComparator());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));
        System.out.println(t);

    }
}
class MComparator implements Comparator<StringBuffer>{
    public int compare(StringBuffer s1,StringBuffer s2){
        // String s1=obj1.toString();
        // String s2=obj2.toString();

        // return s1.compareTo(s2);
        // return s2.compareTo(s1);
        //return s1.compareTo(s2);
         return -s1.compareTo(s2);
    }
}
