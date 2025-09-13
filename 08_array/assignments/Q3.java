// 3. Sum & Average
// Write a program to calculate the sum and average of all elements in an array.

public class Q3{
    static int sumOfArrayElem(int arr[]){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return res;
    }
    static int averageOfArrayElem(int arr[]){
        int avg = 0;
        int sum = 0;
        for (int elem : arr) {

            sum += elem;
            avg = sum / arr.length;
            // System.out.println(elem);
        }
        return avg;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30};
        int sumRes = sumOfArrayElem(arr);
        System.out.println(sumRes);
        int avgRes = averageOfArrayElem(arr);
        System.out.println(avgRes);
    }
}