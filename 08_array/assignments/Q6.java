//6. Print SUbarray of an Array
//  Subarray is a countinous part of an array.
//like: {10,20,30,40}
//{10}
//{10,20}
//{10,20,30}
//{10,20,30,40}
//also for all elements
public class Q6{
    static void printSubArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr [] = {10,20,30,40};
        printSubArray(arr);
    }
}