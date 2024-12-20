package JAVAPROGRAMMING;
import java.util.Scanner;

public class MatrixMultiplication {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int cols1 = sc.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Taking input for the second matrix
        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int cols2 = sc.nextInt();

        // Check if matrix multiplication is possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Number of columns of the first matrix must be equal to the number of rows of the second matrix.");
            return;
        }

        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Resultant matrix
        int[][] result = new int[rows1][cols2];

        // Matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Printing the result
        System.out.println("The resultant matrix is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
