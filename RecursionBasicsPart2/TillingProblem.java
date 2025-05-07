package RecursionBasicsPart2;

public class TillingProblem {

    public static int tellingProblems(int n) { // 2 x n (Floor size)
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Choose according to your choice how to arrange Vertical or Horizontal 

        // Vertical Choice
        int fnm1 = tellingProblems(n - 1);

        // Horizontal Choice
        int fnm2 = tellingProblems(n - 2);

        int totWays = fnm1 + fnm2;
        return totWays; // Return the computed number of ways
    }

    public static void main(String[] args) {
        System.out.println(tellingProblems(3)); // Example test case
    }
}

/*
Explanation of Changes
Added return totWays;:

The tellingProblems method needs to return the total number of ways to tile the floor. Therefore, after calculating totWays, you must return this value.
Fixed the Method Name:

Ensure the method name is consistent (tellingProblems in this case) and correct in all places.
Additional Details
Base Case:

The base cases handle the smallest possible values of n (0 and 1), where there's only one way to tile the floor.
Recursive Calls:

fnm1 calculates the number of ways to tile a floor of size n-1, considering adding a vertical tile.
fnm2 calculates the number of ways to tile a floor of size n-2, considering adding two horizontal tiles.
The total number of ways to tile a floor of size n is the sum of these two possibilities.
With these corrections, your code should compile and run correctly, providing the number of ways to tile a 2 x n floor. 

 */