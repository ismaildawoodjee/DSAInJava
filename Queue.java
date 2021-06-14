import java.util.Iterator;
import java.util.LinkedList;

/**
 * Queue implementation using a LinkedList class from Java. This queue also
 * uses LinkedList methods in the background.
 */
public class Queue<T> implements Iterable<T> {

    LinkedList<T> list = new LinkedList<T>();

    public Queue() {
        /** Default constructor for an empty Queue */
    }

    public Queue(T firstElem) {
        /** Standard constructor for a Queue with one element */
        enqueue(firstElem);
    }

    public int size() {
        /** Returns the size (number of elements) in the Queue */
        return list.size();
    }

    public boolean isEmpty() {
        /** Checks if the Queue is empty */
        return list.size() == 0;
    }

    public void enqueue(T elem) {
        /** Adds an element to the end of the Queue */
        list.addLast(elem);
    }

    public void dequeue() {
        /** Removes the element at the front of the Queue and returns it */
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        list.removeFirst();
    }

    public T peek() {
        /** Accesses the element at the front of the Queue */
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        return list.peekFirst();
    }

    public int search(T elem) {
        /** Searches for an element inside the Queue, returning its index */
        return list.lastIndexOf(elem);
    }

    @Override
    public Iterator<T> iterator() {
        /** This method is to allow users to iterate through the Queue */
        return list.iterator();
    }

    @Override
    public String toString() {
        /** Returns a string representation of the Queue */
        if (size() == 0) {
            return "[]";
        }
        else {
            StringBuilder sb = new StringBuilder(size()).append("[First: ");
            for (int i = 0; i < size() - 1; i++) {
                sb.append(list.get(i) + "] <- [");
            }
            return sb.append("Last: " + list.get(size() - 1) + "]").toString();
        }
    }
}