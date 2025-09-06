public class Is_Prime{
    public static Boolean isPrime(int num){
        // Boolean res = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primeNums(int range){
        for (int i = 0; i <= range; i++) {
            if(i < 2) continue;
            if(isPrime(i)){
                
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Boolean result = isPrime(12);
        System.out.println(result);
        primeNums(1);
    }
}