package Arrays;

public class Second_Largest {
    public static void main(String[] args) {
        int []arr={10,9,8,123,54,48};

        int first =Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
              else if(arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        System.out.println("Second Largest elemnt is: "+second);
    }
}
