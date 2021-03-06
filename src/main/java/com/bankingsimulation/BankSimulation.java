package com.bankingsimulation;
import java.util.Scanner;

public class BankSimulation<people> {

    public static void main(String[] args) {
        System.out.println("Welcome To Banking Cash Counter Simulation");

        CashCounter cashCounter=new CashCounter();
        Scanner sc=new Scanner(System.in);
        int initialAmount,people,choice,amount;
        int TOTAL_PEOPLE=10;

        //Queue
        System.out.println("People in Queue  :  Initial Amount");
        for(people=1;people<=TOTAL_PEOPLE;people++) {
            initialAmount = (int) Math.floor(Math.random() * 100000) % 999999;
            cashCounter.insert(people,initialAmount);
        }
        cashCounter.show();

       for (people=1;people<=TOTAL_PEOPLE;people++) {
            System.out.println("People "+people+"\n 1. Deposite\n2. Withdraw\nEnter your choice : ");
            choice=sc.nextInt();
            System.out.println("Enter your amount : ");
            amount=sc.nextInt();
            switch (choice) {
                case 1:
                    cashCounter.deposit(amount);
                    break;
                case 2:
                    cashCounter.withdraw(amount);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }

       //Stack
        Stack stack=new Stack();
        System.out.println("People in Queue  :  Initial Amount");
        //push people and initial amount into stack
        for(people=1;people<=TOTAL_PEOPLE;people++) {
            initialAmount = (int) Math.floor(Math.random() * 100000) % 999999;
            stack.push(people,initialAmount);
        }
        stack.show();

        for (people=1;people<=TOTAL_PEOPLE;people++) {
            stack.moveToTop();
            System.out.println("People "+people+"\n 1. Deposite\n2. Withdraw\nEnter your choice : ");
            choice=sc.nextInt();
            System.out.println("Enter your amount : ");
            amount=sc.nextInt();
            switch (choice) {
                case 1:
                    stack.deposit(amount);
                    break;
                case 2:
                    stack.withdraw(amount);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }

        //Hashing
        Hashing hashing=new Hashing();
        for(int i=0;i<TOTAL_PEOPLE;i++) {
            initialAmount = (int) Math.floor(Math.random() * 100000) % 999999;

            System.out.println("People "+(i+1)+"\n 1. Deposite\n2. Withdraw\nEnter your choice : ");
            choice=sc.nextInt();
            System.out.println("Enter your amount : ");
            amount=sc.nextInt();
            switch (choice) {
                case 1:
                    hashing.deposit(initialAmount,amount);
                    break;
                case 2:
                    hashing.withdraw(initialAmount,amount);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        hashing.show();
    }
}

