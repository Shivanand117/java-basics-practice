package Loops;

import java.util.Scanner;

public class Sum_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number range");
        int num=sc.nextInt();
        int sum=num*(num+1);//O(1)
        // for(int i=0;i<=num;i++){--O(n)
        //     sum+=(2*i);
        // }
        System.out.println(sum);
    }
}
