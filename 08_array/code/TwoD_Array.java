
public class TwoD_Array {

    public static void main(String[] args) {

        //declaration
        // int [][] matrix = new int[2][2];
        //initialization
        int matrix[][] = {
            {1, 2},
            {3, 4}
        };

        //accessing 2D Array Elements
        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][1]);

        //Traversing 2D Array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
        }
    }
}

