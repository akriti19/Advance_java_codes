public class MatrixAdder implements Runnable {
    public int[][] matrix1;
    public int[][] matrix2;
    public int[][] result;
    public int startRow;
    public int endRow;

    public MatrixAdder(int[][] matrix1, int[][] matrix2, int[][] result, int startRow, int endRow) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.result = result;
        this.startRow = startRow;
        this.endRow = endRow;
    }

    @Override
    public void run() {
        int m = endRow - startRow;
        int n = matrix1[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i + startRow][j] = matrix1[i + startRow][j] + matrix2[i + startRow][j];
            }
        }
    }
}
