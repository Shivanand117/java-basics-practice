package Arrays;

public class Arry_Target_Sum {
    static int[]  targetSum(int []a,int target){

        for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
 public static void main(String[] args) {
    int [] a={3,8,2,7};
    int target=9;
    int []res=targetSum(a, target);
    for(int i=0;i<res.length;i++){
        System.out.print(res[i]+" ");

    }

    
 }   
}
