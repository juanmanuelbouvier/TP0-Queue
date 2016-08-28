package adt.queue.nodes;

public class NullNode<E> implements Node<E> {

    private static final String ERROR_NULLNODE = "The collection is empty!";

    public NullNode() {}

    @Override
    public E getElement() throws AssertionError {
        throw new AssertionError(ERROR_NULLNODE);
    }

    @Override
    public int getAmountOfNodesFromHereTillTheEnd() {
        return 0;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void setNextNode(Node<E> nextNode) throws AssertionError {
        throw new AssertionError(ERROR_NULLNODE);
    }

    @Override
    public Node<E> getNextNode() throws AssertionError {
        throw new AssertionError(ERROR_NULLNODE);
    }

    @Override
    public Node<E> addElementToTailTop(E element) {
        return getTopOnElementAdded(element);
    }

    private Node<E> getTopOnElementAdded(E element) {
        return new FullNode<>(element);
    }
}