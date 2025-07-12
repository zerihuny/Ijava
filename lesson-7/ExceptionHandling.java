/**
 * This class demonstrates basic exception handling in Java.
 * It shows how to use try-catch-finally blocks to handle exceptions,
 * specifically the ArithmeticException caused by division by zero.
 * The code also illustrates the difference between local and instance variables
 * in the context of exception handling.
 */
public class ExceptionHandling {
        public int result = 0; // Initialize result
        // This variable is defined outside the try block to make it accessible in the finally block.
        // This allows us to use 'result' in the finally block, even if an exception occurs in the try block.
    public static void main(String[] args) {
        int test = 23/0; // so this will throw an exception
        // This line will throw an ArithmeticException because of division by zero.
        try {
            // Simulate some code that may throw an exception
            // Example of unchecked exception and it is not checked at compile time.
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) { // Catch specific exception
            // Handle the exception specifically
            // This block will execute if an ArithmeticException is thrown in the try block.
            // The catch block is used to handle exceptions that are thrown in the try block.
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
        } catch (Exception e) { // Catch general exception
            // Handle any other exceptions that are not caught by the previous catch block
            // This block will execute if any other exception is thrown in the try block.
            // The catch block is used to handle exceptions that are thrown in the try block.
            // This is a general catch block that will catch any exception that is not caught by the previous catch block.
            // It is a good practice to catch specific exceptions first, and then catch general exceptions.
            System.out.println("Caught a general exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, regardless of exceptions.");
        }
        System.out.println("Program continues after exception handling.");
    //    System.out.println(result); this will cause a compilation error
        // Uncommenting the above line will cause a compilation error because 'result' is not defined in this scope
        // due to the exception thrown in the try block.    
        // To fix this, you can define 'result' outside the try block:
        System.out.println("Result is: " + new ExceptionHandling().result);
        // This will print the value of 'result' which is initialized to 0.
        // The 'result' variable is an instance variable of the ExceptionHandling class.    
        // It is initialized to 0 when an instance of the class is created.
        // Since the try block throws an exception, the 'result' variable is not modified.  
        // Therefore, it retains its initial value of 0.
        // The finally block always executes, regardless of whether an exception was thrown or not.
        // This is a demonstration of how to handle exceptions in Java.
        // 

    }
}