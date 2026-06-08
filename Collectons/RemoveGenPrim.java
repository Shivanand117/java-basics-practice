package Collectons;

import java.util.ArrayList;

public class RemoveGenPrim {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(60);
        System.out.println(a1);
        //remove(int index)
        a1.remove(4);
        System.out.println(a1);

        ArrayList<Integer>a2=new ArrayList<>();
        a2.add(10);
        a2.add(20);
        a2.add(50);
        System.out.println(a2);

        // a1.removeAll(a2);
        // System.out.println(a1);

        a1.retainAll(a2);
        System.out.println(a1);

    }
}
