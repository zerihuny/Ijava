public class Passer {
    void toUpper(String[] text) {
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].toUpperCase(); // modifies the original array elements
            text[i] = text[i].replaceAll("[^A-Za-z]", ""); // removes non-alphabetic characters
            
            // text[i] = text[i].replaceAll("[^a-zA-Z]", ""); // alternative regex to remove non-alphabetic characters
            // This line replaces all non-alphabetic characters with an empty string, effectively removing them
            // from the string.
            // It uses a regular expression that matches any character that is not a letter (a-z or A-Z)
            // and replaces it with an empty string.
            // This is useful for cleaning up input strings, such as removing punctuation or numbers.
            // Note: This modification is done in-place, meaning the original array is changed.
            // If you want to keep the original array unchanged, you can create a new array and return it.
        }
    }

    public static void main(String[] args) {
        Passer passer = new Passer();
        passer.toUpper(args); // passing array of strings

       for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }
}
