package Collectons;

import java.util.Comparator;
import java.util.TreeSet;
class Myycomparator implements Comparator<Integer>{
    public int compare(Integer obj1,Integer obj2){

        // return Obj1.compareTo(obj2);[0, 10, 15, 20]
       // return -Obj1.compareTo(obj2);[20, 15, 10, 0]
       // return Obj2.compareTo(obj1);[20, 15, 10, 0]
        //  return -Obj2.compareTo(obj1);[0, 10, 15, 20]
       //   return 1;[10, 0, 15, 20, 20]
    //    return -1;[20, 20, 15, 0, 10]
    // return 0;[10]
    return obj1.compareTo(obj2);


    }
}
public class VariousImplmentionsofComparetor {
     public static void main(String[] args) {
        TreeSet t=new TreeSet(new Myycomparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(20);
        t.add(20);
        System.out.println(t);
    }
}

