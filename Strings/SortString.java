package Strings;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str="Programming";
        str=str.toLowerCase();

        char []arr=str.toCharArray();
        
        Arrays.sort(arr);

        String result=new String(arr);

        System.out.println(result);
    }
}
