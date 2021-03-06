package DataStructures;

import java.util.Iterator;

/**
 * DynamicArray data structure
 */
public class DynamicArray<T> implements Iterable<T> {

    // initialize class variables
    private T[] array;
    private int length = 0; // length of array returned to user
    private int capacity = 0; // length of actual array in memory

    public DynamicArray() {
        /**Default constructor with default capacity size of 16. */
        this(16);
    }

    public DynamicArray(int capacity) {
        /**Standard constructor to initialize a DynamicArray object. */
        if (capacity < 0) {
            throw new IllegalArgumentException("Dynamic Array size of " + capacity + " cannot be negative!");
        }

        this.capacity = capacity;
        array = (T[]) new Object[capacity]; // initialize a new array object and cast it to type T
    }

    public int size() {
        /**Size of array returned to user. */
        return length;
    }

    public boolean isEmpty() {
        /**Checks if DynamicArray is empty. */
        return size() == 0; // why not `length == 0`?
    }

    public T get(int index) {
        /**Getter method. Get the element at index `index`. */
        if (index >= length || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " is not within range!");
        }
        return array[index];
    }

    public void set(int index, T element) {
        /**Setter method. Set an `element` to be at index `index`. */
        if (index >= length || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " is not within range!");
        }
        array[index] = element;
    }

    public void clear() {
        /**Clear all elements inside the DynamicArray. */
        for (int i = 0; i < length; i++) {
            array[i] = null;
        }
        length = 0;
    }

    public void add(T element) {
        /**Add an `element` to the DynamicArray.
         * If capacity of array is 0, then increase it to 1,
         * else double the capacity size, create a new array
         * with the new size and fill in all the elements from old
         * array plus the new element that is to be added.
         * 
         * If there is no need to resize the array, simply
         * add the new element at the last index+1 (index `length)
         * and update the `length` to increment by 1.
         */
        if (length + 1 >= capacity) {
            if (capacity == 0) {
                capacity = 1;
            }
            else {
                capacity *= 2;
            }
            
            // initialize a new array
            T[] newArray = (T[]) new Object[capacity];
            for (int i = 0; i < length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[length++] = element;
    }

    public T pop(int index) {
        /**Remove element at `index` and return that element. */
        if (index >= length || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " is not within range!");
        }

        T element = array[index]; // take element at index
        T[] newArray = (T[]) new Object[length - 1];

        // iterator i for old array, j for new array
        for (int i = 0, j = 0; i < length; i++, j++) {
            if (i != index) {
                newArray[j] = array[i];
            }
            else {
                j--; // decrement j by 1 so that it reaches length-1, not length
            }
        }
        array = newArray;
        capacity = --length; // decrement length by 1 and assign it to capacity
        return element;
    }

    public boolean remove(Object obj) {
        /** Remove element if it exists in the array, returning a boolean */
        for (int i = 0; i < length; i++) {
            if (array[i].equals( obj)) {
                pop(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object obj) {
        /** Returns the index of object if it exists in array */
        for (int i = 0; i < length; i++) {
            if (array[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object obj) {
        /** Returns boolean to indicate if array contains the specified object */
        return indexOf(obj) != -1;
    }
    

    @Override
    public Iterator<T> iterator() {
        /** Method to return an iterator object */
        return new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < length;
            }

            @Override
            public T next() {
                /** Returns next element in array and increments index by 1 */
                return array[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public String toString() {
        /** Returns the string representation of array */
        if (length == 0) {
            return "[]";
        }
        else {
            StringBuilder sb = new StringBuilder(length).append("[");
            for (int i = 0; i < length - 1; i++) {
                sb.append(array[i] + ", ");
            }
            return sb.append(array[length - 1] + "]").toString();
        }
    }
}