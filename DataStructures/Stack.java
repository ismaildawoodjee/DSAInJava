package DataStructures;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Linked-list implementation of a Stack. All four stack operations `push`, 
 * `pop`, `peek`, `search` use LinkedList methods behind the scene.
 */
public class Stack<T> implements Iterable<T> {

    // Initialize an empty doubly-linked list class provided by Java
    private LinkedList<T> list = new LinkedList<T>();

    public Stack() {
        /** Default constructor to initialize an empty Stack */
    }

    public Stack (T firstElem) {
        /** Standard constructor for a Stack with one element */
        push(firstElem);
    }

    public int size() {
        /** Returns the size (number of elements) of a Stack object */
        return list.size();
    }

    public boolean isEmpty() {
        /** Checks if the Stack is empty */
        return size() == 0;
    }

    public void push(T elem) {
        /** Push (add) an element onto the top of a Stack. This method
         * uses the LinkedList's `addLast` method behind the scene.
        */
        list.addLast(elem);
    }

    public T pop() {
        /** Remove the element at the top of a Stack and return it.
         * Uses the `removeLast` method of a LinkedList.
         */
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeLast();
    }

    public T peek() {
        /** Peeks (access the element) at the top of a Stack, returning 
         * that element.
         */
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.peekLast();
    }

    public int search(T elem) {
        /** Searches for an element inside the stack, returning its index
         * if found. Otherwise returns -1
         */
        return list.lastIndexOf(elem);
    }

    @Override
    public Iterator<T> iterator() {
        /** This method is to allow users to iterate through the stack */
        return list.iterator();
    }

    @Override
    public String toString() {
        /** Returns a string representation of the stack */
        if (size() == 0) {
            return "\n===";
        }
        else {
            StringBuilder sb = new StringBuilder(size()).append("\n===");
            for (int i = size() - 1; i >= 0; i--) {
                sb.append("\n" + list.get(i) + " \n===");
            }
            return sb.toString();
        }
    }
}