
// binium 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreateDates {

    public static void main(String[] args) {
        // Date 1: current date and time
        LocalDateTime d1 = LocalDateTime.now();
        System.out.println("Date 1: " + d1);

        // Date 2: specific date and time using year, month, day, hour, minute
        LocalDateTime d2 = LocalDateTime.of(1971, 8, 1, 7, 30);
        System.out.println("Date 2: " + d2);

        // Date 3: parsing a date string
        String input = "April 3 1993 3:24 PM";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy h:mm a");
        LocalDateTime d3 = LocalDateTime.parse(input, formatter);
        System.out.println("Date 3: " + d3);
    }
}
