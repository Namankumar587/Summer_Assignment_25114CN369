//Write a program to Create salary management system.

import java.util.Scanner;

public class prog107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        double[] salaries = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            
            System.out.print("Salary: ");
            salaries[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        System.out.println("\nEmployee Salary Records:");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ": Name: " + names[i] + ", Salary: $" + salaries[i]);
        }
    }
    
}
