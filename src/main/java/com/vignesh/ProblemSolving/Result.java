package com.vignesh.ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    static void miniMaxSum(int[] arr) {
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        long sum=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
            sum=sum+arr[i];
        }
        System.out.println(sum-max+" "+(sum-min));
    }
    static void plusMinus(int[] arr) {
        Double countZero = 0.0;
        Double countPos = 0.0;
        Double countNeg = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPos = countPos + 1;
            } else if (arr[i] < 0) {
                countNeg = countNeg + 1;
            } else if (arr[i] == 0) {
                countZero = countZero + 1;
            }
        }
        System.out.println(countPos/arr.length);
        System.out.println(countNeg/arr.length);
        System.out.println(countZero/arr.length);
    }

    public static void main(String[] args) {
        int[] a1 ={-5,-4,0,1,5};
        int[] a2 ={1,4,2,9,7};
        plusMinus(a1);
        System.out.println("----- min max sum-------");
        miniMaxSum(a2);
    }
}
