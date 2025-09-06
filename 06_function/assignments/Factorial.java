public class Factorial{
    static int fact(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    // if n = 5
    // fact = 5 * 4 * 3 * 2 * 1
    // n * n - 1
    public static void main(String[] args){
        int fact = fact(5);
        System.out.println(fact);
    }
}