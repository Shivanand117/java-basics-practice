package Loops;

import java.util.Scanner;

public class Count_Evn_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        n=Math.abs(n);
        int count_even=0;
        int count_odd=0;
        //Special case for 0
        if(n==0){
         count_even=1;
        }else{
        while(n!=0){
        int digit=n%10;
        if(digit%2==0){
            count_even++;
        }else{
            count_odd++;
        }
        n=n/10;
        }
    }
        System.out.println("The total number of Evens are:"+count_even);
        System.out.println("The total number of odds are:"+count_odd);

    }
    }

