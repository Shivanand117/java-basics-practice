package Strings;

import java.util.Scanner;


public class Sort_Char_String{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        str=str.toLowerCase();

        int count[]=new int[26];
        
        for(char ch:str.toCharArray() ){
            count[ch -'a']++;
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<26;i++){
            while(count[i]>0){
                result.append((char)(i+'a'));
                count[i]--;
            }
        }
        System.out.println(result.toString());
        
    }
}