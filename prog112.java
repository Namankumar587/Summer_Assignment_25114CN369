//Write a program to Create contact management system.

import java.util.Scanner;

public class prog112 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of contacts: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        String[] phoneNumbers = new String[n];
        String[] emails = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for contact " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            
            System.out.print("Phone Number: ");
            phoneNumbers[i] = sc.nextLine();
            
            System.out.print("Email: ");
            emails[i] = sc.nextLine();
        }

        System.out.println("\nContact Records:");
        for (int i = 0; i < n; i++) {
            System.out.println("Contact " + (i + 1) + ": Name: " + names[i] + ", Phone Number: " + phoneNumbers[i] + ", Email: " + emails[i]);
        }
    }
    
}
