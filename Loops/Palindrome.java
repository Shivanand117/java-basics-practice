package Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();

        int original=n;
        int rev=0;
        int temp=n;
        while (temp!=0) { 
            int digit=temp%10;
            rev=rev*10+digit;
            temp/=10;
        }
        if(original==rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("The Number is Not Palindrome Number!");
        }
        
    }
}
