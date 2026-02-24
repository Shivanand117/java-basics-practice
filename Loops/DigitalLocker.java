package Loops;

import java.util.Scanner;

public class DigitalLocker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n=sc.nextInt();
        
        n=Math.abs(n);
        
        while (n>=10) { 
            int sum=0;
            
            while(n!=0){
                sum+=n%10;
                n=n/10;
            }
            n=sum;
        }
        System.out.println("Single digit sum is: " + n);
    }
}
