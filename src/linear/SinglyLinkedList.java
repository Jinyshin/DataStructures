package linear;

import java.util.NoSuchElementException;

public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void add(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void remove(Object value) {
        Node prevNode = null;
        Node currNode = head;

        while (currNode != null) {
            Object currValue = currNode.getValue();
            if (currValue == null && value == null) {
                break;
            } else if (currValue.equals(value)) {
                break;
            }

            prevNode = currNode;
            currNode = currNode.getNext();
        }

        if (currNode == null) {
            throw new NoSuchElementException(" not found: " + (value == null ? "null" : value.toString()));
        }

        if (prevNode == null) {
            head = currNode.getNext();
        } else {
            prevNode.setNext(currNode.getNext());
        }
    }

    public boolean contains(Object value) {
        Node target = new Node(value);
        Node current = head;
        while(current != null) {
            if (current.equals(target)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void printList() {
        Node current = head;
        while(current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
