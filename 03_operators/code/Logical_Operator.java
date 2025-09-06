public class Logical_Operator{
    public static void main(String[] args){
        int  a = 3;
        int b = 3;
        int c = 4;
        System.out.println(a == b && a < c); //true -> a == b is true and a < c is also true
        System.out.println(a == b || a > c); //true -> a == b is true But a > c is false 
        System.out.println(!(a == b || a > c)); //false -> true to false
    }
}