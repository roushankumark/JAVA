package ConditionalStatements;

public class TernaryOperator {
    public static void main(String[] args) {
        int number = 4;

        // Ternary Operators
        String type = ((number%2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
