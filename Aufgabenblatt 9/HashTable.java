import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashTable<E> implements Container<E> {
    private LinkedList<E>[] table;
    private int size = 0;

    public HashTable() {
        this(100);
    }

    private HashTable(int buckets) {
        table = (LinkedList<E>[]) new LinkedList[buckets];
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private LinkedList<E> getBucket(E value) {
        int index = value.hashCode() % table.length;
        if (index < 0) {
            index += table.length;
        }
        return table[index];
    }

    public boolean add(E value) {
        size++;
        return getBucket(value).add(value);
    }

    public boolean remove(E value) {
        boolean removed = getBucket(value).remove(value);
        if (removed) {
            size--;
        }
        return removed;
    }

    public boolean contains(E value) {
        return getBucket(value).contains(value);
    }

    public int size() {
        return size;
    }

    // Für Iterable 
    public Iterator<E> iterator() {
        return new HashTableIterator();
    }

    private class HashTableIterator implements Iterator<E> {
        private int currentBucket = 0;
        private Iterator<E> currentIterator = table[0].iterator();
        // Springe zu nächsten Bucket falls aktueller Bucket leer ist
        public boolean hasNext() {
            while (currentBucket < table.length && !currentIterator.hasNext()) {
                currentBucket++;
                if (currentBucket < table.length) {
                    currentIterator = table[currentBucket].iterator();
                }
            }
            return currentBucket < table.length;
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return currentIterator.next();
        }
    }
}