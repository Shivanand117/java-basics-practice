package Collectons;

import java.util.Comparator;
import java.util.TreeSet;

public class StringSortingComparator {
    public static void main(String[] args) {
        TreeSet t=new TreeSet<>(new MYComparator());
        t.add("Roja");
        t.add("ShobaRani");
        t.add("RajaKumari");
        t.add("GangaBhavani");
        t.add("Ramulamma");
        System.out.println(t);
    }
}
class MYComparator implements Comparator<String>{
    public int compare(String s1,String s2){
        // String s1=obj1.toString();
        // String s2=(String)obj2;

        // return s1.compareTo(s2);
        // return s2.compareTo(s1);
        return -s1.compareTo(s2);
    }
}
