package Collectons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingGenPrim {
    public static void main(String[] args) {
        ArrayList<Integer>a1=new ArrayList(Arrays.asList(50,40,10,20,30));
        System.out.println("Elememnts Before Sorting: ");
        System.out.println(a1);
        System.out.println("Elememts after Sorting");
        Collections.sort(a1);
        System.out.println(a1);
        System.out.println("Elements after reversing order: ");
        Collections.reverse(a1);
        System.out.println(a1);
    }
}
