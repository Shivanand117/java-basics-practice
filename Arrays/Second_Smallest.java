package Arrays;

public class Second_Smallest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,12};

        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]<second && arr[i]!=first){
                second=arr[i];
            }
        }
        System.out.println("second smallest element in an arrray is : "+second);
    }
}
