package Backtracking;

public class FindPermutation {
    public static void FindPermutationCode(String str, String ans) {
        // Base Case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        // Recursion
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            //"abcde" => "ab" + "de"
            str = str.substring(0, i) + str.substring(i+1);
            FindPermutationCode(str, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        FindPermutationCode(str, " ");
    }
}
