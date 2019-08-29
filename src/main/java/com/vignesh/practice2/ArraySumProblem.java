package com.vignesh.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraySumProblem {
    public static void main(String[] args) {

        reverseWords();

//        printSequence();

    }

    public static void printSequence(){
        List<Integer> list=new ArrayList();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Comma Seperated numbers");
        String s = sc.nextLine();
        System.out.println("Enter the sum");
        int num = sc.nextInt();

        List<String> strings = Arrays.asList(s.split(","));
        strings.stream().forEach(i->list.add(new Integer(i)));
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            int sum=0;
             for(int j=i;j<list.size();j++){
                 sum=sum+list.get(j);
                 if(sum==num){
                     System.out.println("Sum can be found starting "+i+" to "+j);
                     break;
                 }if(sum>num){
                     break;
                 }
             }
        }
    }

    public static void reverseWords(){
        String s="i.like.this.program.very.much";
        StringBuilder sb=new StringBuilder();
        char[] charArray = s.toCharArray();
        MyStack stack=new MyStack();

        for(int i=s.length()-1;i>=0;i--){
            if(charArray[i]!='.'){
                stack.push(charArray[i]);
            }else {
                sb.append(stack.popAll()).append(".");
            }
        }
        sb.append(stack.popAll());
        System.out.println(sb.toString());
        System.out.println(s);
    }

    public static class MyStack{
        int top=-1;
        char[] elements=new char[100];

        public void push(char c)
        {
            if(top<100) {
                elements[++top] = c;
            }else {
                System.out.println("stack is full");
            }
        }
        public char pop(){
            if(top<=-1){
                System.out.println("stack is empty");
                return '\0';
            }else {
                int temp=top;
                top--;
                return elements[temp];

            }
        }
        public String popAll(){
            StringBuilder sb=new StringBuilder();
            if(top<-1){
                System.out.println("stack is empty already");
            }else {
                while (top!=-1){
                    sb.append(elements[top]);
                    top--;
                }

            }
            return sb.toString();
        }
    }
}
