package RecursionBasicsPart1;
public class firstOccurence {
    public static int IstOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }

        return IstOccurence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 3};
        System.out.println(IstOccurence(arr, 5,0));
    }
}
