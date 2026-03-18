package Strings;

public class Palindrm_Strng {
     static String palindromeString(String str){
        char[]arr=str.toCharArray();
        int left=0,right=arr.length-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        String res= new String(arr);
        if(str.equals(res)){
          return  "Palindrome String";
        }else{
             return  "The String is not Palindrome String";
        }
    }
    public static void main(String[] args) {
        // System.out.println(palindromeString("gadag"));
      
        System.out.println(  palindromeString("gadag"));
    }
}
