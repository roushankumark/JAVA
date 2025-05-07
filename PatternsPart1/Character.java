package PatternsPart1;

public class Character {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';

        // Outer Loop
        for(int line=1; line<=n;  line++) {
            // Inner Loop
            for(int chars=1; chars<=line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
