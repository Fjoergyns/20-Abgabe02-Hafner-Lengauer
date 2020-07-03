package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GenericGenericStringQueueQueueTest
{
    GenericQueue<GenericQueue<String>> genericQueue;

    /**
     * Initializing genericQueue with maxSize 2
     *
     */
    @BeforeEach
    void setup()
    {
        genericQueue = new GenericQueue(2);

    }
    /**
     *  testing offer methode
     *  Passes if it is possible to add an element
     *
     */
    @Test
    @DisplayName("Testing: offer")
    public void testOffer()
    {
        assertTrue(genericQueue.offer(new GenericQueue<String>(2)));
    }

    /**
     *  testing string overflow
     *  Passes if it is not possible to add an element after the maxSize is reached
     *
     */
    @Test
    @DisplayName("Testing: stringOverflow")
    public void testElementOverflow()
    {
        genericQueue.offer(new GenericQueue<String>(2));
        genericQueue.offer(new GenericQueue<String>(2));
        assertFalse(genericQueue.offer(new GenericQueue<String>(2)));
    }

    /**
     *  Testing poll
     *  Passes if is possible to poll the first element
     *
     */
    @Test
    @DisplayName("Testing: poll")
    public void testPoll()
    {
        GenericQueue<String> expectedGenericQueue = new GenericQueue<String>(2);
        genericQueue.offer(expectedGenericQueue);
        genericQueue.offer(new GenericQueue<String>(2));
        assertEquals(expectedGenericQueue, genericQueue.poll());
    }

    /**
     *  Testing remove
     *  Passes if it is possible to remove the first element
     *
     */
    @Test
    @DisplayName("Testing: remove")
    public void testRemove()
    {
        GenericQueue<String> expectedGenericQueue = new GenericQueue<String>(2);
        genericQueue.offer(expectedGenericQueue);
        genericQueue.offer(new GenericQueue<String>(2));
        assertEquals(expectedGenericQueue, genericQueue.remove());
    }

    /**
     *  Testing remove Null
     *  Passes if remove throws an exception because there is no element in the queue
     *
     */
    @Test
    @DisplayName("Testing: remove Null")
    public void testRemoveNull()
    {
        assertThrows(NoSuchElementException.class, () -> genericQueue.remove());
    }

    /**
     *  Testing Peek
     *  Checks the first element in the queue returns null if there are no elements in the queue
     *
     */
    @Test
    @DisplayName("Testing: peek")
    public void testPeek()
    {
        GenericQueue<String> expectedGenericQueue = new GenericQueue<String>(2);
        genericQueue.offer(expectedGenericQueue);
        genericQueue.offer(new GenericQueue<String>(2));
        assertEquals(expectedGenericQueue, genericQueue.peek());
    }

    /**
     *  Testing peekNull
     *  Checks the first element in the queue returns null if there are no elements in the queue
     *
     */
    @Test
    @DisplayName("Testing: peekNull")
    public void testPeekNull()
    {
        assertEquals(null, genericQueue.peek());
    }

    /**
     *  Testing element
     *  Returns the first element from the queue or an exception if there are no elements in the queue
     *
     */
    @Test
    @DisplayName("Testing: element")
    public void testElement()
    {
        GenericQueue<String> expectedGenericQueue = new GenericQueue<String>(2);
        genericQueue.offer(expectedGenericQueue);
        genericQueue.offer(new GenericQueue<String>(2));
        assertEquals(expectedGenericQueue, genericQueue.element());
    }

    /**
     *  Testing elementNull
     *  Returns the first element from the queue or an exception if there are no elements in the queue
     *
     */
    @Test
    @DisplayName("Testing: elementNull")
    public void testElementNull()
    {
        assertThrows(NoSuchElementException.class, () -> genericQueue.element());
    }
}
