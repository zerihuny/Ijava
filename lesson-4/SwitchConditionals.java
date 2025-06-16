

class SwitchConditionals {
    /**
     * The main method processes command-line arguments to determine the month and year,
     * then prints the number of days in the specified month and year.
     * <p>
     * Arguments:
     * <ul>
     *   <li>arguments[0] (optional): The month as an integer (1-12). If not provided, defaults to 2 (February).</li>
     *   <li>arguments[1] (optional): The year as an integer (e.g., 2021). If not provided, defaults to 2021.</li>
     * </ul>
     * If no arguments are provided, the program calculates the number of days in February 2021.
     * If only the month is provided, it uses that month and defaults the year to 2021.
     * If both month and year are provided, it uses both values.
     */
    public static void main(String[] arguments) {
        int yearIn = 2021;
        int monthIn = 2;
        if (arguments.length > 0) {
            monthIn = Integer.parseInt(arguments[0]);
        }
        if (arguments.length > 1) {
            yearIn = Integer.parseInt(arguments[1]);
        }
        System.out.println(monthIn + "/" + yearIn + " has "
            + countDays(monthIn, yearIn) + " days.");
    }

    static int countDays(int month, int year) {
        int count = -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 == 0) {
                    count = 29;
                } else {
                    count = 28;
                }
                if ((year % 100 == 0) && (year % 400 != 0)) {
                    count = 28;
                }
                break;
        }
        return count;
    }


    //Examples of labbeled loops
    static void labeledLoopExample() {
        outerLoop: // Label for the outer loop
        for (int i = 0; i < 5; i++) {
            innerLoop: // Label for the inner loop
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop; // Breaks out of the outer loop
                    //or // continue outerLoop; // Skips to the next iteration of the outer loop
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
