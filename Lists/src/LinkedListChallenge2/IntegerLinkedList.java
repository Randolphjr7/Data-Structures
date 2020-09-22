package LinkedListChallenge2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public IntegerLinkedList() {
        System.out.println("Constructor of IntegerLinkedList Called");
    }

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        // base case; list is empty or head is greater
        if(isEmpty() || head.getValue() > value) {
            addToFront(value); // assumption is the list is sorted
            return;
        }

        // find the insertion point
        IntegerNode current  = head.getNext();
        IntegerNode previous = head;

        while (current != null && current.getValue() < value) {
            previous = current;
            current  = current.getNext();
        }

        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current);
        previous.setNext(newNode);

        size++;

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
