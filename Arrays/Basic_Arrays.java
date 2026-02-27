package Arrays;

public class Basic_Arrays {
 public static void main(String[] args) {
    int [] marks=new int[6];//declaration and memory allocation
    marks[0]=100;
    marks[1]=80;
    marks[2]=75;
    marks[3]=86;
    marks[4]=75;
    //  System.out.println(marks[0]);
    //   System.out.println(marks[1]);
    //    System.out.println(marks[2]);
    //     System.out.println(marks[3]);
    //      System.out.println(marks[4]);
          //System.out.println(marks[1]);
    marks[5]=40;
    marks[0]=50;

   System.out.println(marks[0]);

   //declaration and intialization
/* 
   int[] marks1={75,86,100,79,85,96};
   System.out.println(marks1.length);
   float[] marks2={80.0f,85.0f,95.12f,100.0f,89.32f};
   System.out.println(marks2.length);
   System.out.println(marks2[4]);
   String[]name={"Nandish","Usha","Harsha","Shivanand"};
   System.out.println(name.length);
   System.out.println(name[2]);
*/
   //Displaying arrays in Naive Methos:
   for(int i=0;i<marks.length;i++){
    System.out.print(marks[i]+" ");
   }
   System.out.println();
   //Rivers order displaying 
   for(int i=marks.length-1;i>=0;i--){
    System.out.print(marks[i]+" ");
   }
   //by using For each loop 
   System.out.println();
   for(int elememnt:marks){
    System.out.print(elememnt+" ");
   }
 }   
}


