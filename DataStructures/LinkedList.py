"""Python code for creating a singly-Linked List"""

class Node:
    """
    Class for representing the Node objects of a Linked List.
    Each Node has two attributes: data stored in the node and
    a pointer to the next Node in the Linked List.
    """
    def __init__(self, data=None, nextNode=None):
        self.data = data
        self.nextNode = nextNode
        
    def __repr__(self):
        """String representation of a Node."""
        return f"[{self.data}]"
    
    
class LinkedList:
    """
    Class for representing a Linked List object. There are
    two pointers each in a Linked List, pointing to the head
    Node and to the tail Node.
    """
    def __init__(self):
        self.head = None
        self.size = 0
        
    
    def __repr__(self):
        nodeList = []
        pointer = self.head
        
        while pointer:
            if pointer is self.head:
                nodeList.append(f"[Head: {pointer.data}]")
            elif pointer.nextNode is None:
                nodeList.append(f"[Tail: {pointer.data}]")
            else:
                nodeList.append(f"[{pointer.data}]")
            pointer = pointer.nextNode
        
        return "-> ".join(nodeList)
    
    
    def isEmpty(self):
        """Checks if Linked List is empty by checking its size."""
        return self.size == 0
    
    
    def get(self, index):
        """Get the element at `index` position."""
        if index < 0 or index >= self.size:
            return -1
        if self.head is None:
            return -1
        
        # pointer starts at head and traverses through
        pointer = self.head  
        for i in range(index):
            pointer = pointer.nextNode
        return pointer.data
    
    
    def insert(self, index, element):
        """Insert new Node at `index` position."""
        if index < 0 or index > self.size:
            return
        
        newNode = Node(element)
        if index == 0:
            newNode.nextNode = self.head
            self.head = newNode
        else:
            pointer = self.head
            for i in range(index - 1):
                pointer = pointer.nextNode
            newNode.nextNode = pointer.nextNode
            pointer.nextNode = newNode
        self.size += 1
    
    
    def remove(self, index):
        """Remove the Node at `index` position."""
        if index < 0 or index >= self.size:
            return
        
        pointer = self.head
        if index == 0:
            self.head = pointer.nextNode
        else:
            for i in range(index - 1):
                pointer = pointer.nextNode
            pointer.nextNode = pointer.nextNode.nextNode
        self.size += 1
    
    
    def append(self, element):
        """Insert new Node at the tail end of the Linked List."""
        self.insert(self.size, element)
    
    
    def prepend(self, element):
        """"Insert new Node at the start of the Linked List."""
        self.insert(0, element)
        