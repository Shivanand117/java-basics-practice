package Strings;

public class Longest_Word {
    static String longestWord(String sentence){
        String[] words=sentence.split(" ");
        String longest=" ";
       
        for(String word:words){
            if(word.length()>longest.length()){
                longest=word;
            }
        }
        return  longest;
    }
    public static void main(String[] args) {
         String sentence = "The quick brown fox jumps over the lazy dog";
         System.out.println(longestWord(sentence));
        
    }
}
