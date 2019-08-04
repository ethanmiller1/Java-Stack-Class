package interview;

import java.util.NoSuchElementException;

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

        // Store previous head in new node.
        Node oldhead = head;

        // Overwrite head with blank Node.
        head = new Node();

        // Set pushed data as the new head.
        head.data = data;

        // Set the old head as the next node.
        head.next = oldhead;
    }


    public Object pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack is empty");

        // Save the current head to return it later.
        Node top = new Node();
        top = head;

        // Make the next node the current head.
        head = head.next;

        // Return the top layer.
        return top.data;
    }
}
