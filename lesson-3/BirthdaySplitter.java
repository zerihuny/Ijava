/*
a program that turns a birthday in MM/DD/YYYY format (such as
04/29/2020) into three individual strings.
 * 
 * 
 */


public class BirthdaySplitter {
    public static void main(String[] args) {
        // Sample birthday string
        String birthday = "04/29/2020";

        // Split the string by "/"
        String[] parts = birthday.split("/");

        // Assign to individual strings
        String month = parts[0];
        String day = parts[1];
        String year = parts[2];

        // Display the parts
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);
    }
}
// This program takes a birthday in MM/DD/YYYY format and splits it into
// three individual strings: month, day, and year. It uses the `split` method
// of the String class to separate the components based on the "/" delimiter.
// The resulting strings are then printed to the console.
// The output will be:
// Month: 04
// Day: 29          
// Year: 2020
// This program is a simple demonstration of string manipulation in Java.
// It can be easily modified to handle different formats or additional functionality,   
// such as validating the input format or handling invalid dates.
// This code is a basic example of how to manipulate strings in Java.
// It can be extended or modified to suit more complex requirements, such as