//Write a program to Find duplicates in array.

import java.util.Scanner;

public class prog56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Duplicate elements in the array: ");
        boolean hasDuplicates = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    hasDuplicates = true;
                    break; 
                }
            }
        }
        
        if (!hasDuplicates) {
            System.out.println("No duplicate elements found in the array.");
        }
    }
}
