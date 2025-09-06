public class Arithmatic{
    public static void main(String[] args){
        int a = 5;
        int b = 2;
    System.out.println("Binary Operator");
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int rem = a % b;
        System.out.println("sum :" + (sum));
        System.out.println("sub :" + (sub));
        System.out.println("mul :" + (mul));
        System.out.println("div :" + (div));
        System.out.println("rem :" + (rem));

        System.out.println("Unary Operator");
        //post
        a++;
        b--;
        int sumAfterIncAndDic = a + b;
        System.out.println("sumAfterIncAndDic :" + (sumAfterIncAndDic));
        //Use and after increment and dicriment 
        System.out.println("inc :" + (a));
        System.out.println("dic :" + (b));
        //pre

        --a;
        ++b;
        //first incrememt/dicrement and than use

        System.out.println(a);
        System.out.println(b);

    }
}