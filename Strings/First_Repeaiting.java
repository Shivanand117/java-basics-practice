package Strings;

public class First_Repeaiting {
    static  char firstrepating(String str){
         str=str.toLowerCase();
        int count[]=new int[26];

        //count frequency
        for(char ch:str.toCharArray()){
            count[ch-'a']++;
        }
        //find first non repeating
        for(char ch:str.toCharArray()){
            if(count[ch-'a']>1){
                return ch;
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        System.out.println(firstrepating("Programming"));
    }
}
