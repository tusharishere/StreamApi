package Interview_Questions;

public class Bugs {
    public static void main(String[] args) {
        // Initial values for testing
        int a = 10;
        int b = 5;

        // Step into this method
        int sum = addNumbers(a, b);

        // Set a breakpoint here and evaluate the following:
        // 1. Check the value of 'sum'
        // 2. Evaluate 'sum + 10'
        // 3. Evaluate 'a * b'

        int product = multiplyNumbers(a, b);

        // Set another breakpoint here to evaluate:
        // 1. Check the value of 'product'
        // 2. Evaluate 'product / 2'
        // 3. Change 'a' to a new value like 20 and evaluate the expressions again

        int combinedResult = calculateComplex(a, b);

        // Step over and evaluate the final result
        System.out.println("Final combined result: " + combinedResult);
    }

    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method to multiply two numbers
    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    // Method to combine addition and multiplication
    public static int calculateComplex(int a, int b) {
        int sum = addNumbers(a, b);
        int product = multiplyNumbers(a, b);
        return sum + product;  // Step in here and evaluate 'sum', 'product', and 'sum + product'

    }
}
