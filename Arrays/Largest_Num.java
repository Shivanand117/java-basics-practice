package Arrays;

public class Largest_Num {
    public static void main(String[] args) {
        int arr[]={1,12,7,21,9,11};
        int  largest=arr[0];

        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
               largest=arr[i];
            }
        }
        System.out.println("Largest num is: "+largest);

    }
}
