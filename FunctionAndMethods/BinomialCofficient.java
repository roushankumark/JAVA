/*  package FunctionAndMethods;

public class BinomialCofficient {
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
    }
}      */


package FunctionAndMethods;

public class BinomialCofficient {
    public static int binCoeff(int n, int r) {
        // Handle cases where r > n
        if (r > n) {
            return 0;
        }

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    // Method to calculate factorial
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2)); // Output: 10
    }
}