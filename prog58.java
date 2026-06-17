//Write a program to Rotate array left.

import java.util.Scanner;

public class prog58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number of positions to rotate left: ");
        int d = sc.nextInt();
        
        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArr[i] = arr[(i + d) % n];
        }
        
        System.out.println("Array after left rotation: ");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
    
}
