public class ExceptionHandling {
        public int result = 0; // Initialize result
        // This variable is defined outside the try block to make it accessible in the finally block.
        // This allows us to use 'result' in the finally block, even if an exception occurs in the try block.
    public static void main(String[] args) {

        try {
            // Simulate some code that may throw an exception
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
        } catch (Exception e) {
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


    }
}