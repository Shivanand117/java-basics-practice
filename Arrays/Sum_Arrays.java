package Arrays;

public class Sum_Arrays {
    public static void main(String[] args) {
        int arr[]={4,5,8,1,7,9};
        int sum=0;
        for(int elemnt:arr){
            sum+=elemnt;
        }
        System.out.println("The Sum of array is: "+sum);
    }
}
