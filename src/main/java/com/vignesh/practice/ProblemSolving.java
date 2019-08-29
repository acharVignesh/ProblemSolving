package com.vignesh.practice;

/**
 * Created by vighneshaachar on 30/11/17.
 */
public class ProblemSolving {
    String s1="BACDGABCDA";
    String pat="ABCD";
    public static void funtion(String s,String pattern){
        for(int k=0;k<pattern.length();k++){
        for(int i=k;i<pattern.length();i++){
            String swap = swap(pattern, k, i);
            System.out.println(swap);
        }
        }
    }
    public static void funtion2(String s,String pattern){
        int n=pattern.length();
        int fact = fact(n);
        for(int k=0;k<pattern.length();k++){
            for(int i=k;i<pattern.length();i++){
                String swap = swap(pattern, k, i);
                System.out.println(swap);
            }
        }
    }

    public static void main(String[] args) {
        funtion(null,"ABCD");

    /*    String s1 = swap("ABCD", 1, 2);
        System.out.println(s1);
        System.out.println(swap("ABCD",1,3));
        System.out.println(swap("ABCD",1,0));*/
    }
    public static String swap(String str,int i,int j){
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
        return String.valueOf(chars);
    }
    public static int fact(int n){
        int fact=0;
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        return fact;
    }
}
