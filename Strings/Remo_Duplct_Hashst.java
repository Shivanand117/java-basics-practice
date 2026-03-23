package Strings;

import java.util.HashSet;

public class Remo_Duplct_Hashst {

    static String removeduplicate(String str){
        HashSet<Character> set=new HashSet<>();
        String result="";

        for(char ch:str.toCharArray()){

            if(!set.contains(ch)){
                set.add(ch);
                result+=ch;
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        System.out.println(removeduplicate("Programming"));
    }
}
