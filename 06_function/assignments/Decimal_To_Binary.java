import java.util.*;

public class Decimal_To_Binary{
    static String decimalToBinary(int n){
        String res = "";
        while(n > 0){
            int rem = n % 2;
            n /= 2;
            res = rem + res;
            // System.out.println(res);
        }
        return res;

    }
    public static void main(String[] args){
        
        String result = decimalToBinary(25);
        System.out.println(result);
    }
}