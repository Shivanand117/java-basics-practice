package Collectons;

import java.util.LinkedHashSet;

public class SetLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer>lhs=new LinkedHashSet<>();

        lhs.add(40);
        lhs.add(10);
        lhs.add(30);
        lhs.add(20);
          lhs.add(10);

          System.out.println("Elements: "+lhs);

          //Searching
          System.out.println("Contains 30 : "+lhs.contains(30));

          //Removing
          lhs.remove(20);
          System.out.println("After Removing 20"+lhs);

          //size()
          System.out.println("Size: "+lhs.size());

          //isEmpty
          System.out.println("isEmpty : "+lhs.isEmpty());

          //clear
          lhs.clear();
          System.out.println("After clear(): "+lhs);
    }
}
