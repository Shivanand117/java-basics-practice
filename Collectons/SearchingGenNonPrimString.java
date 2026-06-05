package Collectons;

import java.util.ArrayList;

public class SearchingGenNonPrimString {
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<>();
        a1.add("Hi");
        a1.add("Hello");
        a1.add("Bye");
        a1.add("Good");
        a1.add("Morning");
        System.out.println(a1);

        //indeexof(object 0)
        System.out.println(a1.indexOf("Good"));
        //lastindexof(object o)
        System.out.println(a1.lastIndexOf("Morning"));
        //contains(Onject o)
        System.out.println(a1.contains("Bye"));

        ArrayList<String>a2=new ArrayList<>();
        a2.add("Hi");
        a2.add("Hello");
        System.out.println(a1.containsAll(a2));
    }
}
