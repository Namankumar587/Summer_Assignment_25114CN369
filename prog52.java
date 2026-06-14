//Write a program to Count even and odd elements.

import java.util.Scanner;

public class prog52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int evenCount = 0;
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Number of even elements in the array: " + evenCount);
        System.out.println("Number of odd elements in the array: " + oddCount);
    }
}
