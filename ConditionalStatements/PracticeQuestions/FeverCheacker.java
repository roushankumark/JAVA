//Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

package ConditionalStatements.PracticeQuestions;

import java.util.Scanner;

public class FeverCheacker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = 103.5;

        // Get input from the user
        System.out.print("Enter a Temperature: ");
        double number = scanner.nextDouble();
    
        // Check if the number is positive, negative, or zero
        if (number > 100) {
        System.out.println("You have a Fever.");

        } else {
        System.out.println("You dont't have a Fever.");
    }
       scanner.close();
    }
}
