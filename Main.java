import DataStructures.BinarySearchTree;
import DataStructures.DynamicArray;
import DataStructures.Queue;
import DataStructures.Stack;

import Algos.LinearSearch;
import Algos.BinarySearch;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // DynamicArray<Integer> array = new DynamicArray<Integer>(5);
        // array.add(5);
        // array.add(3);
        // array.add(-4);
        // array.add(-12);
        // System.out.println(array.size());
        // System.out.println(array.isEmpty());
        // System.out.println(array.get(1));
        // array.set(2, -9);
        // System.out.println(array.pop(3));
        // System.out.println(array.remove(5));
        // System.out.println(array.contains(-4));
        // System.out.println(array.indexOf(-4));
        // System.out.println(array);
        // array.clear();
        // System.out.println(array);
        // System.out.println();

        // Stack<String> stack = new Stack<String>("elem1");
        // stack.push("elem2");
        // stack.push("elem3");
        // stack.push("elem4");
        // System.out.println(stack.toString());
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());
        // System.out.println(stack.search("elem1"));
        // System.out.println(stack.toString());
        // System.out.println();
        
        // Queue<Integer> queue = new Queue<Integer>(2);
        // queue.enqueue(7);
        // queue.enqueue(1); queue.enqueue(8); queue.enqueue(2); queue.enqueue(8);
        // queue.enqueue(1); queue.enqueue(8); queue.enqueue(2); queue.enqueue(8);
        // System.out.println(queue.toString());
        // queue.dequeue();
        // System.out.println(queue.toString());
        // System.out.println(queue.peek());
        // queue.dequeue();
        // queue.enqueue(5); queue.enqueue(6);
        // System.out.println(queue.toString());
        // System.out.println();

        // BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        // System.out.println(bst.isEmpty());
        // System.out.println(bst.size());
        // System.out.println(bst.height());
        // System.out.println(bst.add(51));
        // System.out.println(bst.add(60));
        // System.out.println(bst.add(42));
        // System.out.println(bst.isEmpty());
        // System.out.println(bst.size());
        // System.out.println(bst.height());
        // System.out.println(bst.add(36));
        // System.out.println(bst.add(75));
        // System.out.println(bst.add(72));
        // System.out.println(bst.add(72));
        // System.out.println(bst.add(36));
        // System.out.println(bst.add(24));
        // System.out.println(bst.add(-10));
        // System.out.println(bst.size());
        // System.out.println(bst.height());
        // System.out.println(bst.remove(75));
        // System.out.println(bst.height());

        int[] lsData = new int[] {10, 5, 2, 0, 9, 6, 8, 1, 14, 3, 4, 7};
        int lsTarget = 4;

        LinearSearch ls = new LinearSearch();
        boolean result = ls.search(lsData, lsTarget);
        System.out.println(result);

        int[] bsData = new int[] {-3,-2,-1,0,1,1,  2,  3,5,8,13,21,34};
        int[] bsData2 = new int[] {-3,-2,-1,0,1,1,  2,  3,5,8,13,21,34,55};

        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(bsData, 3));
        System.out.println(bs.search(bsData, 12));
        System.out.println(bs.search(bsData2, 3));
        System.out.println(bs.search(bsData2, 12));
    }
}