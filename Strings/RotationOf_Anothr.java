package Strings;
public class RotationOf_Anothr{
    static boolean isrotation(String s1,String s2){

        if(s1.length()!=s2.length()){
            return  false;
        }
        String temp=s1+s1;

         return temp.contains(s2);
    }
    public static void main(String[] args) {
        System.out.println(isrotation("abcde", "cdeab"));
    }

}