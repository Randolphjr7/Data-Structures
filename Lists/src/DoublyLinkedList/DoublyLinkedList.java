package DoublyLinkedList;

public class DoublyLinkedList {

    public static void main(String[] args) {

        // Employee Variables
        Employee ronaldo = new Employee("Cris", "Ronaldo", 7);
        Employee messi   = new Employee("Lion", "Messi", 10);
        Employee deRossi = new Employee("Ern", "DeRossi", 6);
        Employee kroos   = new Employee("Toni", "Kroos", 8);

        // Doubly LinkedList obj
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        // add employee objs
        list.addToFront(ronaldo);
        list.addToFront(messi);
        list.addToFront(deRossi);
        list.addToFront(kroos);

        // print list
        list.printList();

        // Let's add to the end
        Employee sergio = new Employee("Sergio", "Ramos", 4);
        list.addToEnd(sergio);
        System.out.println();
        System.out.println("\nAfter Adding Sergio");
        list.printList();


        // Remove Sergio
        System.out.println();
        System.out.println("\nAfter Removing Sergio");
        list.removeFromEnd();
        list.printList();
        System.out.println();


        Employee rafa = new Employee("Rafa", "arais", 2);
        list.addToFront(rafa);
        System.out.println("\nAfter Adding rafa");
        list.printList();
        System.out.println("\nHead is: " + list.getHead());

        // Remove from the front of the list
        System.out.println(" ");
        System.out.println("\nRemoving from the Front");
        list.removeFromFront();
        list.printList();

        // Print tail and head
        System.out.println("\n");
        System.out.println("\nHead is: " + list.getHead());
        System.out.println("Tail is: " + list.getTail());

        // Remove from the end
        System.out.println("\n\nRemove from the end");
        list.removeFromEnd();
        System.out.println("Tail is: " + list.getTail());
        list.printList();

        // Remove from the end
        System.out.println("\n\nRemove from the end");
        list.removeFromEnd();
        System.out.println("Tail is: " + list.getTail());
        list.printList();

        // Remove from the end
        System.out.println("\n\nRemove from the end");
        list.removeFromEnd();
        System.out.println("Tail is: " + list.getTail());
        list.printList();

        // Remove from the end
        System.out.println("\n\nRemove from the end");
        list.removeFromEnd();
        System.out.println("Tail is: " + list.getTail());
        list.printList();

    }
}
