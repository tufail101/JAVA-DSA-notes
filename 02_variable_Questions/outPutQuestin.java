public class outPutQuestin{
    public static void main(String[] args){
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f * b) + (i % c) - (d * s);
        

        //output = float   12.56 +  int 1097 + double 51197.6448 = 55608.6304 double
        System.out.println(result);
        
        int $ = 10;
    }
}