package com.nakul.minibankk;


public class Main {
    public static void main(String[] args) {
        Account acc = new Account("A1", "Nakul", 1000);

        acc.deposit(500);
        acc.withdraw(200);

        System.out.println(acc.getOwner() + " balance: " + acc.getBalance() + " id " + acc.getId());
    }
}