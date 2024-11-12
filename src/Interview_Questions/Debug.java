package Interview_Questions;

public class Debug {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};

        // Intentional bug: trying to access index out of bounds
//        for (int i = 0; i <= numbers.length; i++) {
//            System.out.println("Number: " + numbers[i]);
//        }

//        // Another bug: potential division by zero
//        int a = 10;
//        int b = 0;
//        System.out.println("Result: " + divide(a, b));
//    }
//
//   // Bug: Doesn't handle division by zero
//    public static int divide(int a, int b) {
//        return a / b;
//    }
        // Starting point
//        System.out.println("Starting the program...");
//
//        // Step into this method to check how the debugger works
//        int result = addNumbers(10, 20);
//
//        // Step over this line
//        System.out.println("Addition result: " + result);
//
//        // Step into this method to check its execution
//        String message = generateMessage(result);
//
//        // Step over this line
//        System.out.println("Generated Message: " + message);
//
//        // Step into this method, and try using step out while inside it
//        printMessage(message);
//
//        // Final output
//        System.out.println("Program finished.");
//    }
//
//    // Method to add two numbers
//    public static int addNumbers(int a, int b) {
//        return a + b;  // Step into will take you inside here
//    }
//
//    // Method to generate a message
//    public static String generateMessage(int result) {
//        return "The result is: " + result;  // Step into here
//    }
//
//    // Method to print a message
//    public static void printMessage(String message) {
//        // You can step out from here after stepping into
//        System.out.println("Message: " + message);

        // Step into this method - there is a bug inside
        int sumResult = calculateSum(10, 20);

        // Step over this line
        System.out.println("Sum result: " + sumResult);

        // Step into this method - it contains a bug as well
        int productResult = calculateProduct(5, 0);

        // Step over this line
        System.out.println("Product result: " + productResult);

        // Step into this method and observe the bug in string manipulation
        String reversedMessage = reverseString("Debugger");

        // Step over this line
        System.out.println("Reversed Message: " + reversedMessage);

        // Final output
        System.out.println("Program finished.");
    }

    // Bug 1: Incorrect calculation (returning subtraction instead of sum)
    public static int calculateSum(int a, int b) {
        // This line has a bug (should return a + b)
        return a - b;
    }

    // Bug 2: Division by zero
    public static int calculateProduct(int a, int b) {
        // There is a possibility of division by zero if 'b' is zero
        return a / b;
    }

    // Bug 3: Incorrect string reversal logic
    public static String reverseString(String str) {
        // This is a buggy logic for reversing the string
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed += str.charAt(i); // It just copies the string instead of reversing
        }
        return reversed;
    }
}
