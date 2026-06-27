//Write a program to Create employee management system.

import java.util.Scanner;

public class prog106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        int[] ages = new int[n];
        String[] departments = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Department: ");
            departments[i] = sc.nextLine();
        }

        System.out.println("\nEmployee Records:");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ": Name: " + names[i] + ", Age: " + ages[i] + ", Department: " + departments[i]);
        }
    }
    
}
