public class ExceptionHandling {
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
    }
}