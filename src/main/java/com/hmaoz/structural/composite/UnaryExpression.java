package com.hmaoz.structural.composite;

public abstract class UnaryExpression implements ArithmeticExpression {
    protected ArithmeticExpression right;

    public UnaryExpression(ArithmeticExpression right) {
        this.right = right;
    }
}
