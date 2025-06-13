public class Variables {
    public static void main(String[] arguments) {
        final char UP = 'U';             // Constant
        byte initialLevel = 12;          // Small whole number
        short location = 13250;          // Larger than byte
        int score = 323424;             // 
        boolean newGame = true;          // true/false value

        System.out.println("You have reached level " + initialLevel
            + " with a score of " + score + " at location " + location + ".");
        System.out.println("Press " + UP + " to go up.");
        System.out.println("Is this a new game? " + newGame);
    }
}
