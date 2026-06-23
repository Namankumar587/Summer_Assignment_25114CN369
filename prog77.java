//Write a program to Multiply matrices.

import java.util.Scanner;

public class prog77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the first matrix: ");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();
        
        System.out.println("Enter the number of rows and columns of the second matrix: ");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();
        
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return;
        }
        
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] resultMatrix = new int[rowsA][colsB];
        
        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        System.out.println("Resultant matrix after multiplication: ");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
