
import java.util.Scanner;

//1. Array Creation & Input
//Write a program to take n integers as input from the user and store them in an array. Then print the array.

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lenght of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing Array Elements...");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}