//Write a program to Frequency of an element.

import java.util.Scanner;

public class prog54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element to find its frequency: ");
        int target = sc.nextInt();
        
        int frequency = 0;
        for (int num : arr) {
            if (num == target) {
                frequency++;
            }
        }
        
        System.out.println("Frequency of element " + target + " in the array: " + frequency);
    }
}
