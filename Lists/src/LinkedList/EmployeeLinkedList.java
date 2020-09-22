package LinkedList;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size = 0;

    // add to the front of the list
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;

        return removeNode;
    }

    // Print the Linked List
    public void printList() {
        System.out.println("Size of LinkedList: " + getSize() + "\n");
        // Node to traverse Linked List
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.print(current.getEmployee() + " -> ");
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
}
