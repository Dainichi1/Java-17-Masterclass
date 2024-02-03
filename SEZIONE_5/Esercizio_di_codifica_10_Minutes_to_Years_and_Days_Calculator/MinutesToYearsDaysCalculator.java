package SEZIONE_5.Esercizio_di_codifica_10_Minutes_to_Years_and_Days_Calculator;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(1654654651);
    }

    public static void printYearsAndDays (long minutes) {
        long year = 0;
        long day = 0;
        long hour = 0;
        long year2 = 0;
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            hour = minutes / 60;
            day = hour / 24;
            year = day / 365;
            year2 = day % 365;
            System.out.println(minutes+" min = "+year+" y and "+year2+" d");
        }
    }
}

/*
Minutes To Years and Days Calculator
Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
If the parameter is less than 0, print text "Invalid Value".
Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.

EXAMPLES OF INPUT/OUTPUT:
•	printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
•	printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
•	printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"

TIPS:
•	Be extra careful about spaces in the printed message.
•	Use the remainder operator
•	1 hour = 60 minutes
•	1 day = 24 hours
•	1 year = 365 days
NOTES
•	The printYearsAndDays method needs to be defined as public static like we have been doing so far in the course.
•	Do not add main method to solution code.
•	The solution will not be accepted if there are extra spaces

 */