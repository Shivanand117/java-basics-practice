package Methods;

import java.util.HashSet;

public class HappyNum {
    static  int sumOfsquares(int num){
        int sum=0;
        while(num>0){
            int d=num%10;
            sum+=d*d;
            num/=10;
        }
        return sum;
    }
    static boolean ishappy(int num){
        HashSet<Integer>set=new HashSet<>();

        while(num!=1 && !set.contains(num)){
            set.add(num);
            num=sumOfsquares(num);
        }
        return num==1;
    }
    public static void main(String[] args) {
        int num=19;
        if(ishappy(num)){
            System.out.println("Happy number");
        }
        else{
            System.out.println("Not a happy number");
        }
        
    }
}
