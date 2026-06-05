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
        

    }
}
