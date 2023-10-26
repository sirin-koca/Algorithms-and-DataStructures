package mix_oppgaver;

import java.util.function.Consumer;
import java.util.function.BiFunction;

public class LambdaExamples {
    public static void main(String[] args) {
        // Example 1: No Parameters
        Runnable run = () -> System.out.println("Hello, World!");
        new Thread(run).start();

        // Example 2: One Parameter
        Consumer<String> greet = name -> System.out.println("Hello, " + name);
        greet.accept("Maya");  // Output: "Hello, Maya"

        // Example 3: Multiple Parameters
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        int sum = add.apply(5, 3);  // Output will be 8
        System.out.println("Sum is: " + sum);
    }
}
