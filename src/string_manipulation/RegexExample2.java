package string_manipulation;

import java.util.regex.*;

public class RegexExample2 {
    public static boolean isValidEmail(String email) {
        String pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return email.matches(pattern);
    }

    public static void main(String[] args) {
        System.out.println(isValidEmail("test@email.com"));  // Should return true
        System.out.println(isValidEmail("invalid-email"));   // Should return false
    }
}
