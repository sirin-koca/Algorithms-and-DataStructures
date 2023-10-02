package string_manipulation;

public class StringWithUniqueLetters {
    public static boolean isUnique(String a) {
        int n = a.length();

        for (int i = 0; i < n - 1; i++) { // Go until the second last character
            for (int j = i + 1; j < n; j++) { // Start from the next character
                if (a.charAt(i) == a.charAt(j)) {
                    return false;  // Found duplicate character
                }
            }
        }

        return true;  // No duplicate characters found
    }


    // Test the function
    public static void main(String[] args) {
        System.out.println(isUnique("algorithm"));  // Should print true
        System.out.println(isUnique("hello"));      // Should print false
    }

}
