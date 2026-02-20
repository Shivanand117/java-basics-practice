package Loops;

import java.util.Scanner;

public class GCD_Fin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number 1: ");
        int a=sc.nextInt();

        System.out.println("Enter a Number 2");
        int b=sc.nextInt();
        int gcd=1;

        int min=((a<b)?a:b);

       for(int i=1;i<=min;i++){
        if(a%i==0 && b%i==0){
            gcd=i;
        }
       }
       System.out.println("the gcd is:"+gcd);
        
    }
}
