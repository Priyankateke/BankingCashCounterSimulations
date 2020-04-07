package com.bankingsimulation;

public class Hashing {
    int size=12;
    int hashCode;
    int nextHashCode=0;
    int hashTable[]=new int[size];

    public void deposit(int initialAmount,int amount) {
        amount=initialAmount+amount;
        putAmount(amount);
    }

    public void withdraw(int initialAmount, int amount) {
        if (amount<initialAmount)
            amount=initialAmount-amount;
        else {
            System.out.println("Insufficient amount");
            amount = initialAmount;
        }
        putAmount(amount);
    }

    /* Put amount into hash table */
    public void putAmount(int amount) {
        hashCode=amount%size;
        if(hashTable[hashCode]==0) {
            hashTable[hashCode]=amount;
        }
        else {
            nextHashCode=(amount%size)+1;
            if(hashTable[nextHashCode]==0) {
                hashTable[nextHashCode]=amount;
            }
        }
    }

    /* Displaying hash table with index */
    public void show() {
        for(int i=0;i<hashTable.length;i++) {
            System.out.println(i+" "+hashTable[i]);
        }
    }

}
