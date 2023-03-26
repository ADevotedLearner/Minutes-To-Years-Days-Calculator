/*

Write a method printYearsAndDays with parameter of type long named minutes.

The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

If the parameter is less than 0, print text "Invalid Value".

Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.

*/

public class Main {

    // A static method that takes a long argument 'minutes' as input
    public static void printYearsAndDays(long minutes) {

        // Check if the input value 'minutes' is negative
        if (minutes < 0) {
            // If it's negative, print "Invalid Value" to the console
            System.out.println("Invalid Value");
        } else {
            // If it's not negative, calculate the number of years
            long years = (minutes / (365 * 24 * 60));
            // Calculate the number of remaining days after the years have been subtracted
            long remainingDays = ((minutes / (60 * 24)) % 365);
            // Print the result to the console in the format "x min = y y and z d"
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d ");

        }
    }
}
