package com.levelp1.jbz;

public abstract class BinOp<T> extends Expression<T> {

    protected Expression<T> e1, e2;

    public BinOp(Expression<T> e1, Expression<T> e2) {
        this.e1 = e1;
        this.e2 = e2;
    }


}
