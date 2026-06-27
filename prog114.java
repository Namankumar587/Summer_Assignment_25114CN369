//Write a program to Create menu-driven array operations system.

import java.util.Scanner;

public class prog114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display Array");
            System.out.println("2. Find Maximum Element");
            System.out.println("3. Find Minimum Element");
            System.out.println("4. Calculate Sum of Elements");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Array Elements:");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    int max = arr[0];
                    for (int num : arr) {
                        if (num > max) {
                            max = num;
                        }
                    }
                    System.out.println("Maximum Element: " + max);
                    break;
                case 3:
                    int min = arr[0];
                    for (int num : arr) {
                        if (num < min) {
                            min = num;
                        }
                    }
                    System.out.println("Minimum Element: " + min);
                    break;
                case 4:
                    int sum = 0;
                    for (int num : arr) {
                        sum += num;
                    }
                    System.out.println("Sum of Elements: " + sum);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

}
