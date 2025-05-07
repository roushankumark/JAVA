package RecursionBasicsPart1;
public class powerN {
      public static int power(int X, int n) {
        if(n == 0) {
            return 1;
        }
        // int Xnm1 = power(X, n-1);
        // int Xn = x * Xnm1;
        // return Xn;

        return X * power(X, n-1);
      }

      public static void main(String[] args) {

        System.out.println(power(2, 10));
    }
}