//Write a program to Create quiz application.

import java.util.Scanner;


public class prog104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "What is the capital of France?",
            "What is 2 + 2?",
            "What is the largest ocean on Earth?"
        };
        
        String[][] options = {
            {"A. Berlin", "B. Madrid", "C. Paris", "D. Rome"},
            {"A. 3", "B. 4", "C. 5", "D. 6"},
            {"A. Atlantic Ocean", "B. Indian Ocean", "C. Arctic Ocean", "D. Pacific Ocean"}
        };
        
        char[] answers = {'C', 'B', 'D'};
        int score = 0;
        
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (A, B, C, D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);
            
            if (userAnswer == answers[i]) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect! The correct answer is: " + answers[i]);
            }
            System.out.println();
        }
        
        System.out.println("Your final score is: " + score + "/" + questions.length);
    }
    
}
