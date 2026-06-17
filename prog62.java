//Write a program to Find maximum frequency element.

import java.util.Scanner;

public class prog62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxFrequency = 0;
        int maxElement = arr[0];
        
        for (int i = 0; i < n; i++) {
            int frequency = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    frequency++;
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxElement = arr[i];
            }
        }
        
        System.out.println("Element with maximum frequency: " + maxElement + " (Frequency: " + maxFrequency + ")");
    }
}