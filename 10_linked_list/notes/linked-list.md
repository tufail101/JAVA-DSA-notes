## Linked List

A linked list is a linear data structure where each element is a separate object. Each element (node) contains a reference to the next node in the sequence. This allows for efficient insertion and deletion of elements at any position in the list.
Every node has two components: data and a pointer (or reference) to the next node. The last node in the list points to null, indicating the end of the list.

### Types of Linked Lists
1. **Singly Linked List**: Each node points to the next node and the last node points to null.
2. **Doubly Linked List**: Each node has two pointers, one pointing to the next node and another pointing to the previous node. This allows for traversal in both directions.
3. **Circular Linked List**: The last node points back to the first node, forming a circle. This can be implemented in both singly and doubly linked lists.

## Advantages of Linked Lists
- Dynamic size: The size of a linked list can grow or shrink as needed, unlike arrays which have a fixed size.
- Efficient insertions/deletions: Adding or removing elements does not require shifting elements, as in arrays. This makes linked lists more efficient for certain operations.
- Memory utilization: Linked lists can be more memory efficient than arrays, especially when the number of elements is unknown or changes frequently.
- Flexibility: Linked lists can be easily modified by adding or removing nodes without requiring the entire structure to be reallocated.
- No need for contiguous memory allocation: Linked lists do not require the entire structure to be stored in contiguous memory locations, unlike arrays.

## Disadvantages of Linked Lists
- Memory overhead: Each node in a linked list requires additional memory for storing the pointer/reference to the next node, which can lead to increased memory usage compared to arrays.
- Sequential access: Accessing elements in a linked list requires traversing the list from the head node, which can be slower than accessing elements in an array using an index.
- Cache locality: Linked lists may have poor cache performance compared to arrays, as the nodes may not be stored in contiguous memory locations, leading to more cache misses during traversal.
- Complexity: Implementing linked lists can be more complex than arrays, especially when dealing with edge cases such as inserting or deleting nodes at the beginning or end of the list.

### Operations on Linked Lists
1. **Insertion**: Adding a new node to the linked list at a specific position (beginning, end, or middle).
2. **Deletion**: Removing a node from the linked list at a specific position.
3. **Search**: Finding a specific node in the linked list.
4. **Traversal**: Visiting each node in the linked list in a sequential manner.

### Implementation of a Singly Linked List in Java
```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SinglyLinkedList {
    Node head;

    // Insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete a node by value
    public void delete(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Search for a node by value
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) return true;
            current = current.next;
        }
        return false;
    }

    // Traverse and print the linked list
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
```