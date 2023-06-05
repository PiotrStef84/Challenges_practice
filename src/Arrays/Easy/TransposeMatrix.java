package Arrays.Easy;

import java.util.Arrays;

public class TransposeMatrix {

    /* You're given 2D array of integers matrix. Write a function that returns the transpose of the matrix
    *
    * The transpose of a matrix is a flipped version of the original matrix across its main diagonal (which
    * runs from top-left to bottom-right); it switches the row and column indices of the original matrix.
    *
    * You can assume the input matrix always has at least 1 value; however its width and height are not necessarily
    *  the same.*/

    public static void main(String[] args) {
        int [][] input = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
        int [][] expected = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};

        int [][] result = transposeMatrix(input);

        // Checking the result matrix
        for(int i = 0; i < result.length; i++){
            for(int j =0; j <result[i].length; j++){
                System.out.println(result[i][j]);
            }
        }
    }

    private static int[][] transposeMatrix(int[][] input) {

        int [][] transposed = new int[input[0].length][input.length];

        for(int i= 0; i<input.length; i++){
            for(int j=0; j<input[i].length; j++){
                transposed[j][i] = input[i][j];
            }
        }

        return transposed;
    }
}
