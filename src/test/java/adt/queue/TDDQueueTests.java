package adt.queue;

import adt.queue.TDDQueue;
import adt.queue.nodes.FullNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TDDQueueTests {
    private TDDQueue<String> emptyQueue;
    private TDDQueue<String> queueWithInitialTop;

    @Before
    public void setUp() {
        this.emptyQueue = new TDDQueue<>();
        this.queueWithInitialTop = new TDDQueue<>("Top");
    }

    @Test
    public void testEmptyQueueIsEmpty() {
        assertTrue(emptyQueue.isEmpty());
    }

    @Test
    public void testQueueWithInitialTopIsNotEmpty() {
        assertFalse(queueWithInitialTop.isEmpty());
    }

    @Test
    public void testSizeOfEmptyQueueMustBe0() {
        assertEquals(0, emptyQueue.size());
    }

    @Test
    public void testSizeOfEmptyQueueMustBe1AfterAddingElement() {
        emptyQueue.add("Top");
        assertEquals(1, emptyQueue.size());
    }

    @Test
    public void testSizeOfQueueWithInitialTopMustBe1() {
        assertEquals(1, queueWithInitialTop.size());
    }

    @Test
    public void testSizeOfQueueWithInitialTopMustBe2AfterAddingElement() {
        queueWithInitialTop.add("Added");
        assertEquals(2, queueWithInitialTop.size());
    }

    @Test(expected = AssertionError.class)
    public void testRemovingFromEmptyQueueMustThrowAssertionError() {
        emptyQueue.remove();
    }

    @Test
    public void testRemovingTopFromQueueLeavesEmptyQueue() {
        queueWithInitialTop.remove();
        assertTrue(queueWithInitialTop.isEmpty());
    }

    @Test
    public void testSizeOfQueueWithInitialTopMustBe0AfterRemovingTop() {
        queueWithInitialTop.remove();
        assertEquals(0, queueWithInitialTop.size());
    }

    @Test
    public void testAddingTopToEmptyQueueLeavesQueueNotEmpty() {
        emptyQueue.add("Top");
        assertFalse(emptyQueue.isEmpty());
    }

    @Test
    public void testQueueWithInitialTopHasTop() {
        assertEquals("Top", queueWithInitialTop.top());
    }

    @Test(expected = AssertionError.class)
    public void testTopMustThrowAssertionErrorIfQueueIsEmpty() {
        emptyQueue.top();
    }

    @Test
    public void testAddingTopToEmptyQueueLeavesQueueWithTop() {
        emptyQueue.add("Top");
        assertEquals("Top", emptyQueue.top());
    }

    @Test
    public void testAddingElementToQueueWithInitialTopMustNotChangeTop() {
        queueWithInitialTop.add("Added");
        assertEquals("Top", queueWithInitialTop.top());
    }
}
