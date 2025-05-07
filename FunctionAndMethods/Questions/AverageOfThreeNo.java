// Write a Java method to compute the average of three numbers..

package FunctionAndMethods.Questions;

public class AverageOfThreeNo {
        public static void main(String[] args) {
            // Example usage
            double num1 = 12.5;
            double num2 = 15.3;
            double num3 = 10.2;
    
            double average = computeAverage(num1, num2, num3);
            System.out.println("The average is: " + average);
        }
    
        /**
         * Computes the average of three numbers.
         *
         * @param a the first number
         * @param b the second number
         * @param c the third number
         * @return the average of the three numbers
         */
        public static double computeAverage(double a, double b, double c) {
            return (a + b + c) / 3.0;
        }
    }
