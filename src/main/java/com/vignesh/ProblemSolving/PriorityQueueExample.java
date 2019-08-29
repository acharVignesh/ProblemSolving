package com.vignesh.ProblemSolving;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Double> pQueue=new PriorityQueue<>();

        pQueue.add(0.8);
        pQueue.add(0.2);
        pQueue.add(0.4);
        pQueue.add(0.5);
        System.out.println(pQueue.poll());
        pQueue.add(0.2);
        pQueue.add(0.3);
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.toArray());
    }
}
