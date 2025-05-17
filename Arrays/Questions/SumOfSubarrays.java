package Arrays.Questions;
// 👉 Aapko sabhi subarrays ka sum calculate karna hai
// 👉 Phir unme se maximum sum aur minimum sum print karna hai
public class SumOfSubarrays {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;  // sabse chhoti shuruaat value
        int minSum = Integer.MAX_VALUE;  // sabse badi shuruaat value

        // sabhi subarrays ke liye loop
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];  // subarray ka sum
                System.out.println("Subarray sum from index " + i + " to " + j + " is: " + currentSum);

                // max aur min update karo
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                if (currentSum < minSum) {
                    minSum = currentSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.println("Minimum Subarray Sum: " + minSum);
    }
}

