public class Number_Piramid{
    public static void main(String[] args){
        int row = 4;
        for(int i = 0; i < row; i++){
            for(int j = 1; j <= i + 1; j++){
                System.out.print(" " + j + " ");
            }
            System.out.print("\n");
        }
    }
}