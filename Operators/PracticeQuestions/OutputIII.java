package Operators.PracticeQuestions;

public class OutputIII {
        public static void main(String[] args) {
            int x, y, z;
            x = y = z = 2;
    
            x += y;      // x = x + y
            y -= z;      // y = y - z
    
            if (x + y != 0) {  // Check to avoid division by zero
                z /= (x + y);  // z = z / (x + y)
            } else {
                System.out.println("Division by zero error");
                return;
            }
    
            System.out.println(x + " " + y + " " + z);

    }
    
}

// Otput :- 4 0 0
