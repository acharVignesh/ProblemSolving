package com.vignesh.ProblemSolving;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimalDifference {
    public static void closestNumbers(List<Integer> numbers) {
        // Write your code here

        int minDiff=Integer.MAX_VALUE;
        Collections.sort(numbers);
        for(int i=0;i<numbers.size()-1;i++){
            int tempDiff = Math.abs(numbers.get(i) - numbers.get(i + 1));

            if(tempDiff<minDiff){
                minDiff=tempDiff;
            }
        }
        for(int i=0;i<numbers.size()-1;i++){
            int diff = Math.abs(numbers.get(i) - numbers.get(i + 1));

            if(diff==minDiff){
                System.out.println(numbers.get(i)+" "+numbers.get(i+1));
            }
        }


        /*for(int i=0;i<numbers.size();i++){

            for(int j=0;j<numbers.size();j++){
                int tempDiff = Math.abs(numbers.get(i) - numbers.get(j));

                if(i==j){
                    continue;
                }
                if(tempDiff<minDiff){
                    minDiff=tempDiff;
                }
            }
        }*/

    }

    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < numbersCount; i++) {
            int numbersItem = Integer.parseInt(bufferedReader.readLine().trim());
            numbers.add(numbersItem);
        }

        closestNumbers(numbers);

        bufferedReader.close();*/

        List<Integer> numbers = new ArrayList<>();

        numbers.add(6);
        numbers.add(2);
        numbers.add(4);
        numbers.add(10);

        closestNumbers(numbers);
    }
}
