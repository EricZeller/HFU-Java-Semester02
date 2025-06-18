public interface Container<E> extends Iterable<E> {
    int size();
    boolean add(E value);
    boolean remove(E value);
    boolean contains(E value);
} 
