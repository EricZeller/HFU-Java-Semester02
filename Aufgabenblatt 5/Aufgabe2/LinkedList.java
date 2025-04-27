public class LinkedList implements Container {
    private class Node {
        int number;
        Node next;
        Node before;

        Node(int number) {
            this.number = number;
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

    public boolean add(int number) {
        head = new Node(number);
        size = size + 1;
        return true;
    }

    public boolean remove(int number) {
        Node node = find(number);
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

    public boolean contains(int number) {
        return (find(number) != null);
    }

    private Node find(int number) {
        for (Node node = head; node != null; node = node.next) {
            if (node.number == number)
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
            System.out.print(node.number + " ");
            node = node.next;
        }
        System.out.print(node.number + " ");
        node = node.before;
        while (node != null) {
            System.out.print(node.number + " ");
            node = node.before;
        }
    }

    // Aufgabe c

    public boolean equals(LinkedList other) {
        Node n1 = this.head;
        Node n2 = other.head;
        while (n1 != null && n2 != null) {
            if (n1.number != n2.number)
                return false;
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1 == null && n2 == null;
    }
}