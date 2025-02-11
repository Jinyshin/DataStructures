package linear;

import org.jetbrains.annotations.Nullable;

public class Node {
    private Object value;
    private Node next;

    public Node(@Nullable Object value) {
        this.value = value;
        this.next = null;
    }

    @Nullable
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Node other = (Node) obj;
        if (value == null) {
            return other.value == null;
        } else {
            return value.equals(other.value);
        }
    }

    @Override
    public int hashCode() {
        return value == null ? 0 : value.hashCode();
    }
}
