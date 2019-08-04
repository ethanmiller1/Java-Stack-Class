package interview;

public class Stack {

    private class Node {
        Object data;
        // Memory address of the level behind the top level.
        Node next;
    }

    Node head = new Node();

    public boolean isEmpty() {
        if (head.data == null) {
            return true;
        } else {
            return false;
        }
    }

    public Object peakTop() {
        return head.data;
    }

    public void push(Object data) {

        if (head.data != null) {
            // Create a new node every time push is invoked.
            Node pushed = new Node();

            // Store previous head in new node.
            pushed = head;

            // Point to previous head in new head.
            head.next = pushed;
        }

        // Make pushed the new head.
        head.data = data;
    }

    public Object pop() {
        if (head.data == null) {
            // TODO: Raise exception.
            return null;
        }

        // Save the current head to return it later.
        Node top = new Node();
        top.data = head.data;

        // Make the next node the current head.
        head = head.next;

        // Return the top layer.
        return top.data;
    }
}
