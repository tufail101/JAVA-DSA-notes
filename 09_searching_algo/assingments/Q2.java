// 2.find samallest number in array

public class Q2 {

    static int minNum(int arr[]) {
        int minNum = Integer.MAX_VALUE; //infinty
        for (int i = 0; i < arr.length; i++) {
            if (minNum > arr[i]) {
                minNum = arr[i];
            }
        }
        return minNum;
    }

    public static void main(String[] args) {
        int arr[] = {20,4, 50,2,40,50};
        int minNum = minNum(arr);
        System.err.println(minNum);
    }
}
