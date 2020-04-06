package com.bankingsimulation;

public class Stack {
    Node top;

    //Push people number and amount into stack
    public void push(int peopleNumber,int amount) {
        Node new_node=new Node();
        new_node.peopleNumber=peopleNumber;
        new_node.amount=amount;
        new_node.next=top;
        top=new_node;
    }

    //Printing the queue of people
    public void show() {
        Node current=top;
        while (current.next!=null) {
            System.out.println("People : "+ current.peopleNumber+" : "+current.amount);
            current=current.next;
        }
        System.out.println("People : "+ current.peopleNumber+" : "+current.amount);
        System.out.println();
    }

    //Function to move the last node to top position
    public void moveToTop() {
        if(top==null || top.next==null)
            return;
        Node secondLast=null;
        Node last=top;

        while (last.next!=null) {
            secondLast=last;
            last=last.next;
        }
        secondLast.next=null;
        last.next=top;
        top=last;
    }

    //Deposite cash and removing people from queue
    public void deposit(int amount) {
        top.amount=amount+top.amount;
        System.out.println("People : "+top.peopleNumber+ " Current Balance : "+top.amount);
        top=top.next;
    }

    //Withdraw cash and removing people from queue
    public void withdraw(int amount) {
        if (amount<top.amount) {
            top.amount = top.amount - amount;
            System.out.println("People : " + top.peopleNumber + " Current Balance : " + top.amount);
        }
        else
            System.out.println("Insufficient Balance");
        top=top.next;
    }
}
