public abstract class AbstractNode<E> {
    protected E element;
    protected AbstractNode<E> nextNode = new NullNode<E>();

    public E getElement() {
        return this.element;
    }

    public abstract int getAmountOfNodesFromHereTillTheEnd();

    public boolean hasNext() {
        return !(this.nextNode instanceof NullNode);
    }

    public void setNextNode(AbstractNode<E> nextNode) {
        this.nextNode = nextNode;
    }

    public AbstractNode<E> getNextNode() {
        return this.nextNode;
    }
}
