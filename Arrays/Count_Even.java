package Arrays;

public class Count_Even {
    public static void main(String[] args) {
        int arr[]={4,5,8,9,4,6,5,46};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("The count of even number in array is : "+count);
    }
}
