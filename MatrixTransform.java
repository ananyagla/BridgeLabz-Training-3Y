import java.util.Random;
import java.util.Scanner;

public class MatrixTransform {

    // Method to generate a random square matrix
    public static int[][] generateMatrix(int n) {
        Random rand = new Random();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    // Method to find transpose
    public static int[][] transpose(int[][] A) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }

    // Determinant of 2x2 matrix
    public static int determinant2x2(int[][] A) {
        return (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);
    }

    // Determinant of 3x3 matrix
    public static int determinant3x3(int[][] A) {
        return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
             - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
             + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] A) {
        double det = determinant2x2(A);
        if (det == 0) throw new ArithmeticException("Matrix is singular, no inverse.");

        double[][] inv = new double[2][2];
        inv[0][0] = A[1][1] / det;
        inv[0][1] = -A[0][1] / (double)det;
        inv[1][0] = -A[1][0] / (double)det;
        inv[1][1] = A[0][0] / det;
        return inv;
    }

    // Inverse of 3x3 matrix using adjoint method
    public static double[][] inverse3x3(int[][] A) {
        double det = determinant3x3(A);
        if (det == 0) throw new ArithmeticException("Matrix is singular, no inverse.");

        double[][] adj = new double[3][3];

        adj[0][0] =  (A[1][1] * A[2][2] - A[1][2] * A[2][1]);
        adj[0][1] = -(A[1][0] * A[2][2] - A[1][2] * A[2][0]);
        adj[0][2] =  (A[1][0] * A[2][1] - A[1][1] * A[2][0]);

        adj[1][0] = -(A[0][1] * A[2][2] - A[0][2] * A[2][1]);
        adj[1][1] =  (A[0][0] * A[2][2] - A[0][2] * A[2][0]);
        adj[1][2] = -(A[0][0] * A[2][1] - A[0][1] * A[2][0]);

        adj[2][0] =  (A[0][1] * A[1][2] - A[0][2] * A[1][1]);
        adj[2][1] = -(A[0][0] * A[1][2] - A[0][2] * A[1][0]);
        adj[2][2] =  (A[0][0] * A[1][1] - A[0][1] * A[1][0]);

        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inv[i][j] = adj[i][j] / det;
            }
        }
        return inv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();

        int[][] A = generateMatrix(n);
        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(A));

        if (n == 2) {
            System.out.println("Determinant = " + determinant2x2(A));
            try {
                System.out.println("Inverse:");
                displayMatrix(inverse2x2(A));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } else if (n == 3) {
            System.out.println("Determinant = " + determinant3x3(A));
            try {
                System.out.println("Inverse:");
                displayMatrix(inverse3x3(A));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}

