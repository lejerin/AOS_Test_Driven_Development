package com.happy.moneytdd;

public class Franc extends Money {

    Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    public String currency() {
        return "CHF";
    }

}
