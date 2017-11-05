package com.company.Stack;

/**
 * Created by seyha on 11/1/17.
 */
public class StackDArrayDemo {

    public static void main(String[] args) {

        StackDArray<Integer> stackArray = new StackDArray<Integer>(4);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        System.out.println("Stack Size " + stackArray.getSize());
        stackArray.push(14);
        System.out.println("Stack Size " + stackArray.getSize());

        while (!stackArray.isEmpty()) {
            System.out.println(stackArray.pop());
        }

        stackArray.pop();
    }
}
