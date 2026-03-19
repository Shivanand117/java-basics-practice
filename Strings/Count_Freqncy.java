package Strings;

public class Count_Freqncy {
    static void countFreq(String str){
        str=str.toLowerCase();
        int count[]=new int[26];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
            count[ch-'a']++;
        }
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                System.out.println((char)(i+'a')+"->"+count[i]);
            }
        }
    }
    public static void main(String[] args) {
        countFreq("programming");
    }
}
