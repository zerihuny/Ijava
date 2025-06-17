public class Passer {
    void toUpperCase(String[] text) {
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].toUpperCase(); // modifies the original array elements
            text[i] = text[i].replaceAll("[^A-Za-z]", ""); // removes non-alphabetic characters
            
        }
    }

    public static void main(String[] args) {
        Passer passer = new Passer();
        passer.toUpperCase(args); // passing array of strings

        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }
}
