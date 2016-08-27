public class NullNode<E> extends AbstractNode<E> {

    private static final String ERROR_NEXTNODE = "A NullNode cannot have next node associated!";
    private static final String ERROR_ELEMENT = "A NullNode cannot have an element inside!";

    public NullNode() {}

    @Override
    public E getElement() throws AssertionError {
        throw new AssertionError(ERROR_ELEMENT);
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
    public void setNextNode(AbstractNode nextNode) throws AssertionError {
        throw new AssertionError(ERROR_NEXTNODE);
    }

    @Override
    public AbstractNode<E> getNextNode() throws AssertionError {
        throw new AssertionError(ERROR_NEXTNODE);
    }
}