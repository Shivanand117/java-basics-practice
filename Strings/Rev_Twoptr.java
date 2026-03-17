package Strings;

public class Rev_Twoptr {
    static String reverseString(String str){
        char[]arr=str.toCharArray();
        int left=0,right=arr.length-1;

        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        
        String str="Nandish";
        
        System.out.println(reverseString(str));
    }
}
