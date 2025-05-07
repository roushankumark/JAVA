/* Question1:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N) */

package VariablesAndDataTypes.PracticeQuestions;

import java.util.Scanner;

public class AverageOfThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a + b + c) / 3;
        System.out.println("average is : " + average);
    }
}
