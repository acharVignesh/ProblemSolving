package com.vignesh.ProblemSolving;

public class CommonSubstring {
    static String twoStrings(String s1, String s2) {
        char[] charArray = s1.toCharArray();

        for(int i=0;i<charArray.length;i++ ){
            String s = String.valueOf(charArray[i]);
            if(s2.contains(s)){
                return "YES";
            }
        }
        return "NO";
    }

   public static void main(String[] args) {
        String s1="";
        String s2="";
        System.out.println(twoStrings(s1,s2));
    }
}
