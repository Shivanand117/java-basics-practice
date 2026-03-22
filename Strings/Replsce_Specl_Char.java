package Strings;

public class Replsce_Specl_Char {
    static String replaceSpecialChar(String str){
        StringBuilder result=new StringBuilder();

        for(char ch:str.toCharArray()){

            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            }else{
                result.append(' ');
            }
        }
        return result.toString();

    }
    public static void main(String[] args) {
        System.out.println(replaceSpecialChar("Hello@World#2025!"));
    }
}

