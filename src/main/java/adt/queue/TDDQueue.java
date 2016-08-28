package adt.queue;

import adt.queue.nodes.Node;
import adt.queue.nodes.FullNode;
import adt.queue.nodes.NullNode;

public class TDDQueue<T extends Object> implements Queue<T> {
    private Node<T> top;

    public TDDQueue() {
        this.top = new NullNode<T>();
    }

    public TDDQueue(T top) {
        this.top = new FullNode<T>(top);
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return this.top.getAmountOfNodesFromHereTillTheEnd();
    }

    @Override
    public void add(T item) {
        this.top = this.top.addElementToTailTop(item);
    }

    @Override
    public T top() throws AssertionError {
        return this.top.getElement();
    }

    @Override
    public void remove() throws AssertionError {
        this.top = this.top.getNextNode();
    }
}
