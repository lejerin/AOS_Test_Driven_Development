package com.happy.moneytdd;

public class Franc extends Money {

    Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = "CHF";
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
