package com.happy.moneytdd;

import java.util.Objects;

public class Dollar extends Money {
    private String currency;

    Dollar(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public String currency() {
        return currency;
    }
}
