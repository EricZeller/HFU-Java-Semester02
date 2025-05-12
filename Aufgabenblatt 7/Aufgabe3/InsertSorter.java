public class InsertSorter<E extends Comparable<E>> extends Sorter<E> {
    private void insert(E[] values, int to) {
        for (int i = to; (i >= 1) && isInverse(values, i - 1, i); i--)
            swap(values, i - 1, i);
    }

    public void swap(E[] values, int i, int j) {
        E oldValueI = values[i];
        values[i] = values[j];
        values[j] = oldValueI;
    }

    public boolean isInverse(E[] values, int i, int j) {
        return values[i].compareTo(values[j]) > 0;
    }

    public void sort(E[] values) {
        for (int i = 0; i < values.length; i++)
            insert(values, i);
    }
}