public class Binomial_Coefficient{
        static int fact(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    static int binomial_coefficient(int n , int r){
        //formula = nCr = n!/r! (n - r)!

        int res = 1;
        int factorial_Of_n = fact(n);
        int factorial_Of_r = fact(r);
        int factorial_Of_n_r = fact(n - r);
        res = (factorial_Of_n) /((factorial_Of_r) * (factorial_Of_n_r));
        return res;

        //fact(n) = fact(n * n-1) = 120
        //fact(r) = fact(r * r-1) = 2
        //fact(n-r) = fact(3) = fact(3 * 3-1) = 6
        //res = 120/2 * 6 = 120 / 12 = 10

    }
    public static void main(String[] args){
        int result = binomial_coefficient(5 ,2);
        System.out.println(result);
    
    }
    
}