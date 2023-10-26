package examples;

/**
 * Demonstrates the usage of Javadoc annotations.
 * This class has methods to perform basic arithmetic operations.
 * <p>
 * You can extend this example to include other operations or examples of annotations.
 * </p>
 * @author Sirin
 * @version 1.0
 *
 *
 * Common Javadoc annotations:
 *
 * @author: The author of the code.
 * @version: The version of the code.
 * @param: Description of a method parameter.
 * @return: Description of a method's return value.
 * @see: Links to another method or class.
 * @since: When the method/class/field was first introduced.
 * @throws / @exception: Documents an exception thrown by a method.
 */
public class JavadocDemo {

    /**
     * Global variable example.
     */
    private static int someValue = 10;

    /**
     * The main method to demonstrate Javadoc usage.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int sum = add(a, b);
        System.out.println("Sum: " + sum);

        int difference = subtract(a, b);
        System.out.println("Difference: " + difference);
    }

    /**
     * Adds two numbers.
     *
     * @param x First number.
     * @param y Second number.
     * @return The sum of x and y.
     */
    public static int add(int x, int y) {
        return x + y;
    }

    /**
     * Subtracts one number from another.
     *
     * @param x The minuend.
     * @param y The subtrahend.
     * @return The difference between x and y.
     */
    public static int subtract(int x, int y) {
        return x - y;
    }
}
