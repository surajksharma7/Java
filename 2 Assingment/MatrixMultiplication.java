import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        int[][] AB = new int[4][4];
        int[][] BA = new int[4][4];

        // Input for matrix A
        System.out.println("Enter elements of matrix A (4x4):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Input for matrix B
        System.out.println("Enter elements of matrix B (4x4):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // Calculate AB
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                AB[i][j] = 0;
                for (int k = 0; k < 4; k++) {
                    AB[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Calculate BA
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                BA[i][j] = 0;
                for (int k = 0; k < 4; k++) {
                    BA[i][j] += B[i][k] * A[k][j];
                }
            }
        }

        // Print AB
        System.out.println("Matrix AB:");
        printMatrix(AB);

        // Print BA
        System.out.println("Matrix BA:");
        printMatrix(BA);

        // Check if AB equals BA
        boolean isEqual = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (AB[i][j] != BA[i][j]) {
                    isEqual = false;
                    break;
                }
            }
        }
        System.out.println("AB equals BA: " + isEqual);
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
