package Strings;

public class Anagrm_Num {
      static boolean  isAnagram(String s1,String s2){
        s1=   s1.toLowerCase();
        s2=   s2.toLowerCase();
        if(s1.length()!=s2.length()){
            return  false;
        }

        int []count=new int[256];// handles all  ascii values
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int num:count){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("a1b2", "2b1a")); // true
        
    }
}
