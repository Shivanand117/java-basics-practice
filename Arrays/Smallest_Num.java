package Arrays;

public class Smallest_Num {
     public static void main(String[] args) {
        int arr[]={1,12,7,21,9,11,0};
        int  smallest=arr[0];

        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
               smallest=arr[i];
            }
        }
        System.out.println("Smallest num is: "+smallest);

    }
}
