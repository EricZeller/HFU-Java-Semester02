package Aufgabe2;

public interface Container<E> {
    int size();
    boolean add(E value);
    boolean remove(E value);
    boolean contains(E value);
} 
