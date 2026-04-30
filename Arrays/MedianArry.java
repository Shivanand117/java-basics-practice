package Arrays;

import java.util.Arrays;

public class MedianArry {
    static void medianelemnt(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        double median;

        if(n%2==0){
            median=(arr[n/2-1]+arr[n/2])/2.0;
        }else{
            median=arr[n/2];
        }
        System.out.println("Median elemt in array is: "+ median);
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,8,9};
        medianelemnt(arr);

    }
}
