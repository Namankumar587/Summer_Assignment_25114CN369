//Write a program to Create menu-driven string operations system

import java.util.Scanner;

public class prog115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display Strings");
            System.out.println("2. Find Longest String");
            System.out.println("3. Find Shortest String");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Strings:");
                    for (String str : strings) {
                        System.out.println(str);
                    }
                    break;
                case 2:
                    String longest = strings[0];
                    for (String str : strings) {
                        if (str.length() > longest.length()) {
                            longest = str;
                        }
                    }
                    System.out.println("Longest String: " + longest);
                    break;
                case 3:
                    String shortest = strings[0];
                    for (String str : strings) {
                        if (str.length() < shortest.length()) {
                            shortest = str;
                        }
                    }
                    System.out.println("Shortest String: " + shortest);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    
}
