package Loops;

import java.util.Scanner;

public class Min_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        num = Math.abs(num);
        int MinDigit=9;
        if(num==0){
            MinDigit=num;
        }
        while(num!=0){
            int digit=num%10;
            if(digit<MinDigit){
                MinDigit=digit;
            }
            num/=10;
        }
        System.out.println("The Minimum number in the digit  is: "+ MinDigit);
        
    }
    
}
