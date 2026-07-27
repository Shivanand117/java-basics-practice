package Collectons;

public class PairSumSortedArray {
    public static int[] pairSum(int []arr,int target){
        if(arr.length==0){
            return new int []{-1,-1};
        }
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int sum=arr[left]+arr[right];

            if(sum==target){
                return new int[]{left,right};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return  new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10};
        int target = 8;
        int ans[]=pairSum(arr, target);
        if(ans[0]==-1){
            System.out.println("Pair not found");
        }else{
            System.out.println("pair found at index "+ans[0] +" and "+ ans[1]);
            System.out.println("Numbers  are : "+ arr[ans[0]]+ " and " + arr[ans[1]]);
        }
    }
}
