package com.vignesh.ProblemSolving;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestOutput {

    public static void main(String[] args) {
        System.out.println(getMonth());
        System.out.println(getNextMonth());
    }
    public static String getMonth(){
        SimpleDateFormat df=new SimpleDateFormat("MMM");
        String monthName = df.format(new Date());
        return monthName;
    }
    public static String getNextMonth(){
        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.MONTH,1);
        SimpleDateFormat df=new SimpleDateFormat("MMM");
        String monthName = df.format(new Date(cal.getTimeInMillis()));
        return monthName;
    }
}
