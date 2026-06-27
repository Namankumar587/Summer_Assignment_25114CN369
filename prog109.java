//Write a program to Create library management system.

import java.util.Scanner;

public class prog109 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] titles = new String[n];
        String[] authors = new String[n];
        int[] years = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Title: ");
            titles[i] = sc.nextLine();
            
            System.out.print("Author: ");
            authors[i] = sc.nextLine();
            
            System.out.print("Year of Publication: ");
            years[i] = sc.nextInt();
            sc.nextLine(); 
        }

        System.out.println("\nLibrary Records:");
        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1) + ": Title: " + titles[i] + ", Author: " + authors[i] + ", Year: " + years[i]);
        }
    }
    
}
