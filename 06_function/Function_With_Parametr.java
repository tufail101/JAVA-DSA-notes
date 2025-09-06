public class Function_With_Parametr{
    public static void swap(int a, int b){
        int temp;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b);
     }
     //Function overloading
     public static void greet(String name){
        System.out.println("Hello " + name);
     }
     public  static void greet(int age){
        if(age > 30){

        System.out.println("Hello Dada ji");
        }else{
            System.err.println("Hello Sir");
        }
     }
    public static void main(String[] args){
        int a = 4;
        int b = 5;
        swap(a,b);
        greet("Tufail");
        greet(35);
    }
}