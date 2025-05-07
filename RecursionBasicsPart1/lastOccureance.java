package RecursionBasicsPart1;
public class lastOccureance {
        public static int LstOccurence(int arr[], int key, int i) {
            if(i == arr.length) {
                return -1;
            }
            if(arr[i] == key) {
                return i;
            }
    
            return LstOccurence(arr, key, i+1);
        }
    
        public static void main(String[] args) {
            int arr[] = {8, 3, 6, 9, 5, 10, 2, 3};
            System.out.println(LstOccurence(arr, 5,0));
        }
    }
