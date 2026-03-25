package Arrays;

import java.util.HashMap;

public class Two_Sum {
    static int [] targetSum(int []a,int target){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<a.length;i++){

            int compliment=target-a[i];

            if(map.containsKey(compliment)){
                   return new int[]{map.get(compliment),i};
            }
            map.put(a[i], i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int a[]={3,5,2,7};
        int target=9;
        int [] res=targetSum(a, target);

        for (int X : res) {
            System.out.print(X+" ");
            
        }

    }
}
