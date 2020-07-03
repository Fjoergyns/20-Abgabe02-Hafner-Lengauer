package at.fhj.iit;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
public class GenericQueue <T> implements IQueue <T>
{
    private List <T> elements = new ArrayList <T>();
    private int maxSize = 5;

    /**
     * Constructor of the GenericQueue.
     *
     * @param maxSize the maximal amount of elements the queue can hold
     */
    public GenericQueue(int maxSize)
    {
        this.maxSize = maxSize;
    }

    /**
     * Offer adds an element to the queue
     *
     * @param obj the generic element which gets add to the queue
     *
     * @return true if it is possible; false if there are to many elements
     */
    @Override
    public boolean offer(T obj)
    {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    /**
     * Poll returns the next element in the queue and removes it from the queue
     *
     * @return next generic element of the queue
     */
    @Override
    public T poll()
    {
        T element = peek();

        if (elements.size() != 0)
        {
            elements.remove(0);
        }

        return element;
    }

    /**
     * Remove removes the next element from the queue
     *
     * @return next generic removed element
     *
     * @throws NoSuchElementException if there are no elements left in the queue
     */
    @Override
    public T remove()
    {
        T element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    /**
     * Peek returns the next element
     *
     * @return the next generic element of the queue; null if there are no elements left
     */
    @Override
    public T peek()
    {
        T element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    /**
     * Element returns the next element in the queue
     *
     * @return next generic element
     *
     * @throws NoSuchElementException if there are no elements left in the queue
     */
    @Override
    public T element()
    {
        T element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}
