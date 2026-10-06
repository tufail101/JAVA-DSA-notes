public class Q7{
    static int maxSumOfSubArray(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                    // System.out.println(currSum);
                    if (maxSum < currSum) {
                        maxSum = currSum;
                    }
                   
                }
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int maxSum = maxSumOfSubArray(arr);
        System.err.println(maxSum);
    }
}