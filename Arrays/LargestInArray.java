package Arrays;
// Largest Number in Array

public class LargestInArray {
    public static int getLatgest (int numbers[]) {
        int largest = Integer.MIN_VALUE; // - Infinity
        int smallest = Integer.MAX_VALUE; // + Infinity

        for(int i=0; i<numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number in the array is: " + smallest);
        return largest;
        
        }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("Largest number in the array is: " + getLatgest(numbers));
    }
    
}
