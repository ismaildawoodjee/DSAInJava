package DataStructures;

/**
 * BinarySearchTree data structure using a `Node` class to represent
 * nodes. The code `T extends Comparable<T>` means that the element type T
 * must support comparison between other elements of the same type, since a
 * BST is built by comparing if one node is greater/less than another node.
 * So the BST class can take in any data type as long as it is comparable.
 */
public class BinarySearchTree<T extends Comparable<T>> {

    // Tracks the number of nodes in the BST
    private int nodeCount = 0;

    // Keeping a pointer on the BST's root node
    private Node root = null;

    // The Node class containing an element and pointers to two child nodes
    private class Node {
        T data;
        Node left, right;

        public Node(Node left, Node right, T elem) {
            this.data = elem;
            this.left = left;
            this.right = right;
        }
    }

    public int size() {
        return nodeCount;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean add(T elem) {
        /** Public method to add an element to the BST. This method uses a
         * private helper method with the same name to recursively add a new
         * element.
         */
        if (contains(elem)) {
            return false;
        }
        else {
            root = add(root, elem);
            nodeCount++;
            return true;
        }
    }

    private Node add(Node node, T elem) {
        /** Private helper method to recursively add an element to the BST */

        // Base case to stop recursion when a leaf node is found
        if (node == null) {
            node = new Node(null, null, elem);
        }
        // Else, recursively traverse to either left subtree or right subtree
        // based on a comparison of element values
        else {
            if (elem.compareTo(node.data) < 0) {
                node.left = add(node.left, elem);
            }
            else {
                node.right = add(node.right, elem);
            }
        }
        return node;
    }

    public boolean remove(T elem) {
        /** Public method to remove an element from the BST. Like the `add`
         * method, this also uses a private helper method to recursively
         * search the tree and remove the element, then rearranges the tree.
         */
        if (contains(elem)) {
            root = remove(root, elem);
            nodeCount--;
            return true;
        }
        else {
            return false;
        }
    }

    private Node remove(Node node, T elem) {
        /** Private method to remove an element from the BST. */
        if (node == null) {
            return null;
        }

        // comparison between element and current node's value
        int cmp = elem.compareTo(node.data);

        // Search the left subtree if element's value is less than current 
        // node's value. Otherwise, search the right subtree. If neither,
        // we have found the node to remove.
        if (cmp < 0) {
            node.left = remove(node.left, elem);
        }
        else if (cmp > 0) {
            node.right = remove(node.right, elem);
        }
        else {
            // if left subtree doesn't exist, replace node with right child
            if (node.left == null) {
                return node.right;
            }
            // if right subtree doesn't exist, replace node with left child
            else if (node.right == null) {
                return node.left;
            }
            // if both subtrees exist, we can either replace the node with
            // the maximum element of the left subtree, or the minimum element
            // of the right subtree.
            else {
                // Node tmp = findMin(node.right);
                // node.data = tmp.data;
                // node.right = remove(node.right, tmp.data);

                // Alternatively,
                Node tmp = findMax(node.left);
                node.data = tmp.data;
                node.left = remove(node.left, tmp.data);
            }
        }
        return node;
    }

    // private Node findMin(Node node) {
    //     /** Helper method to find the min (leftmost) of a right subtree */
    //     while (node.left != null) {
    //         node = node.left;
    //     }
    //     return node;
    // }

    private Node findMax(Node node) {
        /** Helper method to find the max (rightmost) of a left subtree */
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    public boolean contains(T elem) {
        /** Checks if an element is contained within the tree */
        return contains(root, elem);
    }

    private boolean contains(Node node, T elem) {
        /** Recursive private helper method to determine if the BST contains
         * an element, returning true if so, and returning false if it has 
         * reached a leaf node without finding the element.
         */

        // base case when reaching a leaf node
        if (node == null) {
            return false;
        }
        
        int cmp = elem.compareTo(node.data);

        if (cmp < 0) {
            return contains(node.left, elem);
        }
        else if (cmp > 0) {
            return contains(node.right, elem);
        }
        else {
            return true;
        }
    }

    public int height() {
        /** Calculates the height of a BST using a private helper method */
        return height(root);
    }

    private int height(Node node) {
        /** Takes the maximum height after traversing both left and right
         * subtrees in recursive fashion.
         */
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }
}