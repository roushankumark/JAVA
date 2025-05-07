/* 4. Write a program to print the multiplication table of a number N, 
   entered by the user. */

package Loops.PraciticeQuestions;

import java.util.Scanner;

public class TableOfNo {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number to print its multiplication table: ");
    int number = sc.nextInt();

    System.out.println("Multiplication table of" + number + ":");

    for (int i = 1; i <= 10; i++) {
        System.out.println(number + " X " + i + " = " + (number * i));
    }
    sc.close();
}
}
