package adt.queue.nodes;

public interface Node<E> {

    E getElement();

    int getAmountOfNodesFromHereTillTheEnd();

    boolean hasNext();

    void setNextNode(Node<E> nextNode);

    Node<E> getNextNode();

    Node<E> addElementToTailTop(E element);
}
