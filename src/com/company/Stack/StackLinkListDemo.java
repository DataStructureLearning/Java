package com.company.Stack;

/**
 * Created by seyha on 11/3/17.
 */
public class StackLinkListDemo {

    public static void main(String[] args) {

        StackLinkList<String> stackLinkList = new StackLinkList<String>();
        stackLinkList.pop();

        stackLinkList.push("Seyha");
        stackLinkList.push("Soda");
        stackLinkList.push("Seyyun");


        System.out.println(stackLinkList.pop());
        System.out.println(stackLinkList.pop());
        System.out.println(stackLinkList.pop());

    }
}
