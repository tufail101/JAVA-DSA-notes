
//1. find largest number in given array.
public class Q1{
    static int maxNum(int arr[]){
        int maxNum = Integer.MIN_VALUE; //-infinity
        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
    public static void main(String args[]){
        int arr[] ={1,4,5,6,2};
        int maxNum = maxNum(arr);
        System.err.println(maxNum);
    }
}