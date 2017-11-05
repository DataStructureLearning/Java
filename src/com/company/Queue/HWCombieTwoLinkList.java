package com.company.Queue;

import com.company.Stack.StackArray;

/**
 * Created by seyha on 11/3/17.
 */
public class HWCombieTwoLinkList<T> {

    QueueArray<T> queueArray;
    StackArray<T> stackArray;

    public HWCombieTwoLinkList(QueueArray queuqArray,  StackArray stackArray) {
        this.queueArray = queuqArray;
        this.stackArray = stackArray;
    }


    public void display() {

        while (!queueArray.isEmpty() || !stackArray.isEmpty()){

            System.out.println("Two combine : Queue:" + queueArray.DeQueue() + " Stack:" + stackArray.pop() );
        }
    }

}
