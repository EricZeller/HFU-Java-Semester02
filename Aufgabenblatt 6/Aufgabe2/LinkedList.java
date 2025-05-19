
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
            if (node.value == value)
                return node;
        }
        return null;
    }

    // Aufgabe b
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

    // Aufgabe c

    public boolean equals(LinkedList<E> other) {
        Node n1 = this.head;
        Node n2 = other.head;
        while (n1 != null && n2 != null) {
            if (n1.value != n2.value)
                return false;
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1 == null && n2 == null;
    }
}