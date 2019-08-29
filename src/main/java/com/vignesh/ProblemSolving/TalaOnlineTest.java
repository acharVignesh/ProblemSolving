package com.vignesh.ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TalaOnlineTest {

    public static void main(String[] args) {
        System.out.println("Started Test");

        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(6);
        testArray.add(50);
        testArray.add(16);
        testArray.add(30);
        testArray.add(37);
        testArray.add(12);
        testArray.add(43);
        testArray.add(52);
        testArray.add(24);
        testArray.add(2);
        testArray.add(53);
        testArray.add(28);
        testArray.add(31);
        testArray.add(36);
        testArray.add(10);
        testArray.add(32);
        testArray.add(51);
        testArray.add(60);
        testArray.add(64);
        testArray.add(38);
        testArray.add(3);
        testArray.add(46);
        testArray.add(7);
        testArray.add(4);
        testArray.add(55);
        testArray.add(72);
        testArray.add(75);
        testArray.add(66);
        testArray.add(73);
        testArray.add(68);
        testArray.add(54);
        System.out.println(solve(testArray));
    }

    public static int solve(ArrayList<Integer> A) {
        int swapCount = 0;
        for (int i = 0; i < A.size(); i++) {
            for(int j=i+1;j<A.size();j++){
                if(A.get(i)>A.get(j)){
                    int temp=A.get(i);
                    A.set(i,A.get(j));
                    A.set(j,temp);
                    swapCount++;
                }
            }
        }
        System.out.println(A);
        return swapCount;
    }
}
