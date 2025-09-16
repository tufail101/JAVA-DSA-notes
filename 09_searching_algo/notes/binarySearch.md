# Binary Search

Binary Search is an efficient searching algorithm that works on **sorted arrays or lists**.  
It repeatedly divides the search space into halves until the key element is found or the search space becomes empty.

---

## Algorithm Steps

1. Start with the entire array (low = 0, high = n-1).
2. Find the middle index: `mid = (low + high) / 2`.
3. If `arr[mid] == key`, return mid (element found).
4. If `arr[mid] < key`, search the **right half** (`low = mid + 1`).
5. If `arr[mid] > key`, search the **left half** (`high = mid - 1`).
6. Repeat until `low > high`. If not found, return -1.

---

## Time Complexity

- **Best Case:** O(1) → if the middle element is the key.
- **Worst Case:** O(log n) → keeps dividing until single element.
- **Average Case:** O(log n).

**Space Complexity:** O(1) for iterative, O(log n) for recursive.

---

## Java Implementation

### Iterative Approach

````java
public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;  // Key found
            else if (arr[mid] < key)
                low = mid + 1;  // Search right half
            else
                high = mid - 1; // Search left half
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        int result = binarySearch(arr, key);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
```
### Recursive Approach
 ```java
    public class Binary_Search{
        static int recursiveBinarySearch(int arr[],int key, int low , int high){
            if(low <= high){
                int mid = (low + high) / 2;
                if(arr[mid] == key){
                    return mid;
                }else if (arr[mid] < key){
                    return recursiveBinarySearch(arr, key, mid + 1, high);
                }else{
                    return recursiveBinarySearch(arr, key, low, mid - 1);
                }
            }
            return - 1;
        }
        public static void main(String args[]){

        }
    }
```
