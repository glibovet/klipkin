package com.levelp1.jbz;

public abstract class Expression<T> {

    protected T value;
    private boolean evaluated;

    public T getValue() {
        if (evaluated) return value;
        else {
            value = evaluate();
            evaluated = true;
            return value;
        }
    }

    abstract protected T evaluate();

    @Override
    abstract public String toString();
}
