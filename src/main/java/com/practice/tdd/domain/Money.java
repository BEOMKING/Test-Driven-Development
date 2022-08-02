package com.practice.tdd.domain;

public abstract class Money {
    abstract Money times(int multiplier);

    protected int amount;

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return getClass().equals(object.getClass())
                && amount == money.amount;
    }
}
