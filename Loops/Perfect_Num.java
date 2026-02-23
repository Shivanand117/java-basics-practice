package Loops;

import java.util.Scanner;

public class Perfect_Num {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        if(num<=0){
            System.out.println("Perfect number is defined for positive integers only");
        }
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(num==sum){
            System.out.println(num+" is a perfect Number");
        }else{
            System.out.println(num+ " is not a perfect number");
        }

    }
    
}
