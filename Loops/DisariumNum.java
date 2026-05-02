package Loops;

import java.util.Scanner;

public class DisariumNum {
    static int pow(int base,int expo){
        int res=base;
        for(int i=1;i<expo;i++){
            res*=base;
        }
        return res;
    }
    static int  getdigitCount(int num){
        int count=0;

        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    static boolean isDisarium(int num){
        int temp=num;
        int count=getdigitCount(num);
        int sum=0;
        while(num!=0){
            int ld=num%10;
            sum+=pow(ld, count--);
            num/=10;
        }
        return sum==temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println(isDisarium(num));
    }
}
