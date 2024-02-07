package SEZIONE_06.Esercizio_di_codifica_14_number_of_days_in_Month;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1,2050));
    }
    public static boolean isLeapYear(int year) {

        // if year is less than 1 or greater than 9_999, it's invalid,
        // so return false
        if (year < 1 || year > 9_999) {
            return false;
        }

        if (year % 4 == 0) { // if year is divisible by 4, go to next step.
            if (year % 100 != 0) { // if year is not divisible by 100, it's a leap year, so return true.
                return true;
            } else { // if year was divisible by 100, let's check if it's divisible by 400.
                if (year % 400 == 0) { // if it's divisible by 400, it's leap year.
                    return true;
                } else { // otherwise, it's not a leap year, so return false.
                    return false;
                }
            }
        } else { // year is not divisible by 4, so it's not a leap year.
            return false;
        }
    }

    public static int getDaysInMonth (int month, int year) {
        if ((year < 1) || (year > 9_999)) {
            return -1;
        } else {
            return switch (month) {
                case 1, 3,5,7,8,10,12 -> 31;
                case 2 -> isLeapYear(year) ? 29 : 28;
                case 4,6,9,11 -> 30;
                default -> -1;
            };

        }
    }
}
