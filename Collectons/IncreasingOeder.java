package Collectons;

import java.util.Comparator;
import java.util.TreeSet;

public class IncreasingOeder {
    public static void main(String[] args) {
        TreeSet t=new TreeSet<>(new ComparatorDemoo());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add("XX");
        t.add("ABCD");
        t.add("A");
        System.out.println(t);
    }
}
class ComparatorDemoo implements Comparator<Object>{
    public int compare(Object obj1,Object obj2){
        String s1=obj1.toString();
        String s2=obj2.toString();
        int l1=s1.length();
        int l2=s2.length();
        if(l1<l2){
            return -1;
        }
        else if(l1>l2){
            return 1;
        }
        else{
            return s1.compareTo(s2);
        }
    }
}
