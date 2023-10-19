package examples;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        int n = 100;  // Find primes up to this number

        for(int i = 2; i <= n; i++) {  // Loop from 2 to n : OUTER LOOP
            boolean isPrime = true;  // Assume i is prime

            for(int j = 2; j * j <= i; j++) {  // Loop up to the square root of i : INNER LOOP
                if(i % j == 0) {  // If i is divisible by j
                    isPrime = false;  // i is not prime
                    break;  // Exit the inner loop
                }
            }

            if(isPrime) {  // If i is prime
                System.out.print(i + ", ");  // Print it
            }
        }
    }
}
