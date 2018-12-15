package com.levelp1.jbz;

public final class AndOp<T extends Boolean> extends BinOp<T> {
    public AndOp(Expression<T> e1, Expression<T> e2) {
        super(e1, e2);
    }


    @Override
    @SuppressWarnings("unchecked")
    protected T evaluate() {
        return (T)(Boolean)((Boolean) e1.getValue() && (Boolean) e2.getValue());
    }

    @Override
    public String toString() {
        return "(" + e1 + "&&" + e2 + ")";
    }
}
