package DSA.ArraysAndStrings.IsSubSequence;

import DSA.util.Input.GetInput;

public class IsSubSequence {
    public static void main(String[] args) {
        String s = GetInput.getString();
        String t = GetInput.getString();

        System.out.println("Is Sub Sequence: " + IsValidSubSequence(s,t));
    }

    public static boolean IsValidSubSequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < t.length() && j < s.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
            i++;

            // if (j == s.length()) return true;
            // if (i == t.length()) return false;
        }

        return j == s.length() ? true : false;
    }
}
