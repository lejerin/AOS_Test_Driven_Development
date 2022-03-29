package com.happy.moneytdd;

import java.util.Objects;

public class Dollar extends Money {

    Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = "CHF";
    }

    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
