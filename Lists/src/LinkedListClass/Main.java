package LinkedListClass;


import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // Employee Variables
        Employee ronaldo = new Employee("Cris", "Ronaldo", 7);
        Employee messi   = new Employee("Lion", "Messi", 10);
        Employee deRossi = new Employee("Ern", "DeRossi", 6);
        Employee kroos   = new Employee("Toni", "Kroos", 8);
        Employee billEnd = new Employee("BILL", "END", 9099);

        // Create Linked List
        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(ronaldo);
        list.addFirst(messi);
        list.addFirst(deRossi);
        list.addFirst(kroos);

        // Another way to print
        /*
        for (Employee employee : list) {
            System.out.println(employee);
        }*/

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" <-> ");
        }
        System.out.print("null");

        // Add to the end of the list
        // the add method implementation of the linkedList class adds element to the end
        list.add(billEnd); // you can also use list.addLast(billEnd);

        // Remove first
        list.removeFirst();
        list.remove(); // does the same thing as above`

        System.out.println("\nAdd Bill to the end of the list");
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" <-> ");
        }

    }
}
