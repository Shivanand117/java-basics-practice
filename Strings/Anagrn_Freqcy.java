package Strings;

public class Anagrn_Freqcy {
    static boolean  isAnangram(String s1,String s2){
        s1=   s1.toLowerCase();
        s2=   s2.toLowerCase();
        if(s1.length()!=s2.length()){
            return  false;
        }

        int []count=new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for(int num:count){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnangram("Silent", "listen"));
    }
}
