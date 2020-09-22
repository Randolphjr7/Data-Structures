package LinkedList;

public class SinglyLinkedList {

    public static void main(String[] args) {

        // Employee Variables
        Employee ronaldo = new Employee("Cristiano", "Ronaldo", 7);
        Employee messi   = new Employee("Lionel", "Messi", 10);
        Employee deRossi = new Employee("Ernesto", "DeRossi", 6);
        Employee kroos   = new Employee("Toni", "Kroos", 8);

        // Object of EmployeeLinkedList class
        EmployeeLinkedList list = new EmployeeLinkedList();

        // Check if Linkedlist is empty
        System.out.println("Check if LinkedList is Empty");
        System.out.println(list.isEmpty());

        // add Employee objects
        list.addToFront(ronaldo);
        list.addToFront(messi);
        list.addToFront(deRossi);
        list.addToFront(kroos);

        // Check if Linkedlist is empty
        System.out.println("Check if LinkedList is Empty");
        System.out.println(list.isEmpty());

        // Print linkedList
        list.printList();

        // Remove
        System.out.println();
        System.out.println("\nRemove from the front");
        list.removeFromFront();
        list.printList();

    }
}
