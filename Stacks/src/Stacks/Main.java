package Stacks;

public class Main {

    public static void main(String[] args) {


        // Employee Objects
        Employee randolph = new Employee("Randolph", "Amaya", 007);
        Employee anthony = new Employee("Anthony", "Amaya", 004);
        Employee rafaGali = new Employee("Rafa", "Arias", 006);
        Employee cGamboa = new Employee("Christian", "Gamboa", 010);

        // LinkedList Stack object
        LinkedStack stack = new LinkedStack();

        // Push employee objects
        stack.push(randolph);
        stack.push(anthony);
        stack.push(rafaGali);
        stack.push(cGamboa);

        // Print stack
        stack.printStack();

        // Peek
        System.out.println("\nPeek:");
        System.out.println(stack.peek());

        // Pop
        System.out.println("\nPop");
        stack.pop();
        stack.printStack();

    }

}
        // Create ArrayStack obj
/*        ArrayStack myStack = new ArrayStack(5);

        // Push employee objs
        myStack.push(randolph);
        myStack.push(anthony);
        myStack.push(rafaGali);
        myStack.push(cGamboa);

        // Print Stack
        myStack.printStack();

        // peek
        System.out.println("\nTesting Peek:");
        System.out.println(myStack.peek());

        // Print Stack
        System.out.println("\nAfter peek");
        myStack.printStack();

        // test pop
        System.out.println("\nTest pop:");
        System.out.println(myStack.pop());

        // Print Stack
        System.out.println("\nAfter pop:");
        myStack.printStack();*/
