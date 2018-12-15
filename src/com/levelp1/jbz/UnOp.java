package com.levelp1.jbz;

public abstract class UnOp<T> extends Expression<T> {
    protected Expression<T> e1;

    public UnOp(Expression<T> e1) {
        this.e1 = e1;
    }

}
