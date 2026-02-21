package Loops;

import java.util.Scanner;

public class Arm_StrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();

        int original=num;
        int sum=0;
        int digits=0;
        int temp=num;

        //Count toatal Number digits
        while(temp!=0){
            digits++;
            temp/=10;
        }
        temp=num;

        //Find Arm strong Number Sum

        while (temp!=0) {
            int digit=temp%10;
            sum+=Math.pow(digit, digits);
            temp/=10; 
        }
        //Printing Final Answer Wheher Number is String or not
        if(sum==original){
            System.out.println("The given number is ArmStrong Number");
        }
        else{
            System.out.println("The given number is Not an ArmStrong Number..!");
        }
    }
}
