package examples;

import javax.swing.*;

public class TernaryIfExampels {
    public static void main(String[] args) {
        String inAge = JOptionPane.showInputDialog("Please enter your age:");
        int age = Integer.parseInt(inAge);
        System.out.println("You are: " + ageChecker(age));

        String inN = JOptionPane.showInputDialog("Now, \n please enter a whole number: ");
        int n = Integer.parseInt(inN);
        System.out.println("You have entered number " + n + "\n" +
                "If the number is smaller than zero the result will be -1,\n" +
                "If it is equal to zero the result will be 0, \n" +
                "Otherwise returnedm 1: " +
                "\nYour result is: " + intervalChecker(n));

    }

    public static String ageChecker(int age) {
        return (age < 13) ? "Child" : (age > 12 && age <= 19) ? "Teenager" : "Adult";
    }

    public static int intervalChecker(int n){
        return (n<0) ? -1: (n==0) ? 0: 1;
    }
}
