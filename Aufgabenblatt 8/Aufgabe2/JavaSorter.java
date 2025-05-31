import java.util.Arrays;

public class JavaSorter<E extends Comparable<E>> extends Sorter<E> {
    @Override
    public void sort(E[] array) {
        Arrays.sort(array);
    }
}
