//Write a program to Rotate array right.

import java.util.Scanner;

public class prog59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number of positions to rotate right: ");
        int d = sc.nextInt();
        
        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArr[(i + d) % n] = arr[i];
        }
        
        System.out.println("Array after right rotation: ");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
    
}
