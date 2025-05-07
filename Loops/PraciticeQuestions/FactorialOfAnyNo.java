/* 3. Write a program to find the factorialof any number entered by the user. */

package Loops.PraciticeQuestions;

import java.util.Scanner;

public class FactorialOfAnyNo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a number to find its factorial:");
       int number = sc.nextInt();

       if (number < 0) {
        System.out.println("Factorial is not defined for negative numbers.");
       } else {
        long factorial = 1;

        for (int i = 1; i<= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " +number + " is: " + factorial);
       }
       sc.close();
    }
}
