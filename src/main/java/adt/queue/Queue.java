package adt.queue;

public interface Queue<T> {
    boolean isEmpty();
    int size();
    void add(T item);
    T top() throws AssertionError;
    void remove() throws AssertionError;
}
