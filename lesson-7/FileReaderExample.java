import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        String path = "data.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Line: " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("❌ File not found: " + path);
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        } finally {
            System.out.println("✅ File operation finished.");
        }
    }
}
// This code reads a file named "data.txt" line by line and prints each line to the console. It handles exceptions for file not found and IO errors, ensuring that resources are closed properly using try-with-resources.
// Make sure to create a file named "data.txt" in the same directory as this Java file before running the code, or adjust the path accordingly.
// Note: The file "data.txt" should exist in the same directory as this Java file, or you can specify a different path. 