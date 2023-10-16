package examples;

import javax.swing.*;

public class TernaryIfExampels {
    public static void main(String[] args) {
        // Program1: AgeChecker:
        String inAge = JOptionPane.showInputDialog("Please enter your age:");
        int age = Integer.parseInt(inAge);
        System.out.println("# Program1: You are: " + ageChecker(age));
        System.out.println("-----------------------------------------");

        // Program2: IntervalChecker:
        String inN = JOptionPane.showInputDialog("Now, \nPlease enter a whole number: ");
        int n = Integer.parseInt(inN);
        System.out.println("Program2: Your result is: " + intervalChecker(n));
        System.out.println("Explanation:");
        System.out.println("You have entered number " + n + "\n" +
                "If the number is smaller than zero the result will be -1,\n" +
                "If it is equal to zero the result will be 0, \n" +
                "Otherwise returnedm 1: ");
        System.out.println("-----------------------------------------");

        // Program3: IntegerCompare:
        String inX = JOptionPane.showInputDialog("Enter a whole number: ");
        int x = Integer.parseInt(inX);
        String inY = JOptionPane.showInputDialog("Enter another whole number: ");
        int y = Integer.parseInt(inY);
        System.out.println("# Program3: Your result is " + compareMyNums(x, y));
        System.out.println("Explanation:");
        System.out.println("Your numbers were " + x + " and " + y + ": ");
        System.out.println("It returns -1 if x is less than y.\n" +
                            "It returns 0 if x is equal to y.\n" +
                            "It returns 1 if x is greater than y.");

    }

    public static String ageChecker(int age) {
        return (age < 13) ? "Child" : (age > 12 && age <= 19) ? "Teenager" : "Adult";
    }

    public static int intervalChecker(int n){
        return (n<0) ? -1: (n==0) ? 0: 1;  //   return Integer.compare(n, 0);
    }

    public static int compareMyNums(int x, int y){
        return Integer.compare(x, y);
    }
}
