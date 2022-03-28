package com.happy.moneytdd;

public class Dollar {
    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        amount *= multiplier;
        return null;
    }
}
