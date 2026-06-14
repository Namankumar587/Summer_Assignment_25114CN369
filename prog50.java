//Write a program to Find sum and average of array.

import java.util.Scanner;

public class prog50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        double average = (double) sum / n;
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + average);
    }
}
