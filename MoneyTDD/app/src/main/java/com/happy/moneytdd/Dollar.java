package com.happy.moneytdd;

import java.util.Objects;

public class Dollar extends Money {

    Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public String currency() {
        return "USD";
    }
}
