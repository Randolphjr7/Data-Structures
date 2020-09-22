package StackChallenge;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

    private LinkedList<Character> stack;

    public int numOfElements() {
        return stack.size();
    }

    public LinkedStack() {
        stack = new LinkedList<Character>();
    }

    public void push(Character c) {
        stack.push(c);
    }

    public Character pop() {
        Character c = stack.pop();
        return c;
    }

    public Character peek() {
        Character c = stack.peek();
        return c;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Character> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
