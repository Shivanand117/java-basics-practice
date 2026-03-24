package Strings;

public class SubstringSearch {

    static int findSubstring(String text, String pattern){

        int n = text.length();
        int m = pattern.length();

        for(int i = 0; i <= n - m; i++){
              int j;
              
            for(j = 0; j < m; j++){

                if(text.charAt(i + j) != pattern.charAt(j)){

                    break;
                }
            }

            if(j == m){
                return i;   // match found
            }
        
        }

        return -1;  // not found
    }

    public static void main(String[] args) {

        String text = "hello world";
        String pattern = "world";

        int result = findSubstring(text, pattern);

        if(result != -1){
            System.out.println("Found at index: " + result);
        } else{
            System.out.println("Not Found");
        }
    }
}