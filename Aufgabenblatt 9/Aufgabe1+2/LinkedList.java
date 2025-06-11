import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements Container<E> {
    private class Node {
        E value;
        Node next;
        Node before;

        Node(E value) {
            this.value = value;
            this.next = head;
            if (head != null) {
                head.before = this;
            }
            this.before = null;
        }
    }

    private Node head;
    private int size;

    public int size() {
        return size;
    }

    public boolean add(E value) {
        head = new Node(value);
        size = size + 1;
        return true;
    }

    public boolean remove(E value) {
        Node node = find(value);
        if (node == null) {
            return false;
        }
        if (node.before != null) {
            node.before.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.before = node.before;
        }
        size = size - 1;
        return true;
    }

    public boolean contains(E value) {
        return (find(value) != null);
    }

    private Node find(E value) {
        for (Node node = head; node != null; node = node.next) {
            if (node.value.equals(value))
                return node; // nutzt nun die neue equals Methode aus Fraction, welche den Denominator und
                             // Numerator vergleicht
        }
        return null;
    }

    public void dumpRoundTrip() {
        Node node = head;
        if (node == null)
            return;
        while (node.next != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.print(node.value + " ");
        node = node.before;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.before;
        }
    }

    // Neu für Interable
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        private Node current = head;

        public boolean hasNext() {
            return current != null;
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E value = current.value;
            current = current.next;
            return value;
        }
    }

}