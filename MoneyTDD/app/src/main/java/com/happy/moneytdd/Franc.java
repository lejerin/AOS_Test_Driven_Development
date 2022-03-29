package com.happy.moneytdd;

public class Franc extends Money {
    private String currency;

    Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    public String currency() {
        return currency;
    }
}
