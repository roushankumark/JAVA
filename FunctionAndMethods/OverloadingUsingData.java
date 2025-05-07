package FunctionAndMethods;

public class OverloadingUsingData {
    // Function to calculate integers Sum 
    public static int sum(int a, int b) {
        return a + b;
    }
    
    // Function to calculate Float Sum 
    public static float sum(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.4f, 4.8f));
    }
}
