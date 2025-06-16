public class DayLister {
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to return number of days in a given month
    public static int countDays(int month, int year) {
        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                return 31;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                return 30;
            case 2:  // February
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        int year = 2025; // You can change this to any year you want

        for (int month = 1; month <= 12; month++) {
            int days = countDays(month, year);
            for (int day = 1; day <= days; day++) {
                System.out.printf("%02d/%02d/%d%n", month, day, year);
            }
        }
    }
}
