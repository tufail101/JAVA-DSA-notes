// 5. Print all the pairs of an array elements

public class Q5{
    static void printPairs(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        printPairs(arr);
    }
}