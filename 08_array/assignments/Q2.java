//2. Find Maximum & Minimum
//Write a program to find the largest and smallest element in an array.

public class Q2{
    static int[] MaxMinElem(int arr[]){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min ) {
                min = arr[i];
            }
        }
        return new int[]{min,max};
        
    }
    //TODO: Find Second Largest Number
    public static void main(String[] args) {
        int arr[] = {12,20,30,11};
        int res[] = MaxMinElem(arr);
        System.err.println(res[0] );
        System.err.println(res[1] );

    }
}