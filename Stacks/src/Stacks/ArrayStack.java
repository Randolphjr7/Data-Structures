package Stacks;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }


    public void push(Employee employee) {
        // check if it's full
        if (top == stack.length) {
            // need to resize the backing array
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
        }

        stack[top++] = employee;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int topIndex = getTop();
        Employee top = stack[topIndex - 1];
        stack[topIndex - 1] = null;
        decrementTop();
        return top;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int topIndex = getTop();
        Employee top = stack[topIndex - 1];
        return top;
    }

    public int getTop() {
        return top;
    }

    public void decrementTop() {
        top--;
    }

    public boolean isEmpty() {
        if(getTop() > 0) {
            return false;
        }
        // empty
        return true;
    }

    public void printStack() {
        System.out.println("========Stack========");
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println("========Stack========");
    }

}
