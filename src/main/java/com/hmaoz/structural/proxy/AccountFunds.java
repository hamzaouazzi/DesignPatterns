package com.hmaoz.structural.proxy;

public class AccountFunds implements Payment {
    private double balance;

    public AccountFunds(double balance) {
        this.balance = balance;
    }
    @Override
    public double withdrawal(double amount) {
        if (balance >= amount) {
            balance -=amount;
        }
        return 0;
    }
}
