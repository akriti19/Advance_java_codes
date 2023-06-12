package assignment_1;

public class Test {
    public static void main(String[] args) {
        int[][] matrix1 = {{3, 7, 0}, {7, 0, 0}, {11, 2, 1}};
        int[][] matrix2 = {{2, 2, 0}, {6, 6, 6}, {5, 10, 12}};

        MatrixAddition matrixAddition = new MatrixAddition(matrix1, matrix2);
        matrixAddition.addMatrices();

        int[][] result = matrixAddition.getResult();

        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
