package FunctionAndMethods;

public class FunctionOverloading {
    // Function to calculate sum of f2 numbers
    public static int sum(int a, int b){
        return a + b;
    }
    // Fumction to calculate sum of 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println((sum(5, 2, 1)));
    }
}
