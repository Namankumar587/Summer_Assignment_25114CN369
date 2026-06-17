//Write a program to Union of arrays.

import java.util.Scanner;

public class prog66 {
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
        
        int[] unionArray = new int[n1 + n2];
        int index = 0;
        
        for (int num : arr1) {
            if (!contains(unionArray, num, index)) {
                unionArray[index++] = num;
            }
        }
        
        for (int num : arr2) {
            if (!contains(unionArray, num, index)) {
                unionArray[index++] = num;
            }
        }
        
        System.out.println("Union of arrays: ");
        for (int i = 0; i < index; i++) {
            System.out.print(unionArray[i] + " ");
        }
    }
    
    private static boolean contains(int[] arr, int num, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
    
}
