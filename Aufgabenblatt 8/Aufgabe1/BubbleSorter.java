public class BubbleSorter<E extends Comparable<E>> extends Sorter<E> {
    private void bubble(E[] values, int low) {
        for (int i = values.length - 1; i > low; i--)
            if (isInverse(values, i - 1, i))
                swap(values, i - 1, i);
    }

    public void sort(E[] values) {
        for (int i = 0; i < values.length; i++)
            bubble(values, i);
    }

    public void swap(E[] values, int i, int j) {
        E oldValueI = values[i];
        values[i] = values[j];
        values[j] = oldValueI;
    }

    public boolean isInverse(E[] values, int i, int j) {
        return values[i].compareTo(values[j]) > 0;
    }
}
