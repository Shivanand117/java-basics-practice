package Sliding_Window;

public class SlidingWindowMaxSum {
    static int maxSum(int arr[],int k){

        //Edge case
        if(arr.length<k){
            System.out.println("Invalid Input :K is greater than array size");
            return -1;
        }
       int sum=0;
        //First window
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max=sum;

        //Sliding the window
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            max=Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,8,2,9,1};
        int k=3;
        int result=maxSum(arr, k);

        System.out.println("Maximum sum of sumarray of size "+ k + " is: "+result );
    }
}
