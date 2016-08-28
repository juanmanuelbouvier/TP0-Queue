package adt.queue.nodes;

import adt.queue.nodes.FullNode;
import adt.queue.nodes.Node;
import adt.queue.nodes.NullNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
        nullNode.setNextNode(new NullNode<>());
    }

    @Test(expected = AssertionError.class)
    public void testGetNextNodeThrowsAssertionError() {
        nullNode.getNextNode();
    }

    @Test
    public void testAmountOfNodesFromHereTillTheEndIs0() {
        assertTrue(nullNode.getAmountOfNodesFromHereTillTheEnd() == 0);
    }

    @Test
    public void testDoesNotHaveNextNode() {
        assertFalse(nullNode.hasNext());
    }

    @Test
    public void testAddNullElementToTailTopReturnsFullNodeAsTop() {
        Node<Object> top = nullNode.addElementToTailTop(null);
        assertTrue(top instanceof FullNode);
    }
}
