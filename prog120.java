//Write a program to Develop complete mini project using arrays, strings and functions.

import java.util.Scanner;

public class prog120 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of records: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        int[] ages = new int[n];
        String[] details = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for record " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Details: ");
            details[i] = sc.nextLine();
        }

        System.out.println("\nRecords:");
        for (int i = 0; i < n; i++) {
            System.out.println("Record " + (i + 1) + ": Name: " + names[i] + ", Age: " + ages[i] + ", Details: " + details[i]);
        }
    }
    
}
