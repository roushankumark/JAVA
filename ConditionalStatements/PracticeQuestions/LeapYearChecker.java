// WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthatyear is a leap year or not

package ConditionalStatements.PracticeQuestions;

    import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}


/*
Explanation:
 Leap Year Conditions:
  .  A year is a leap year if it is divisible by 4.
  .  However, if it is divisible by 100, it must also be divisible by 400 to be a leap year.
  .  if-else statement: Checks the above conditions and prints whether the year is a leap year or not.

Example Output:
Input: 2024
Output: 2024 is a leap year.

Input: 2023
Output: 2023 is not a leap year.
 */