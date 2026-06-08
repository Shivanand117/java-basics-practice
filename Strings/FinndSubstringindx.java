package Strings;

public class FinndSubstringindx {
    public static void main(String[] args) {
          String str="HelloWorld";
          String sub="World"; 
          boolean found=false;

          for(int i=0;i<=str.length()-sub.length();i++){
            if(str.substring(i,i+sub.length()).equals(sub)){
                System.out.println("Substring found at index: "+i);
                found=true;
                break;
            }
          }
          if(!found){
            System.out.println("substring not found");
          }
    }
}
