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
// This code demonstrates reading a file line by line using BufferedReader. 
// It handles exceptions for file not found and IO errors, ensuring resources are closed properly with try-with-resources.