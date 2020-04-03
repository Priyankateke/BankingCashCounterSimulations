package com.bankingsimulation;
import java.util.Scanner;

public class BankSimulation<people> {
    public static void main(String[] args) {
        System.out.println("Welcome To Banking Cash Counter Simulation");

        CashCounter cashCounter = new CashCounter();
        Scanner sc=new Scanner(System.in);
        int initialAmount,people,choice,amount;
        int TOTAL_PEOPLE=10;

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
    }
}

