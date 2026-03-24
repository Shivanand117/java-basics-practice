package Strings;

public class Substring {
    static int findsubString(String text,String pattern)

    int n=text.length();
    int m=pattern.length();

    for(int i=0;i=<m-n;i++){
        int j;
        for(j=0;j<m;j++){
            if(text.charAt(i+j)!=pattern.charAt(j)){
                break;
            }
        }
        if(j==m){
            return i;
        }
    }
    Public static void main(String[] args){
        System.out.println(findsubString("Hello World", "World"));

    }
    
}
