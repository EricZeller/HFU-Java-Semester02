import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashTable<T> implements Container<T> {
    private LinkedList<T>[] table;
    private int size = 0;

    public HashTable() {
        this(100);
    }

    private HashTable(int buckets) {
        table = (LinkedList<T>[]) new LinkedList[buckets];
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private LinkedList<T> getBucket(T value) {
        int index = value.hashCode() % table.length;
        if (index < 0) {
            index += table.length;
        }
        return table[index];
    }

    public boolean add(T value) {
        size++;
        return getBucket(value).add(value);
    }

    public boolean remove(T value) {
        boolean removed = getBucket(value).remove(value);
        if (removed) {
            size--;
        }
        return removed;
    }

    public boolean contains(T value) {
        return getBucket(value).contains(value);
    }

    public int size() {
        return size;
    }

    // Für Iterable 
    public Iterator<T> iterator() {
        return new HashTableIterator();
    }

    private class HashTableIterator implements Iterator<T> {
        private int currentBucket = 0;
        private Iterator<T> currentIterator = table[0].iterator();
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

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return currentIterator.next();
        }
    }
}