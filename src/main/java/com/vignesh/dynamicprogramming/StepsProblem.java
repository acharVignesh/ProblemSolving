package com.vignesh.dynamicprogramming;

/**
 * Created by vighneshaachar on 9/11/18.
 */
public class StepsProblem {
    public static void main(String[] args) {
        int number=10;
        System.out.println("Recusion");
        long startTime = System.currentTimeMillis();
        int n = numberOfSteps(number);
        System.out.println(n);
        System.out.println((System.currentTimeMillis()-startTime)+" MS" );

        System.out.println("--------------------------------------------");
        System.out.println("DP");
        startTime = System.currentTimeMillis();
        int n2 = numberOfStepsDP(number);
        System.out.println(n2);
        System.out.println((System.currentTimeMillis()-startTime)+" MS" );
    }
    public static int numberOfSteps(int n){
        if(n==1)
            return 1;
        else  if(n==2)
            return 2;
        else return numberOfSteps(n-1)+numberOfSteps(n-2);
    }

    public static int numberOfStepsDP(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else {
            int[] a = new int[n];
            a[0] = 1;
            a[1] = 2;
            for (int i = 2; i <= n - 1; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }
            return a[n - 1];
        }

    }
}
