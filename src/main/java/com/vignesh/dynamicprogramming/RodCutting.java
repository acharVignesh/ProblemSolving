package com.vignesh.dynamicprogramming;

/**
 * Created by vighneshaachar on 23/10/18.
 */
public class RodCutting {
    public static int profit(int[] pricesArr,int length){
        if(length<=0)
            return 0;
        int max=-1;
        for(int i=0;i<length;i++){
            max=Math.max(max,pricesArr[i]+profit(pricesArr,length-(i+1)));
        }
        return max;
    }

    public static int profitDP(int[] pricesArr, int length) {
        int[] profitArray = new int[length+1];
        if (length <= 0)
            return 0;
        else {
            int max = -1;
            profitArray[0] = 0;
            for (int i = 1; i <=length; i++) {
                for (int j = 1; j <= i; j++) {
                    int temp = pricesArr[j-1] + profitArray[i - j];
                    if (temp > max) {
                        max = temp;
                    }
                }
                profitArray[i] = max;
            }
            return profitArray[length];
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] value = { 1,5,8,9,10,17,19,20,24,26,32,34,38,42,44,44,46,46,46,48,60 ,66,72,74,76,76,76,78,82,88,88,90,90,92,94,94,96 };
        int len = 10;
        System.out.println("Max profit for length is " + len + ":"
                + profit(value, len));
        System.out.println("Took:"+(System.currentTimeMillis()-startTime) +" ms");
        System.out.println("DP");
        System.out.println("-------------------------");
        startTime = System.currentTimeMillis();
        System.out.println("Max profit for length is "+profitDP(value,len));
        System.out.println("Took:"+(System.currentTimeMillis()-startTime) +" ms");
    }

}
