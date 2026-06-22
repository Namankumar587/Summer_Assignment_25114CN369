//Write a program to Subtract matrices.

import java.util.Scanner;


public class prog74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrices: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] resultMatrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        
        System.out.println("Resultant matrix after subtraction: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
