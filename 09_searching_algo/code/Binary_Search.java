public class Binary_Search{
    //TODO: Explore Recursive Binary Search
    static int binarySearch(int arr[], int key){
        int low = 0, high = arr.length - 1;
        while (low <= high) { 
        int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if(arr[mid] < key){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int key = 40;
        // int low = 0, high = arr.length - 1;
        // int res = recursiveBinarySearch(arr, key, low, high);
        int res = binarySearch(arr, key);
        if (res == -1) {
            System.out.println("Element is not exits in given array");
        }else{
            System.out.println("Element is at index: " + res);
        }
    }
}