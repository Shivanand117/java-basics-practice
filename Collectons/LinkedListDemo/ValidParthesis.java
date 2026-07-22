 package Collectons.LinkedListDemo;

import java.util.Scanner;
import java.util.Stack;

public  class ValidParthesis{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the brackets: ");
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                 continue;
            }

            //check for opening brackets

            if(ch=='(' || ch=='{' || ch=='['){
             st.push(ch);
            }else{
                if(st.isEmpty()){
                    System.out.println("Not balanced");
                    return;
                }
            char top=st.peek();
            if((top=='(' && ch==')') || (top=='{' && ch=='}') || (top=='[' && ch==']')){
                st.pop();
            }else{
                System.out.println("Not balanced");
                return;
            } 
            }
              
        }
        if(st.isEmpty()){
            System.out.println("balanced");
        }else{
            System.out.println("not balanced");
        }
        
    }
}