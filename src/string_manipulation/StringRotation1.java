package string_manipulation;

public class StringRotation1 {
    public static boolean isRotation(String a, String b) {
        int n = a.length();
        int m = b.length();

        if (n != m) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            boolean foundMatch = true;
            for (int j = 0; j < n; j++) {
                if (a.charAt((i + j) % n) != b.charAt(j)) {
                    foundMatch = false;
                    break;
                }
            }

            if (foundMatch) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));  // Should print true
        System.out.println(isRotation("hello", "ohell"));  // Should print true
        System.out.println(isRotation("hello", "ohelle"));  // Should print false
    }


}
