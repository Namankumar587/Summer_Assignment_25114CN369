//Write a program to Binary search.

import java.util.Scanner;

public class prog71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();
        
        int l = 0;
        int h = n - 1;
        boolean found = false;
        
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        
        if (!found) {
            System.out.println("Element not found");
        }
    }
    
}
