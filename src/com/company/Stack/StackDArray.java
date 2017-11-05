package com.company.Stack;

import java.util.Arrays;

/**
 * Created by seyha on 11/1/17.
 */
public class StackDArray<T> {

    int size;
    int top;
    Object [] ArrayStack;

    public StackDArray(int size) {
        top = -1;
        this.size = size;
        ArrayStack = new Object[this.size];
    }

    public Boolean isFull() {
        return (top == size-1);
    }

    public Boolean isEmpty() {

        return (top == -1);
    }

    public void push(Object value) {

        ensureCapacity(top+2);

        top = top + 1;
        ArrayStack[top] = value;
    }

    public void ensureCapacity(int minCapacity) {

        int oldCapacity = ArrayStack.length;

        if(minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if(newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            ArrayStack = Arrays.copyOf(ArrayStack, newCapacity);
        }

    }

    public T pop() {

        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }

        T value = (T) ArrayStack[top];
        top = top - 1;
        return value;
    }

    public int getSize() {
        return ArrayStack.length;
    }
}
