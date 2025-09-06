
import java.util.Scanner;

public class Binary_To_Decimal{
    public static int binary_To_decimal(int binVal){
        // int result = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     int temp = str.charAt(i) - '0';

        //     result = result * 2 + temp;
        // }
        int pow = 0;
        int result = 0;
        while (binVal > 0) { 
            int lstDigit = binVal % 10;
            result = result + (lstDigit * (int)Math.pow(2, pow));
            pow++;
            binVal = binVal / 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Value :");
        int userIn = sc.nextInt();
        int decimalVal = binary_To_decimal(userIn);
        System.out.println(decimalVal);

        // sc.close();
    }
}