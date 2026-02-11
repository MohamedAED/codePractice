package com.mk.codePractice.linkedList;

public class Node {

    Node prev;
    int data;
    Node next;

    // A constructor is called here
    Node(int value)
    {

        // By default, previous pointer is
        // pointed to NULL
        prev = null;

        // Value is assigned to the data
        data = value;

        // By default, next pointer is pointed
        // to NULL
        next = null;
    }

}
