package com.vignesh.practice;

import java.util.ArrayList;

/**
 * Created by vighneshaachar on 3/11/17.
 */
public class TestArrayList {

    public static void main(String[] args) {
        ArrayList aList=new ArrayList<String>();
        ArrayList bList=new ArrayList<String>();
        ArrayList cList=new ArrayList<String>();
        aList.add("A");
        aList.add("B");
        aList.add("C");

        bList.add("A");
        bList.add("B");
        bList.add("C");
        bList.add("A");
        bList.add("B");
        bList.add("D");
        bList.removeAll(aList);
        for(Object s:bList)
        {
            System.out.println(s);
        }

    }
}
