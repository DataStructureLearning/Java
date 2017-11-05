package com.company.Stack;

/**
 * Created by seyha on 11/1/17.
 */
public class StatckArrayDemo {

    public static void main(String[] args) {

        StackArray<Integer> stackArray = new StackArray<Integer>(4);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);


        while (!stackArray.isEmpty()) {
            System.out.println(stackArray.pop());
        }
        stackArray.pop();
    }
}
