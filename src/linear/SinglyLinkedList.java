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
        Node target = new Node(value);
        if (head == null) {
            throw new NoSuchElementException("찾는 원소가 없습니다.");
        }
        if (head.equals(target)) {
            head = head.getNext();
            return;
        }
        Node current = head;
        Node nextNode = current.getNext();
        while (nextNode != null) {
            if (nextNode.equals(target)) {
                Node nextOfNextNode = nextNode.getNext();
                current.setNext(nextOfNextNode);
                nextNode.setNext(null);
                return;
            }
            current = nextNode;
            nextNode = current.getNext();
        }
        throw new NoSuchElementException("찾는 원소가 없습니다.");
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
