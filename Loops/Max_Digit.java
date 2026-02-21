package Loops;

import java.util.Scanner;

public class Max_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int MaxDigit=0;
        while(num!=0){
            int digit=num%10;
            if(digit>MaxDigit){
                MaxDigit=digit;
            }
            num/=10;
        }
        System.out.println("The Largest number in the digit  is: "+ MaxDigit);
    }
}
