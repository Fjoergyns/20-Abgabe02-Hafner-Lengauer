package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;


@DisplayName("Testing StringQueue")
class StringQueueTest
{
    StringQueue stringQueue;

    /**
     * Initializing stringQueue with maxSize 2
     *
     */
    @BeforeEach
    void setup()
    {
        stringQueue = new StringQueue(2);
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
        assertTrue(stringQueue.offer("Hello this is the first string."));
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
        stringQueue.offer("Hello this is the first string.");
        stringQueue.offer("This is the second string.");
        assertFalse(stringQueue.offer("There is no place left for this string."));
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
        stringQueue.offer("Hello this is the first string.");
        stringQueue.offer("This is the second string.");
        assertEquals("Hello this is the first string.", stringQueue.poll());
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
        stringQueue.offer("Hello this is the first string.");
        stringQueue.offer("This is the second string.");
        assertEquals("Hello this is the first string.", stringQueue.remove());
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
        assertThrows(NoSuchElementException.class, () -> stringQueue.remove());
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
        stringQueue.offer("Hello this is the first string.");
        stringQueue.offer("This is the second string.");
        assertEquals("Hello this is the first string.", stringQueue.peek());
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
        assertEquals(null, stringQueue.peek());
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
        stringQueue.offer("Hello this is the first string.");
        stringQueue.offer("This is the second string.");
        assertEquals("Hello this is the first string.", stringQueue.element());
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
        assertThrows(NoSuchElementException.class, () -> stringQueue.element());
    }
}