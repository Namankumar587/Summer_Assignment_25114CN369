//Write a program to Linear search.

import java.util.Scanner;

public class prog53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element to search for: ");
        int target = sc.nextInt();
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println("Element " + target + " found at index: " + i);
                break;
            }
        }
        
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
