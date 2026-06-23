//Write a program to Find diagonal sum.

import java.util.Scanner;

public class prog76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        if (rows != cols) {
            System.out.println("Diagonal sum can only be calculated for square matrices.");
            return;
        }
        
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int diagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            diagonalSum += matrix[i][i];
        }
        
        System.out.println("Sum of the diagonal elements: " + diagonalSum);
    }
    
}
