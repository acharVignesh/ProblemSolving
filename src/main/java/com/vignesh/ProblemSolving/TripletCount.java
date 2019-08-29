package com.vignesh.ProblemSolving;


import java.io.*;
import java.util.*;

public class TripletCount {

    //logic is put all the elements to one map ie first element og triplet
    //devide each element by r and if result is present first map put it into second map ie 2nd element
    //if the result is present in second map the triplrt is found , ie 3rd elemnt
    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> potential = new HashMap<>();
        Map<Long, Long> counter = new HashMap<>();
        long count = 0;
        for (int i = 0; i < arr.size(); i++) {
            long a = arr.get(i);
            long key = a / r;

            if (counter.containsKey(key) && a % r == 0) {
                count += counter.get(key);
            }

            if (potential.containsKey(key) && a % r == 0) {
                long c = potential.get(key);
                counter.put(a, counter.getOrDefault(a, 0L) + c);
            }

            potential.put(a, potential.getOrDefault(a, 0L) + 1); // Every number can be the start of a triplet.
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of integer");
        int n = sc.nextInt();
        System.out.println("Enter the numbers");
        Long arr[]=new Long[n];



        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        System.out.println("Enter r");


        long r = sc.nextLong();

        List<Long> list = Arrays.asList(arr);

        long ans = countTriplets(list, r);
        System.out.println(ans);
    }
}
