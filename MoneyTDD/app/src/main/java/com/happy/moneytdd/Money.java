package com.happy.moneytdd;

public abstract class Money {
    protected int amount;

    abstract Money times(int multiplier);

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}
