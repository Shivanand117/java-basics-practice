package Collectons;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListItertaorDemo {
    public static void main(String[] args) {
        LinkedList l=new LinkedList<>();
        l.add("Balakrishna");
        l.add("venki");
        l.add("chiru");
        l.add("nag");
        System.out.println(l);
        ListIterator ltr=l.listIterator();
        while(ltr.hasNext()){
            String s=(String)ltr.next();
            if(s.equals("venki")){
                ltr.remove();
            }
            else if(s.equals("nag")){
                ltr.add("chaitu");
            }
            else if(s.equals("chiru")){
             ltr.set("charan");
            }

        }
        System.out.println(l);
    }
}
