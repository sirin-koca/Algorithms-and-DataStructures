package string_manipulation;

import javax.swing.*;

/*
Strings in Java are sequences of characters, and we can think of them similarly to arrays.
The charAt() method allows us to access individual characters, just like accessing elements in an array.

In most programming languages, array indices start at 0. So, if the array (or string) has n elements,
the last element's index is n-1.

 */
public class ReverseString{
    public static String reverseString(String a) {
        int n = a.length();  // Strings in Java can be thought as an array
        String reversed = ""; // Initialize an empty string to store the reversed characters

        for (int i = n - 1; i >= 0; i--) { // Start from the end of the string
            reversed += a.charAt(i); // Use charAt() to get the character at the given index
        }

        return reversed; // Return the reversed string
    }

    // Test the function
    public static void main(String[] args) {
        String getFromUser = JOptionPane.showInputDialog("Write a word: ");
        System.out.println(reverseString(getFromUser));  // Should print "olleh"
    }
}
