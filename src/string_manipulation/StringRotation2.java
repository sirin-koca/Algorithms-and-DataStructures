package string_manipulation;

public class StringRotation2 {
    public static boolean isRotation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        String concatenated = a + a;

        return isSubstring(concatenated, b);
    }

    public static boolean isSubstring(String mainStr, String subStr) {
        int mainLen = mainStr.length();
        int subLen = subStr.length();

        for (int i = 0; i <= mainLen - subLen; i++) {
            int j;
            for (j = 0; j < subLen; j++) {
                if (mainStr.charAt(i + j) != subStr.charAt(j)) {
                    break;
                }
            }
            if (j == subLen) {
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
