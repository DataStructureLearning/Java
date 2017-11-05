package com.company.LinkList;

/**
 * Created by seyha on 11/3/17.
 */

public class DoubleLinkListDemo {

    public static void main(String[] args) {

        DoubleLinkList<String> doubleLinkList = new DoubleLinkList<String>();

        doubleLinkList.add("Hello");
        doubleLinkList.add("ME");
        doubleLinkList.add("Welcome");
        doubleLinkList.add("Thank");

        doubleLinkList.delete();

        doubleLinkList.display();
    }
}
