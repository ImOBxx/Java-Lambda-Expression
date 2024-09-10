
@FunctionalInterface
interface Factorial {
    long calculate(long n);
}

public class FactorialLambda {
    public static void main(String[] args) {
        // Define the factorial lambda expression
        Factorial factorial = (long n) -> {
            long result = 1;
            for (long i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        // Calculate the factorial of a number using the lambda expression
        long n = 7;
        long factorialResult = factorial.calculate(n);

        // Print the factorial result
        System.out.println("Factorial of " + n + " is: " + factorialResult);
    }
}
