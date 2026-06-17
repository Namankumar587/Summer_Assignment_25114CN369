//Write a program to Merge arrays.

import java.util.Scanner;

public class prog65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number of elements in the second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        int[] mergedArray = new int[n1 + n2];
        
        for (int i = 0; i < n1; i++) {
            mergedArray[i] = arr1[i];
        }
        
        for (int i = 0; i < n2; i++) {
            mergedArray[n1 + i] = arr2[i];
        }
        
        System.out.println("Merged array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
    
}
