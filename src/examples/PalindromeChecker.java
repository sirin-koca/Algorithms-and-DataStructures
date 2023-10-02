package examples;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char ch : word.toCharArray()) {
            stack.push(ch);
            queue.offer(ch);
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;  // Not a palindrome
            }
        }

        return true;  // It's a palindrome
    }

    public static void main(String[] args) {
        System.out.println("Checking the word TENET :"+ isPalindrome("TENET"));  // Should return true
        System.out.println("Checking the word HELLO :"+ isPalindrome("HELLO"));  // Should return false
    }
}

/*
The Algo:

Convert the input word to lowercase (to ignore capitalization differences).
Initialize an empty stack and an empty queue.
Loop through each character in the word:
Push the character onto the stack.
Enqueue the character into the queue.
As long as the stack isn't empty:
Pop a character from the stack.
Dequeue a character from the queue.
If the two characters aren't the same, then the word is not a palindrome.
If you successfully compare all the characters without finding differences, the word is a palindrome.

** Methods like toLowerCase(), toCharArray(), and many others are part of the Java Standard Library, specifically the String class.
 */