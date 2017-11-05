package com.company.Queue;

/**
 * Created by seyha on 11/3/17.
 */
public class QueueArrayDemo {

    public static void main(String[] args) {

        QueueArray<String> queueArray = new QueueArray<String>(5);

        queueArray.DeQueue();

        queueArray.Queue("Seyha");
        queueArray.Queue("Soda");
        queueArray.Queue("Seyun0");
        queueArray.Queue("Seyun1");
        queueArray.Queue("Seyun2");
//        queueArray.Queue("Seyun3");

        while(!queueArray.isEmpty()) {
            System.out.println(queueArray.DeQueue());
        }

    }
}
