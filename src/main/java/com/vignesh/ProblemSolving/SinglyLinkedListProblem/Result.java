package com.vignesh.ProblemSolving.SinglyLinkedListProblem;

public class Result {
    public static SinglyLinkedListNode
    deleteOdd(SinglyLinkedListNode listHead) {
        // Write your code here

        while (listHead.next!=null){
            int data = listHead.data;
            if(data%2!=0){
                SinglyLinkedListNode next = listHead.next;
                listHead.next=listHead.next;
            }
        }
        while (listHead.next!=null){
            System.out.println(listHead.data);
        }

        return listHead;

    }
}
