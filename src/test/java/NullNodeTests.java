import adt.queue.nodes.NullNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class NullNodeTests {

    private NullNode<Object> nullNode;

    @Before
    public void setUp() {
        this.nullNode = new NullNode<>();
    }

    @Test(expected = AssertionError.class)
    public void testGetElementThrowsAssertionError() {
        nullNode.getElement();
    }

    @Test(expected = AssertionError.class)
    public void testSetNextNodeThrowsAssertionError() {
        nullNode.setNextNode(new NullNode<Object>());
    }

    @Test(expected = AssertionError.class)
    public void testGetNextNodeThrowsAssertionError() {
        nullNode.getNextNode();
    }

    @Test
    public void testAmountOfNodesFromHereTillTheEndIsZero() {
        assertTrue(nullNode.getAmountOfNodesFromHereTillTheEnd() == 0);
    }

    @Test
    public void testDoesNotHaveNextNode() {
        assertTrue(! nullNode.hasNext());
    }

}
