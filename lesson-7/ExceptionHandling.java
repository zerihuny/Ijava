/**
 * Demonstrates basic exception handling in Java using try-catch-finally.
 */
public class ExceptionHandling {

    public int result = 0; // Instance variable, retains default value

    public static void main(String[] args) {
        try {
            int test = 23 / 0; // Will throw ArithmeticException
            int result = 10 / 0; // Unreachable, also throws exception
        } catch (ArithmeticException e) {
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, regardless of exceptions.");
        }

        System.out.println("Program continues after exception handling.");
        System.out.println("Result is: " + new ExceptionHandling().result);
    }
}
// Output will show the exception message and the final result value.
// Note: The result variable is initialized to 0 and remains unchanged since no assignment occurs in the try block.
// The program will not terminate abruptly due to the exception.
// Instead, it will handle the exception gracefully and continue execution. 
// The finally block ensures that certain code runs regardless of whether an exception occurred or not.
// The output will include the exception message and the value of the result variable, which is 0.
// The program demonstrates how to handle exceptions in Java using try-catch blocks.
// The try block contains code that may throw an exception.
// The catch blocks handle specific exceptions, allowing the program to continue running.