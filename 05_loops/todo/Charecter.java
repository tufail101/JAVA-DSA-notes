public class Charecter{
    public static void main(String [] args){
        int row = 4;
        int n = 65;

        for(int i = 0; i < row; i++){
            for(int j = 1; j <= i + 1; j++){
                char ch = (char)n;
                System.out.print(ch);
                n++;
            }
            System.out.print("\n");
        }

    }
}