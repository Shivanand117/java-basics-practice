package Loops;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
       int n=sc.nextInt();
       int fact=1;
       if(n==0||n==1){
        fact=1;
        System.out.println("the factorial of number is: "+fact);
       }else{
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        System.out.println("The Factorial of Number is: "+fact);
       }        
    }
    
}
