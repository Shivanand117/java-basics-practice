package Strings;

public class FinfdIndxSubstrng {
    public static void main(String[] args) {
        String str="HelloWorld";
        String sub="World";
        int pos=str.indexOf(sub);

        if(pos!=-1){
            System.out.println("Substring found at position: "+pos);
        }else{
            System.out.println("Substring not found");
        }
    }
}
