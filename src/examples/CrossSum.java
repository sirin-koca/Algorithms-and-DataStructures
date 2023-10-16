package examples;

import javax.swing.*;

public class CrossSum {
    public static void main(String[] args) {

        String inputN = JOptionPane.showInputDialog("Enter a whole number: ");
        int n = Integer.parseInt((inputN));

        System.out.println("The sum of the number " + n + " is: " + crossSum(n));
    }

    public static int crossSum(int n){
        int sum = (n<10)?n:crossSum(n/10) + (n%10);
        return sum;
    }

}
