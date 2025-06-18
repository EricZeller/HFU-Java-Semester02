import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

class Tree<T extends Comparable> implements Container<T> {
    private Node<T> root;
    private int size = 0;

    private class Node<T> {
        T value;
        Node<T> right, left;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> find(Node<T> parent, T key) {
        int compare = parent.value.compareTo(key);
        if (compare == 0)
            return parent;
        Node<T> child = compare > 0 ? parent.left : parent.right;
        if (child == null)
            return parent;
        return find(child, key);
    }

    public boolean contains(T key) {
        if (root == null)
            return false;
        Node<T> node = find(root, key);
        return node.value.equals(key);
    }

    private boolean addRoot(T key) {
        if (root != null)
            return false;
        size = 1;
        root = new Node<T>(key);
        return true;
    }

    public boolean add(T key) {
        if (addRoot(key))
            return true;
        Node<T> parent = find(root, key);
        int compare = parent.value.compareTo(key);
        if (compare == 0)
            return false;
        Node<T> newNode = new Node<T>(key);
        size++;
        if (compare > 0)
            parent.left = newNode;
        else
            parent.right = newNode;
        return true;
    }

    private class TreeIterator implements Iterator<T> {
        private Node<T> current = root;
        private Stack<Node<T>> stack = new Stack<>();

        public boolean hasNext() {
            return (current != null) || (!stack.isEmpty());
        }

        public T next() {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            T result = current.value;
            current = current.right;
            return result;
        }
    }

    public Iterator<T> iterator() {
        return new TreeIterator();
    }

    public int size() {
        return this.size;
    }

    @Override
    public boolean remove(T value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    private String toString(Node<T> node) {
        if (node == null)
            return "";
        return toString(node.left) + " " + node.value.toString() + " " + toString(node.right);
    }

    @Override
    public String toString() {
        return toString(root);
    }

    //aufgabe 2
    public int depth() {
        return depth(root);
    }

    private int depth(Node<T> node) {
        if (node == null) {
            return 0; // leerer Baum -> Tiefe 0
        } else {
            // Rekursiv die Tiefe des linken und rechten Teilbaums berechnen
            int leftDepth = depth(node.left);
            int rightDepth = depth(node.right);

            // Die größere der beiden Tiefen + 1 (für die aktuelle Ebene)
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

        //aufgabe 3
    public T min() {
        if (root == null) {
            return null;
        }
        return min(root).value;
    }

    private Node<T> min(Node<T> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public T max() {
        if (root == null) {
            return null;
        }
        return max(root).value;
    }

    private Node<T> max(Node<T> node) {
        while (node.right != null) {
            node = node.right; 
        }
        return node;
    }

    // für visuelle Ausgabe
    public void printTree() {
        printTree(root, 0);
    }

    private void printTree(Node<T> node, int depth) {
        if (node == null) {
            return;
        }
        // Rechter Teil (wird zuerst ausgegeben, damit der Baum nach links kippt)
        printTree(node.right, depth + 1);

        // Aktueller Knoten mit Einrückung
        for (int i = 0; i < depth; i++) {
            System.out.print("    "); // 4 Leerzeichen pro Ebene
        }
        System.out.println(node.value); // Wert des Knotens

        // Linker Teil
        printTree(node.left, depth + 1);
    }
}
