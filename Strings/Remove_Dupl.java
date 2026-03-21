package Strings;

public class Remove_Dupl {
    static String removeDuplicate(String str){
        str=str.toLowerCase();
        int count[]=new int[26];
        String result=" ";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(count[ch-'a']==0){//this shows we are visiting first time into the that particular character
                result+=ch;
                count[ch-'a']++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        //removeDuplicate("Programmming");
        System.out.println(removeDuplicate("Programmming"));
    }
}
