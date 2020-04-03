package com.bankingsimulation;

class Node {
    int peopleNumber;
    int amount;
    Node next;
}
public class CashCounter {
    Node head;

    //Inserting the people and initial amount in queue
    public void insert(int peopleNumber,int amount) {
        Node new_node=new Node();
        new_node.peopleNumber=peopleNumber;
        new_node.amount=amount;
        new_node.next=null;

        if(head==null) {
            head=new_node;
        }
        else {
            Node current=head;
            while (current.next!=null) {
                current=current.next;
            }
            current.next=new_node;
        }
    }

    //Printing the queue
    public void show() {
        Node current=head;
        while (current.next!=null) {
            System.out.println("People : "+ current.peopleNumber+" : "+current.amount);
            current=current.next;
        }
        System.out.println(current.peopleNumber+" : "+current.amount);
        System.out.println();
    }

    //Deposite cash and removing people from queue
    public void deposit(int amount) {
        head.amount=amount+head.amount;
        System.out.println("People : "+head.peopleNumber+ " Current Balance : "+head.amount);
        head=head.next;
    }

    //Withdraw cash and removing people from queue
    public void withdraw(int amount) {
        if (amount<head.amount) {
            head.amount = head.amount - amount;
            System.out.println("People : " + head.peopleNumber + " Current Balance : " + head.amount);
        }
        else
            System.out.println("Insufficient Balance");
        head=head.next;
    }
}