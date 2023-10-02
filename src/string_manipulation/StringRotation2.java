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


/*
If a string b is a rotation of string "a" then it can be broken into two parts: x and y, such that "a" can be expressed
as xy and b can be expressed as yx.

For instance, with a = "waterbottle" and b = "erbottlewat", we have:
x = "wat" and y = "erbottle". Thus, a = xy = "waterbottle" and b = yx = "erbottlewat".

If we concatenate a with itself, the result is a + a = xyxy.

Continuing with the example: a + a = "waterbottlewaterbottle"

If b is indeed a rotation of "a", then b (or yx) will always be a substring of a + a (or xyxy).

In our example, "erbottlewat" is a substring of "waterbottlewaterbottle".

By concatenating the string with itself, we effectively create all possible rotations of the original string,
lined up one after another. So, if b is any rotation of "a", it will appear in a + a.

This technique allows us to solve the rotation problem by transforming it into a substring problem.

 */
