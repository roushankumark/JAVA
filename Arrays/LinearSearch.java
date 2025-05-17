package Arrays;

public class LinearSearch {
    public static int linearSearches(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the target element is not found
    }


    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // String numbers[] = {"apple", "banana", "cherry", "date"};
        int key = 20;

        int index = linearSearches (numbers, key);
        if (index == -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

}
