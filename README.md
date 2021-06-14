# Data Structures and Algorithms in Java

## Introduction
A summary of data structures, algorithms, discussion of their time and space complexities, and their implementations in Java.

## Data Structures
A data structure organizes data so that it can be used effectively. They help to manage and organize data, make writing code cleaner and easier to understand, and they are essential for creating fast and powerful algorithms. All data structures have four main operations:
- **Access**: and read values stored in the data structure.
- **Search**: for arbitrary values in the data structure.
- **Insert**: values at any point in the data structure.
- **Delete**: values in the data structure.

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
A **Linked List** is a linear data structure, a sequential list, where each element in the list is contained within an object called a **Node**. A node contains two pieces of information: a data item, and a **pointer**/reference to the next node in the list. The **Head** is the first node in the linked list, while the **Tail** is the last node in the linked list, and does not point to anything (or points to `None` or `null`). 

In a  **Singly-linked List**, each node stores a reference to the next node whereas in a **Doubly-linked List**, each node stores references to both the next node and the previous node. Linked lists are used in List, Queue, Stack, circular list implementations, and for separate chaining in HashTable implementations to deal with hash collisions.

When performing a data structure operation on linked lists, we keep track of the head node pointer (and sometimes the tail node pointer as well), and initialize a new pointer to traverse the linked list as the very first step. The performance of the operation depends on how far the the new pointer has to traverse to carry out the operation.

#### Complexity

Singly-linked Lists:
1. **Access** is `O(n)`. Linked lists don't have indices so to access an element, we need to traverse through with a pointer.
2. **Search** is `O(n)`. Similar to accessing, searching for an element in a linked-list requires traversal.
3. **Insert** is `O(n)` or `O(1)`. If inserting at the head/tail, it takes constant time, otherwise, it takes linear time.
4. **Delete** is `O(n)` or `O(1)`. If deleting at the head, it takes constant time, otherwise, it takes linear time. This is because after deleting the tail, we need to assign a new tail to the previous node of the old tail, and to do that we need to access the data contained within the old tail's previous node.

Doubly-linked Lists:
1. **Access** is `O(n)`. Same as singly-linked list.
2. **Search** is `O(n)`. Same as singly-linked list.
3. **Insert** is `O(n)` or `O(1)`. Same as singly-linked list.
4. **Delete** is `O(n)` or `O(1)`. If deleting at the head/tail, it takes constant time, otherwise, it takes linear time.

### Stacks

A **stack** is a linear data structure, which models a real world stack (like a
stack of books/plates) and has two primary operations: `push` and `pop`. These
operations only occur at the top of the stack, following the LIFO (Last In 
First Out) principle. In LIFO, elements that are last added to the top of the 
stack (Last In) are the ones that get removed first (First Out). Stacks are 
usually implemented using Linked Lists (there is always a pointer at the top of
the stack). They are used in redo-undo mechanisms, recursive programming, and 
for the Depth First Search (DFS) graph traversal algorithm.

#### Complexity

1. **Access** (`peek`) is `O(1)`. Peeking at the top of the stack occurs in
constant time.
2. **Search** is `O(n)`. Searching through the stack takes linear time because
the required element might be at the bottom of the stack.
3. **Insert** (`push`) is `O(1)`. Pushing a new element to the top of the stack
takes constant time.
4. **Delete** (`pop`) is `O(1)`. Removing an element from the top takes `O(1)`.

### Queues

A **queue** is a linear data structure, modelling a real world queue (e.g.
waiting lines) and has two primary operations: `enqueue` and `dequeue`. Enqueue
happens at the start while dequeue happens at the end, following the First In
First Out (FIFO) principle, or First-Come First-Served. The very first element
that gets added to the queue is also the element that gets removed first.

Queues are implemented using Doubly Linked Lists and have pointers at 
both the start and end. They are used in web server request management, where
the client that requests first, gets served first. Also used in the Breadth
First Search (BFS) graph traversal algorithm.

#### Complexity

1. **Acess** (`peek`) is `O(1)`. Peeking at the start takes constant time
because there is a pointer at the queue's head.
2. **Search** is `O(n)`. Same as a stack.
3. **Insert** (`enqueue`) is `O(1)`. Adding an element at the head takes
constant time, same as a Doubly Linked List.
4. **Delete** (`dequeue`) is `O(1)`. Removing an element from the tail of the
queue takes constant time.

## Algorithms



### Linear Search


### Binary Search



