package Strings;

public class String_Compression {
    static String compresseion(String str){
        StringBuilder result=new StringBuilder();
        int count=1;

        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                result.append(str.charAt(i));
                result.append(count);
                count=1;
            }
        }
        // last character
        result.append(str.charAt(str.length()-1));
        result.append(count);
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(compresseion("aaabb"));
        
    }
}
