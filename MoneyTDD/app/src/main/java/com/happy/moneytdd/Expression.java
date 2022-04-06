package com.happy.moneytdd;

public interface Expression {
    Money reduce(Bank bank, String to);
}
