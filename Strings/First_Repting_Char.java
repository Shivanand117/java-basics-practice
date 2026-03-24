package Strings;

import java.util.HashSet;

public class First_Repting_Char {
    static char firstRepeating(String str){
        HashSet<Character>set=new HashSet<>();
        for(char ch:str.toCharArray()){
            if(set.contains(ch)){
                return ch;
            }
            set.add(ch);
        }
        return '$';

    }
    public static void main(String[] args) {
        System.out.println(firstRepeating("programming"));
    }
}
