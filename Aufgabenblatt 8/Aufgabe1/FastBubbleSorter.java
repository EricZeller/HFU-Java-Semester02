public class FastBubbleSorter<E extends Comparable<E>> extends Sorter<E> {
    private boolean bubble(E[] values, int low) {
        boolean swapped = false;
        for (int i = values.length - 1; i > low; i--)
            if (isInverse(values, i - 1, i)) {
                swap(values, i - 1, i);
                swapped = true;
            }
        return swapped;
    }

    public void sort(E[] values) {
        for (int i = 0; i < values.length; i++)
            if (bubble(values, i) == false){
                break;
            }
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
