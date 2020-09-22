package DoublyLinkedList;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size = 0;

    // add to the front of the list
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        //check if list is empty
        if (head == null) {
            tail = node;
        }
        else {
            head.setPrevious(node); // assign the head node previous to new node
        }

        head = node; // reassign head to new node
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        // check if list is empty
        if (tail == null) {
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        // if list is empty
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removeNode = head;

        // if there is only one element in the list
        if(head.getNext() == null) {
            tail = null;
        }
        else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;

        return removeNode;
    }

    public EmployeeNode removeFromEnd() {
        // if list is empty
        if(isEmpty()) {
            return null;
        }

        EmployeeNode removeNode = tail;

        if(tail.getPrevious() == null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size --;
        removeNode.setPrevious(null);

        return removeNode;
    }

    // Print the Linked List
    public void printList() {
        System.out.println("Size of LinkedList: " + getSize());
        // Node to traverse Linked List
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.print(current.getEmployee() + " <-> ");
            current = current.getNext();
        }
        System.out.print(" null");
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeNode getHead() {
        return head;
    }

    public EmployeeNode getTail() {
        return tail;
    }
}
