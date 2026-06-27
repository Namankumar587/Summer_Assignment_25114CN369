//Write a program to Create student record management system.

import java.util.Scanner;

public class prog105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        int[] ages = new int[n];
        String[] courses = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Course: ");
            courses[i] = sc.nextLine();
        }

        System.out.println("\nStudent Records:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Name: " + names[i] + ", Age: " + ages[i] + ", Course: " + courses[i]);
        }
    }
    
}
