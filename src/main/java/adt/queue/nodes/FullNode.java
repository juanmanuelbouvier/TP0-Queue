package adt.queue.nodes;

public class FullNode<E> implements Node<E> {
    private E element;
    private Node<E> nextNode = new NullNode<>();

    public FullNode(E element) {
        this.element = element;
    }

    @Override
    public E getElement() {
        return this.element;
    }

    @Override
    public int getAmountOfNodesFromHereTillTheEnd() {
        return 1 + this.nextNode.getAmountOfNodesFromHereTillTheEnd();
    }

    @Override
    public boolean hasNext() {
        return !(this.nextNode instanceof NullNode);
    }

    @Override
    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public Node<E> getNextNode() {
        return this.nextNode;
    }

    @Override
    public Node<E> addElementToTailTop(E element) {
        findTailEnd().setNextNode(new FullNode<>(element));
        return getTopOnElementAdded();
    }

    private Node<E> getTopOnElementAdded() {
        return this;
    }

    private Node<E> findTailEnd() {
        return (new TailEndFinder(this)).getTailEnd();
    }

    private class TailEndFinder {
        private Node<E> tailEnd;

        TailEndFinder(Node<E> actualNode) {
            this.tailEnd = actualNode;
            while (actualNode.hasNext()) {
                this.tailEnd = actualNode = actualNode.getNextNode();
            }
        }

        Node<E> getTailEnd() {
            return this.tailEnd;
        }
    }

}