package RecursionMedium;

import java.util.HashSet;

public class UniqueSubsequence {
    public static void subsequence(String str, int idx, String NewString, HashSet<String> set) {
        // Base case
        if (idx == str.length()) {
            if (set.contains(NewString)) {
                return;
            } else {
                System.out.println(NewString);
                set.add(NewString);
                return;
            }
        }
        char currentChar = str.charAt(idx);
        // to be
        subsequence(str, idx + 1, NewString + currentChar, set);
        // not to be
        subsequence(str, idx + 1, NewString, set);
    }

    public static void main(String args[]) {
        String str = "aaa";
        // To print unique Subsequence we will create a HashSet
        HashSet<String> set = new HashSet<>();
        subsequence(str, 0, " ", set);
    }

}
