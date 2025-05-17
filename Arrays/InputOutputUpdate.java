import java.util.*;

class InputOutputUpdate {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); //Physics
        marks[1] = sc.nextInt(); //Chemistry
        marks[2] = sc.nextInt(); //Maths
        marks[3] = sc.nextInt(); //Biology

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);
        System.out.println("Biology: " + marks[3]);
    }
}
