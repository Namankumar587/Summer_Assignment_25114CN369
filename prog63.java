//Write a program to Find pair with given sum.

import java.util.Scanner;

public class prog63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target sum: ");
        int targetSum = sc.nextInt();
        
        boolean foundPair = false;
        System.out.println("Pairs with the given sum " + targetSum + ":");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    foundPair = true;
                }
            }
        }
        
        if (!foundPair) {
            System.out.println("No pairs found with the given sum.");
        }
    }
    
}
