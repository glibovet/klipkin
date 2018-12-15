package com.levelp1.jbz;

public final class OrOp<T extends Boolean> extends BinOp<T> {
    public OrOp(Expression e1, Expression e2) {
        super(e1, e2);
    }


    @Override
    protected T evaluate() {
        return (T)(Boolean)((Boolean) e1.getValue() || (Boolean) e2.getValue());
    }

    @Override
    public String toString() {
        return "(" + e1 + "||" + e2 + ")";
    }
}
