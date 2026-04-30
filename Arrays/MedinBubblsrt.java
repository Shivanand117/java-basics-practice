package Arrays;

public class MedinBubblsrt {
    static void medianArray(int arr[]){
        int n=arr.length;

        //bybble sort
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        double median;
        if(n%2==0){
            median=(arr[n/2-1]+arr[n/2])/2.0;
        }else{
            median=arr[n/2];
        }
        System.out.println("The Median element is: "+ median);
    }
    public static void main(String[] args) {
        int arr[]={1,4,7,2,4,5};
        medianArray(arr);
    }
    
}
