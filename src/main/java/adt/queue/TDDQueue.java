package adt.queue;

import adt.queue.nodes.FullNode;
import adt.queue.nodes.Node;
import adt.queue.nodes.NullNode;

class TDDQueue<T> implements Queue<T> {
    private Node<T> top;

    TDDQueue() {
        this.top = new NullNode<>();
    }

    TDDQueue(T top) {
        this.top = new FullNode<>(top);
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
