package Arrays;

public class BinarySearch {
    public static int BinarySearches(int number[], int key) {
        int start = 0, end = number.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            // Comparing the middle element with the key
            if (number[mid] == key) {
                return mid;
            } else if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; 
     }

     public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        
        
            System.out.println("index for key is : " + BinarySearches(number, key));
        }
     }
    

