public class Passer {
    void toUpperCase(String[] text) {
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].toUpperCase(); // modifies the original array elements
        }
    }

    public static void main(String[] arguments) {
        Passer passer = new Passer();
        passer.toUpperCase(arguments); // passing array of strings

        for (String arg : arguments) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }
}
