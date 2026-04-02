package Strings;

import java.util.HashSet;

public class Longest_Substring {
    static int longestSubstring(String str){
        HashSet<Character>set=new HashSet<>();
        int left=0;
        int maxlength=0;

        for(int right=0;right<str.length();right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                 left++;
            }
            set.add(str.charAt(right));
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;

    }
    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
        
    }
}
