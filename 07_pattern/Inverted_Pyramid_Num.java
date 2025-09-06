public  class Inverted_Pyramid_Num{

    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        for (int i = 0; i < row; i++) {
            for(int j = 1; j <= col - i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}