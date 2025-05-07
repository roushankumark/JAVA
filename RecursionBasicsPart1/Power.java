package RecursionBasicsPart1;
public class Power {
    public static int optimizedPower(int a, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n/2); // More Faster then :- Niche comment out kiya hua hai uske mukable
        int halfPowerSq = halfPower * halfPower;

        // int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);

        // n is odd
        if(n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(optimizedPower(a, n));
    }
}
