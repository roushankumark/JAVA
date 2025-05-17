package Arrays;

public class Subarrays {
    public static void printsubarrays(int[] numbers) {
        int ts = 0; // Total subarrays

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) { // print
                    System.out.print(numbers[k] + " "); // Subarray
                }
                ts++;
                System.out.println();
            }
            System.err.println();
        }
        System.err.println("Total subarrays: " + ts);
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        printsubarrays(numbers);
    }
}
