# Data Structures and Algorithms in Java

## Introduction
A summary of data structures, algorithms, discussion of their time and space complexities, and their implementations in Java.

## Data Structures
A data structure organizes data so that it can be used effectively. They help to manage and organize data, make writing code cleaner and easier to understand, and they are essential for creating fast and powerful algorithms.

### Arrays (Static Arrays)
An **array** is a container of fixed length containing `n` elements which can be indexed from the range `[0, n-1]`. Each **element** within an array is referenced by a number which is its **index**. All memory blocks storing the addresses of the elements are contiguous, or next to each other.

#### Complexity
1. **Access** is `O(1)`. Each element in an array is indexed, so we can quickly access an element using its index.
2. **Search** is `O(n)`. In the worst case, we have to traverse through the entire array to find an element we want at the very end.


### Array Lists (Dynamic Arrays or Lists)
**ArrayLists** (in Java) or Dynamic Arrays or Lists (in Python) are similar to arrays, except that their size is not fixed. Their size can dynamically change depending on how many elements are inserted or deleted from it.

#### Code
A DynamicArray was made using the native static Arrays in Java. It can take any generic type, denoted by `<T>` and using `implements Iterable<T>` allows us to create this custom data structure as an **iterable**, which means we can use a `for` loop to iterate through the elements of an object of this DynamicArray class.

#### Complexity
1. **Access** is `O(1)`. Like the Array, an ArrayList's elements can also be accessed in constant time using its index.
2. **Search** is `O(n)`. Similar to the Array, we need to traverse through the entire ArrayList, for example, to prove that an element that we want does not exist within the ArrayList.
3. **Insert** is `O(n)`. Insertion takes linear time because all the elements will need to be shifted to the right.
4. **Append** is `O(1)`. Appending means to add an element at the end of the ArrayList, which takes constant time only.
5. **Delete** is `O(n)`. Similar to insertion, deletion takes linear time, because elements will need to be shifted.


### Linked Lists



## Algorithms


### Linear Search


### Binary Search



