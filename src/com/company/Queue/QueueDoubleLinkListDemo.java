package com.company.Queue;

/**
 * Created by seyha on 11/3/17.
 */
public class QueueDoubleLinkListDemo {


    public static void main(String[] args) {

        QueueDoubleLinkList<Integer> queueDoubleLinkList = new QueueDoubleLinkList<Integer>();

//        queueDoubleLinkList.DeQueue();

        queueDoubleLinkList.Queue(10);
        queueDoubleLinkList.Queue(20);
        queueDoubleLinkList.Queue(30);
        queueDoubleLinkList.Queue(40);
        queueDoubleLinkList.Queue(50);


        System.out.println(queueDoubleLinkList.DeQueue());
        System.out.println(queueDoubleLinkList.DeQueue());
        System.out.println(queueDoubleLinkList.DeQueue());
        System.out.println(queueDoubleLinkList.DeQueue());
        System.out.println(queueDoubleLinkList.DeQueue());
        System.out.println(queueDoubleLinkList.DeQueue());


    }
}
