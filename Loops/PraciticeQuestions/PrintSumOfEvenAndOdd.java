/* 2. Write a program that reads a set of integers, 
and then prints the sum of the even and odd integers */ 

package Loops.PraciticeQuestions;

import java.util.Scanner;

public class PrintSumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers (enter 0 to stop):");

        int evenSum = 0, oddSum = 0;
        int number;

        while (true) {
            number = sc.nextInt();

            // Exit the loop if the input is 0
            if (number == 0) {
                break;
            }

            // Check if the number is even or odd 
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        System.out.println("Sum of even number: " + evenSum);
        System.out.println("Sum of odd number: " + oddSum);

        sc.close();
    }
}
