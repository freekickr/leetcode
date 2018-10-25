package Easy;

/*
Transpose Matrix

Given a matrix A, return the transpose of A.
The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.

Example 1:
Input: [[1,2,3],
        [4,5,6],
        [7,8,9]]

Output: [[1,4,7],
         [2,5,8],
         [3,6,9]]


Example 2:
Input: [[1,2,3],
        [4,5,6]]

Output: [[1,4],
         [2,5],
         [3,6]]

Note:
    1 <= A.length <= 1000
    1 <= A[0].length <= 1000
 */

public class TransposeMatrix {

    public static int[][] transpose(int[][] A) {
        int aRows = A.length;
        int aColumns = A[0].length;
        int[][] result = new int[aColumns][aRows];
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < aColumns; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] input = new int[][] {{1,2,3},{4,5,6}};
        for (int[] row : input) {
            for (int unit : row)
                System.out.print(unit + " ");
            System.out.println();
        }
        System.out.println();

        int[][] result = transpose(input);
        for (int[] row : result) {
            for (int unit : row)
                System.out.print(unit + " ");
            System.out.println();
        }
    }
}