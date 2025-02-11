package linear;

import java.util.NoSuchElementException;

public class HashSet {

    private final SinglyLinkedList[] buckets;
    private final int size;

    // 기본 생성자: 기본 hashSet 용량을 10으로 지정
    public HashSet() {
        this.size = 10;
        this.buckets = new SinglyLinkedList[size];
        for (int i = 0; i < size; i++) {
            buckets[i] = new SinglyLinkedList();
        }
    }

    private int getHashIndex(Object value) {
        int hash = (value == null) ? 0 : value.hashCode();
        return Math.abs(hash) % size;
    }

    public boolean add(Object value) {
        int hash = getHashIndex(value);
        if (!buckets[hash].contains(value)) {
            buckets[hash].add(value);
            return true;
        }
        return false;
    }

    public void remove(Object value) {
        int hash = getHashIndex(value);
        if (buckets[hash].contains(value)) {
            buckets[hash].remove(value);
        } else {
            throw new NoSuchElementException(" not found: " + (value == null ? "null" : value.toString()));
        }
    }

    public boolean contains(Object value) {
        int hash = getHashIndex(value);
        return buckets[hash].contains(value);
    }
}
