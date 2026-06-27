//Write a program to Create marksheet generation system.

import java.util.Scanner;

public class prog108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            
            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine(); 
        }

        System.out.println("\nMarksheet:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Name: " + names[i] + ", Marks: " + marks[i]);
        }
    }

    
}
