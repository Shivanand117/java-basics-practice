package Methods;

import java.util.Scanner;

public class PerfectNum {
    static int sumofDivisor(int num,int i){
        if(i>num/2){
            return 0;
        }
        if(num%i==0){
            return i+sumofDivisor(num, i+1);
        }
        else{
            return  sumofDivisor(num, i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int sum=sumofDivisor(num, 1);
        if(sum==num){
            System.out.println(num +" is Perfect Number");
        }else{
            System.out.println(num + "is not a perfect number");
        }
    }
}
