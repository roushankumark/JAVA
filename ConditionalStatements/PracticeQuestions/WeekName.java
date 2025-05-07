// Write a Java program to input week number(1-7) and print day of week name using switch case.

package ConditionalStatements.PracticeQuestions;

import java.util.Scanner;

public class WeekName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a week number
        System.out.println("Enter Week Number (1-7) : ");
        int weekNumber = sc.nextInt();

        // Use switch case to determine the day of the week
        switch (weekNumber) {
            case 1: System.out.println("Sunday");  
                break;
            case 2: System.out.println("Monday");  
                break;
            case 3: System.out.println("Tuesday");  
                break;
            case 4: System.out.println("Wednesday");  
                break;
            case 5: System.out.println("Thrusday");  
                break;
            case 6: System.out.println("Fiday");  
                break;
            case 7: System.out.println("Saturday");  
                break;
            default : System.out.println("Invalid week number. Please enter a number between 1 and 7.");
                break;
        }
        sc.close();
    }
}
