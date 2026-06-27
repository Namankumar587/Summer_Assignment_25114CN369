//Write a program to Create ticket booking system.

import java.util.Scanner;

public class prog111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tickets to book: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        String[] events = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for ticket " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            
            System.out.print("Event: ");
            events[i] = sc.nextLine();
        }

        System.out.println("\nTicket Booking Records:");
        for (int i = 0; i < n; i++) {
            System.out.println("Ticket " + (i + 1) + ": Name: " + names[i] + ", Event: " + events[i]);
        }
    }
    
}
