package com.company.Queue;

import com.company.Stack.StackArray;

/**
 * Created by seyha on 11/3/17.
 */
public class HWCombieTwoLinkListDemo {

    public static void main(String[] args) {

        QueueArray<Integer> queueArray = new QueueArray<Integer>(5);
        StackArray<Integer> stackArray =  new StackArray<Integer>(5);

        queueArray.Queue(1);
        queueArray.Queue(3);
        queueArray.Queue(5);
        queueArray.Queue(7);
        queueArray.Queue(9);

        stackArray.push(10);
        stackArray.push(8);
        stackArray.push(6);
        stackArray.push(4);
        stackArray.push(2);






        final HWCombieTwoLinkList  hwCombieTwoLinkList = new HWCombieTwoLinkList(queueArray, stackArray);

        hwCombieTwoLinkList.display();


    }
}
