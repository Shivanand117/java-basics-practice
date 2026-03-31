package Strings;

import java.util.Scanner;

public class Togglr_Cse {
      public static String toggleCase(String input){
        StringBuilder result=new StringBuilder();
        for(char c:input.toCharArray()){
            if(Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input=sc.nextLine();
        String output=toggleCase(input);
        System.out.println("Toggle case result: "+ output);
     
    }

}
