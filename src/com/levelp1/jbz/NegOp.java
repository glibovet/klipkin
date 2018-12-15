package com.levelp1.jbz;

public final class NegOp<T extends Number> extends UnOp<T> {

    public NegOp(Expression e2) {
        super(e2);
    }

    @Override
    protected T evaluate() {
        T first = e1.getValue();
        if(first instanceof Double) {
            return (T)(Double)(-first.doubleValue());
        } else if(first instanceof Float) {
            return (T)(Float)(-first.floatValue());
        } else if(first instanceof Long) {
            return (T)Long.valueOf(-first.longValue());
        }
        return (T)Integer.valueOf(-first.intValue());
    }

    @Override
    public String toString() {
        return "(-" + e1 + ")";
    }

}
