package com.levelp1.jbz;

public final class Const<T> extends Expression<T> {

    private T value;


    public Const(T value) {

        this.value = value;
    }

    @Override
    protected T evaluate() {
        return this.value;
    }

    @Override
    public String toString() {
        return "" + value + "";
    }
}
