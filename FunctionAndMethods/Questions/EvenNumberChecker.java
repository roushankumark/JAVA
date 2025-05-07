/*  Write a method named is Even that accepts an int argument. 
The method should return true if the argument is even, or false otherwise. 
Also write a program to test your method */

package FunctionAndMethods.Questions;

import java.util.Scanner;

public class EvenNumberChecker {
    public static void main(String[] args) {
        
        int n;
        System.out.print("Enter any Number = ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if (n % 2 == 0) {
            System.out.print("Even Numer = TRUE");
        }
        else{
            System.out.print("Odd Number = FALSE");
        }
    }
}
