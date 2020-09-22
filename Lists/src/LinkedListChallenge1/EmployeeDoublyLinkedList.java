package LinkedListChallenge1;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null) {
            tail = node;
        }
        else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
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

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        // return true if you were able to successfully add the employee
        // into the list before the existing employee. Return false
        // if the existing employee doesn't exist in the list
        if(isEmpty()) {
            return false;
        }

        EmployeeNode current = head;

        // if findExisting is at the front
        if(current.getEmployee().equals(existingEmployee)) {
            addToFront(newEmployee);
            return true;
        }

        // first check if there is an existing employee
        while (current != null) {

            // see if they are equal
            if(current.getEmployee().equals(existingEmployee)) {
                // ladies and gentleman we got him

                // if findExisting is at the end
                if (current.equals(tail)) {
                    addToEnd(newEmployee);
                    return true;
                }

                else  {
                    // however if it's in the middle we got some work to do
                    EmployeeNode newEmp = new EmployeeNode(newEmployee);
                    // set new Employee node pointers; attach it to the list
                    newEmp.setNext(current);
                    newEmp.setPrevious(current.getPrevious());
                    // now cut the old lines
                    current.getPrevious().setNext(newEmp); // do this before changing the setPrevious below
                    current.setPrevious(newEmp);
                    return true;
                }

            }
            // if we don't find a match; keep going down the list
            current = current.getNext();

        } // end of while loop

        return false;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        }
        else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
