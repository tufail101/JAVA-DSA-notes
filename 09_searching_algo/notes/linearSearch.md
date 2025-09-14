# Linear Search

Linear Search is the simplest searching algorithm.  
It checks each element in the data structure one by one until the **key element** is found or the list ends.  

It can be used on both **sorted** and **unsorted** data structures, but it is less efficient compared to other searching algorithms like Binary Search.

---

## Algorithm Steps
1. Start from the first element.
2. Compare the key element with the current element.
3. If found, return the index.
4. If not, move to the next element.
5. If the end is reached, the key is not present.

---

## Time Complexity
- **Best Case:** O(1) → when the element is the first one.  
- **Worst Case:** O(n) → when the element is the last one or not present.  
- **Average Case:** O(n/2) → when the element is somewhere in the middle.  

---

## Java Implementation
```java
public class LinearSearch {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Found at index i
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        int result = linearSearch(arr, key);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
