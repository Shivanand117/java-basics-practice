package Arrays;

import java.util.Scanner;

public class Num_Find {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a Number: ");
     int n=sc.nextInt();
     int []num={41,1,52,7,9,56,2};
     boolean isinArray=false;
     for(int element:num){
        if(n==element){
            isinArray=true;
            break;
        }
     }   
     if(isinArray){
        System.out.println("The given Number "+n+" is present in an array");
     }else{
        System.out.println("The given Number "+n+" is not  present in an array");
     }
    }
}
