import java.util.*;

public class Else_if{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your makrs");
        int marks = sc.nextInt();
        if(marks >= 80){
            System.out.println("A");
        }
        else if(marks > 70 && marks < 80){
            System.out.println("B");
            
        }
        else if(marks > 60 && marks < 70){
            System.out.println("C");
            
        }
        // we can add more
        else{
            System.out.println("You are failed");

        }
        sc.close();
    }
}