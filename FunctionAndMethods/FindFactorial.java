package FunctionAndMethods;

public class FindFactorial {
    public static int factorial(int n) {
        int f = 1;

        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f; // Factorial of n
   }
   public static void main(String[] args) {
    System.out.println(factorial(4));
   }
}
