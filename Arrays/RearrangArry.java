package Arrays;

import java.util.Arrays;

public class RearrangArry {
    static void assanddesorder(int arr[]){
        Arrays.sort(arr);

        //first half arrays asending
        for(int i=0;i<arr.length/2;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=arr.length-1;i>=arr.length/2;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,7,3,4,6,8,9};
        assanddesorder(arr);
    }
}
