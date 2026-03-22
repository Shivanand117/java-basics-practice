package Strings;

public class ReplaceSpace {
    static  String repalceSpace(String str){
        String result=" ";
        
        for(int i =0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch==' '){
                result+="%20";
            }else{
                result+=ch;
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        repalceSpace("Hello World i am java ");
        System.out.println( repalceSpace("Hello World i am java "));
        
    }
    
}
