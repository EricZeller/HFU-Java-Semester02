public class WrapperQueue<E> implements Queue<E> {
    private E[] values;
    private int from, to;

    public WrapperQueue(E[] values, int from, int to) {
        this.values = values;
        this.from = from;
        this.to = to;
    }

    public WrapperQueue(E[] values) {
        this(values, 0, 0);
    }

    public boolean isEmpty() {
        return from >= to;
    }

    public E get() {
        if (isEmpty())
            throw new RuntimeException();
        E result = values[from];
        from++;
        return result;
    }

    public E top() {
        if (isEmpty())
            throw new RuntimeException();
        return values[from];
    }

    public void put(E value) {
        values[to] = value;
        to++;
    }
}