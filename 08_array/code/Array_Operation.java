
import java.util.*;


public class Array_Operation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creation
        int [] marks = new int[5]; // Declaration with size

        String fruits[] = {"Apple", "Mango", "Banana"};  // Declaration with values

        //Input

        // marks[0] = 20;
        // marks[1] = 19;
        // marks[2] = 18;
        // marks[3] = 20;
        // marks[4] = 19;

        System.out.println("Enter marks...");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        //output

        System.out.println(marks[0]);

        System.out.println("Printing marks...");
        for (int i = 0; i < marks.length; i++) {
        System.out.println(marks[i]);
            
        }
        System.out.println("Printing Fruits Before Update...");
        for(int i = 0; i < fruits.length; i++) {
        System.out.println(fruits[i]);
            
        }

        //updating

        fruits[0] = "Grapes";
        System.out.println("Printing Fruits After Update...");

        for(int i = 0; i < fruits.length; i++) {
        System.out.println(fruits[i]);
            
        }


    }
}