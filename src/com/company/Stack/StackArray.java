package com.company.Stack;

/**
 * Created by seyha on 11/1/17.
 */

public class StackArray<T> {

    int size;
    int top;
    Object [] ArrayStack;

    public StackArray(int size) {
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
        if(isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        top = top + 1;
        ArrayStack[top] = value;
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
}
