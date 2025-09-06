import java.util.*;

public class If_Else{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number")
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

        sc.close();
    }
}