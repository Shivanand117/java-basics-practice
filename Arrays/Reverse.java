package Arrays;

public class Reverse {
    public static void main(String[] args) {
        int []arr={1,45,78,98,87,85};
        int l=arr.length;
        int n=Math.floorDiv(l, 2);
        for(int i=0;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for (int element : arr) {
            System.out.print(element+" ");
            
        }
    }
}
