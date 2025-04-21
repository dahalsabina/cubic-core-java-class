public class MatrixAddition {
    public static void main(String[] args) {
        // First matrix
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Second matrix
        int[][] B = {
                {4, 5, 6},
                {2, 7, 8},
                {3, 1, 9}
        };

        // Result matrix
        int[][] result = new int[3][3];

        // Perform matrix addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        // Display the result
        System.out.println("Result of Matrix Addition:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

