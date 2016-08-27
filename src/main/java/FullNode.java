public class FullNode<E> extends AbstractNode<E> {

    public FullNode(E element) {
        this.element = element;
    }

    @Override
    public int getAmountOfNodesFromHereTillTheEnd() {
        return 1 + this.nextNode.getAmountOfNodesFromHereTillTheEnd();
    }
}