/* package FunctionAndMethods;

public class PrimesInRange {
    public static void primeRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) { // True 
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeRange(16); 
    }
}
*/

package FunctionAndMethods;

public class PrimesInRange {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisors up to √num
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }

    // Method to print all prime numbers in range 2 to n
    public static void primeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // Check if the number is prime
                System.out.print(i + " "); // Print the prime number
            }
        }
        System.out.println(); // Print a new line at the end
    }

    public static void main(String[] args) {
        primeRange(16); // Call the method with range up to 16
    }
}
