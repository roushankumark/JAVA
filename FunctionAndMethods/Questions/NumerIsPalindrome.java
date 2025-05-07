/*  Write a Java program tocheckif a number is a palindrome in Java? ( 121 is a
 palindrome, 321 is not) */

/* Eg:- Anumberis called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
 palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
 palindrome because the reverse of 321 is 123, which is not equal to 321.  */

package FunctionAndMethods.Questions;
import java.util.Scanner;
public class NumerIsPalindrome {
    
// CHAT GPT ANSWER

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    /**
     * Checks if a number is a palindrome.
     *
     * @param number the number to check
     * @return true if the number is a palindrome, false otherwise
     */
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;           // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10;                      // Remove the last digit
        }

        // Check if the original number is equal to the reversed number
        return originalNumber == reversedNumber;
    }
}
