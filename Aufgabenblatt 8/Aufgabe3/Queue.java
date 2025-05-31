public interface Queue<E> {
    E get();
    E top();
    boolean isEmpty();
    void put(E value);
}