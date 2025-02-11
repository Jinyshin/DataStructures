package linear;

import java.util.NoSuchElementException;
import java.util.Objects;

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
            if (Objects.equals(currValue, value)) {
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
        Node current = head;
        while(current != null) {
            Object currValue = current.getValue();
            if (Objects.equals(currValue, value)) {
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
