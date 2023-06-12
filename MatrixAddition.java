public class MatrixAddition {
    public static final int THREAD_COUNT = 4; // Number of threads to use
    public int[][] matrix1;
    public int[][] matrix2;
    public int[][] result;
    public int m;
    public int n;

    public MatrixAddition(int[][] matrix1, int[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.m = matrix1.length;
        this.n = matrix1[0].length;
        this.result = new int[m][n];
    }

    public void addMatrices() {
        Thread[] threads = new Thread[THREAD_COUNT];
        int chunkSize = m / THREAD_COUNT;

        // Create and start the threads
        for (int i = 0; i < THREAD_COUNT; i++) {
            int startRow = i * chunkSize;
            int endRow = (i == THREAD_COUNT - 1) ? m : startRow + chunkSize;
            threads[i] = new Thread(new MatrixAdder(startRow, endRow));
            threads[i].start();
        }

        // Wait for all threads to finish
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int[][] getResult() {
        return result;
    }

    public class MatrixAdder implements Runnable {
        public int startRow;
        public int endRow;

        public MatrixAdder(int startRow, int endRow) {
            this.startRow = startRow;
            this.endRow = endRow;
        }

        @Override
        public void run() {
            for (int i = startRow; i < endRow; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
    }
}
