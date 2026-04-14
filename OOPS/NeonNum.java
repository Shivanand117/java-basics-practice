package OOPS;

import java.util.Scanner;

public class NeonNum {
    static void neon(int num){
        int square=num*num;
        int sum=0;

        while(square!=0){
            int ld=square%10;
            sum+=ld;
            square/=10;
        }
        if(sum==num){
            System.out.println("neon number");
        }else{
            System.out.println("Not a neon number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number: ");
        int num=sc.nextInt();
       
        neon(num);

    }
    
}
