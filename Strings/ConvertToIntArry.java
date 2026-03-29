package Strings;

public class ConvertToIntArry {
    public static void main(String[] args) {
        String input="[ 1, 2 , 3 , 4 ]";
        //remove  brackets
        input=input.replace("[", " ").replace("]", " ").trim();
        //split by comma
        String [] parts=input.split(",");

       //convert int to array
       int arr[]=new int[parts.length];

       for(int i=0;i<parts.length;i++){
          arr[i] =Integer.parseInt(parts[i].trim());
         }
         //print
         for(int num:arr){
            System.out.print(num+" ");
         }
    }
}
