package linear;

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
        if (head == null) {
            throw new IllegalArgumentException("찾는 원소가 없습니다.");
        }
        if (head.getValue().equals(value)) {
            head = head.getNext();
            return;
        }
        Node current = head;
        Node nextNode = current.getNext();
        while (nextNode != null) {
            if (nextNode.getValue().equals(value)) {
                Node nextOfNextNode = nextNode.getNext();
                current.setNext(nextOfNextNode);
                nextNode.setNext(null);
                return;
            }
            current = nextNode;
            nextNode = current.getNext();
        }
    }

    public boolean contains(Object value) {
        Node current = head;
        while(current != null) {
            if (current.getValue().equals(value)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
}
