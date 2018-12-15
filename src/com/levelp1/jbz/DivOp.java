package com.levelp1.jbz;

public final class DivOp<T extends Number> extends BinOp<T> {
    public DivOp(Expression<T> e1, Expression<T> e2) {
        super(e1, e2);
    }

    @Override
    protected T evaluate() {
        T first = e1.getValue();
        T second = e2.getValue();
        if(first instanceof Double || second instanceof Double) {
            return (T)(Double)(first.doubleValue() / second.doubleValue());
        } else if(first instanceof Float || second instanceof Float) {
            return (T)(Float)(first.floatValue() / second.floatValue());
        } else if(first instanceof Long || second instanceof Long) {
            return (T)Long.valueOf(first.longValue() / second.longValue());
        }
        return (T)Integer.valueOf(first.intValue() / second.intValue());
    }

    @Override
    public String toString() {
        return "(" + e1 + "/" + e2 + ")";
    }
}
