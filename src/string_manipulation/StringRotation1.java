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
