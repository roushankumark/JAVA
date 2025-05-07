// What will be the value of x & y in the following program


package ConditionalStatements.PracticeQuestions;

public class ValueofXY {
    public static void main(String args[]) {
        int a = 63, b = 36;
        boolean x = ( a < b ) ? true : false;
        int y = ( a > b ) ? a : b;
    }
}

/* 
Explanation:
1.  x = (a < b) ? true : false;

    a is 63 and b is 36.
    The condition (a < b) is false because 63 is not less than 36.
    Since the condition is false, the value of x will be false.
   
2.   y = (a > b) ? a : b;

    The condition (a > b) is true because 63 is greater than 36.
    Since the condition is true, the value of y will be a, which is 63.

Final Values:
x = false
y = 63

So, the values of x and y are:
x = false
y = 63 */
