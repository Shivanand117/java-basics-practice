package Strings;

public class First_Non_Repeng {
    static char firstnonrepeting(String str){
        str=str.toLowerCase();
        int count[]=new int[26];

        for(int i=0;i<str.length();i++){
         char ch =str.charAt(i);
         count[ch -'a']++;
        }
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(count[ch -'a']==1){
            return  ch;
           }
        }
        return  '$';
    }
    public static void main(String[] args) {
        firstnonrepeting("Programming");
        System.out.println(   firstnonrepeting("Programming"));
    }
}
