package ArrayLists;

import LinkedList.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List<LinkedList.Employee> employeeList = new ArrayList<>();

        // add items to list
        employeeList.add(new LinkedList.Employee("Jane", "Jones", 407));
        employeeList.add(new LinkedList.Employee("randolph", "amaya", 910));
        employeeList.add(new LinkedList.Employee("anthony", "amaya", 711));
        employeeList.add(new LinkedList.Employee("Mike", "Wilson", 101));

        // print employees
        System.out.println("\nPrint Array");
        employeeList.forEach(employee -> System.out.print(employee + "\n"));

        // Print employee at position 1
        System.out.println("\nEmployee at Position 1:");
        System.out.println(employeeList.get(1)); // O(1) time complexity

        // Check if Arraylist is empty
        System.out.println("\nCheck if ArrayList is Empty:");
        System.out.println(employeeList.isEmpty());

        // Replace
        System.out.println("\nReplace employee at Postion 1");
        employeeList.set(1, new LinkedList.Employee("Cristiano", "Ronaldo", 400));

        // Print ArrayList
        System.out.println("\nCheck to see");
        employeeList.forEach(employee -> System.out.print(employee + "\n"));

        // Get the number of items of the list
        System.out.println("\nNumber of Elements in the List");
        System.out.println(employeeList.size());

        // Add Employee at a specific index
        System.out.println("\nAdd employee at specific index");
        employeeList.add(3, new LinkedList.Employee("Lionel", "Messi", 520));

        // print employees
        System.out.println("\nPrint Array");
        employeeList.forEach(employee -> System.out.print(employee + "\n"));

        // Get an Employee Array
        System.out.println("\nGetting an employee array");
        LinkedList.Employee[] employeeArray = employeeList.toArray(new LinkedList.Employee[employeeList.size()]);
        for (LinkedList.Employee employee : employeeArray) {
            System.out.println(employee + " ");
        }

        // Get an Object Array
        System.out.println("\nGetting an object array");
        Object[] objempArray = employeeList.toArray();
        for(Object o : objempArray) {
            System.out.println(o + " ");
        }

        // Check if a list contains an instance
        System.out.println("\nContains");
        // Will come out false unless you override the equals method of the Object class
        System.out.println(employeeList.contains(new LinkedList.Employee("anthony", "amaya", 711)));

        // Where is Messi?
        System.out.println("\nGet Index of Messi");
        System.out.println(employeeList.indexOf(new Employee("Lionel", "Messi", 520)));


        // Remove Messi
        System.out.println("\nRemove Messi");
        employeeList.remove(3);
        employeeList.forEach(employee -> System.out.println(employee));


    }

} // end of ArrayLists class
