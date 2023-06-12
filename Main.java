public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {{3, 7, 0}, {7, 0, 0}, {11, 2, 1}};
        int[][] matrix2 = {{2, 2, 0}, {6, 6, 6}, {5, 10, 12}};

        MatrixAddition matrixAddition = new MatrixAddition(matrix1, matrix2);
        matrixAddition.addMatrices();

        int[][] result = matrixAddition.getResult();

	  System.out.println("Matrix 1: ");
	  for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++)
			System.out.print(matrix1[i][j]+" ");
		System.out.println();
	  }

	  System.out.println("Matrix 2: ");
	  for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++)
			System.out.print(matrix2[i][j]+" ");
		System.out.println();
	  }
	  
        System.out.println("Result: ");
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
