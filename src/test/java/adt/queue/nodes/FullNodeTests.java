package adt.queue.nodes;

import adt.queue.nodes.FullNode;
import adt.queue.nodes.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FullNodeTests {

    private FullNode<String> stringNode;

    @Before
    public void setUp() {
        this.stringNode = new FullNode<>("Testing");
    }

    @Test
    public void testGetElementReturnsCorrectValue() {
        assertEquals("Testing", stringNode.getElement());
    }

    @Test
    public void testSetNextNodeSetCorrectValue() {
        stringNode.setNextNode(new FullNode<>("Added"));
        assertEquals("Added", stringNode.getNextNode().getElement());
    }

    @Test
    public void testAmountOfNodesFromHereTillTheEndIs1() {
        assertTrue(stringNode.getAmountOfNodesFromHereTillTheEnd() == 1);
    }

    @Test
    public void testAmountOfNodesFromHereTillTheEndIs2() {
        stringNode.setNextNode(new FullNode<>("Added"));
        assertTrue(stringNode.getAmountOfNodesFromHereTillTheEnd() == 2);
    }

    @Test
    public void testDoesNotHaveNextNode() {
        assertFalse(stringNode.hasNext());
    }

    @Test
    public void testHasNextNode() {
        stringNode.setNextNode(new FullNode<>("Added"));
        assertTrue(stringNode.hasNext());
    }

    @Test
    public void testAddElementToTailTopReturnsActualNodeAsTop() {
        assertEquals(stringNode, stringNode.addElementToTailTop("Added"));
    }
}