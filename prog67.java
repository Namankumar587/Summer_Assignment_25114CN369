//Write a program to Intersection of arrays.

import java.util.Scanner;


public class prog67 {
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
        
        System.out.println("Intersection of arrays: ");
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    System.out.print(num1 + " ");
                    break;
                }
            }
        }
    }
    
}
