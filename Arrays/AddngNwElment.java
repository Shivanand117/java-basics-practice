package Arrays;

public class AddngNwElment {
    static void addingnwelemt(int arr[]){
        System.out.println("Array before adding elements:");
        for (int oldelmt : arr) {
            System.out.println(oldelmt+" ");
        }
        int newelement=50;
        int newarr[]=new int[arr.length+1];

        //add eleemnts to newarray
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
        newarr[arr.length]=newelement;
        System.out.println("Array after adding elements: ");
        for (int element : newarr) {
            System.out.println(element+" ");
            
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        addingnwelemt(arr);
    }
}
