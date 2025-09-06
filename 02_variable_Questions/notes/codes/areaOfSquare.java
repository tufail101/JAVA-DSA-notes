import java.util.*;

public class areaOfSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side of square");
        float side = sc.nextFloat();

        float area = side * side;
        System.out.println("Area fo square is = ");
        System.out.print(area);
    }
}