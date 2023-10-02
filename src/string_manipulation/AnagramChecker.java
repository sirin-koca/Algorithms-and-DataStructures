package string_manipulation;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean isAnagram(String a, String b) {
        // Remove spaces and convert to lowercase
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, not anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Convert to char array and sort
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        Arrays.sort(charsA);
        Arrays.sort(charsB);

        // Compare sorted strings
        return Arrays.equals(charsA, charsB);
    }

}
