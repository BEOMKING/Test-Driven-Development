package com.practice.tdd.domain;

public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    String currency() {
        return currency;
    }

    abstract Money times(int multiplier);

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }


    public boolean equals(Object object) {
        Money money = (Money) object;
        return getClass().equals(object.getClass())
                && amount == money.amount;
    }
}
