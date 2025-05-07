package VariablesAndDataTypes.PracticeQuestions;

import java.util.Scanner;

public class AreaOfSqare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int AreaSqare = a * b ;
        System.out.println("Area of Square: " + AreaSqare );
    }
}
