// 4. Reverse Array
// Write a program to print the elements of an array in reverse order.

public class Q4{
    static int[] reverseArray(int arr[]){
        int []newArr = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        int newArr[] = reverseArray(arr);
        for (int elem : newArr) {
            System.out.println(elem);
        }
    }
}