import java.util.*;

public class bill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price of pencile");
        float priceOfPencile = sc.nextFloat();
        System.out.println("Enter price of pen");
        float priceOfPen = sc.nextFloat();
        System.out.println("Enter price of eraser");
        float priceOfEraser = sc.nextFloat();

        float totalPrice = priceOfPencile + priceOfPen + priceOfEraser;

        float totalPriceOfWithGst = totalPrice + ((totalPrice * 18) / 100);

        System.out.println(totalPriceOfWithGst);


    }
}