package com.mk.codePractice.linkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        System.out.print("After insertion at tail: ");
        list.display();

        System.out.print("After insertion at head: ");
        list.insertAtBeginning(0);
        list.display();

        list.insertAtPosition(6, 2);
        System.out.print("After insertion at 2nd position: ");
        list.display();

        list.deleteAtBeginning();
        System.out.print("After deletion at the beginning: ");
        list.display();

        list.deleteAtEnd();
        System.out.print("After deletion at the end: ");
        list.display();

        list.deleteAtSpecificPosition(2);
        System.out.print("After deletion at 2nd position: ");
        list.display();
    }

}
