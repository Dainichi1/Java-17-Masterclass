package SEZIONE_06_Control_Flow.Esercizio_di_codifica_19_Shared_Digit;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }

    public static boolean hasSharedDigit (int one, int two) {
        if ((one < 10) || (one > 99) || (two < 10) || (two > 99)) {
            return false;
        }
        int lastDigit = 0;
        int first = one;
        int lastDigit2 = 0;
        int second = two;

        while (first > 10) {
            lastDigit = one % 10;
            first = one / 10;
        }
        while (second > 10) {
            lastDigit2 = two % 10;
            second = two / 10;
        }

        if ((lastDigit == lastDigit2)||(first == second)||(lastDigit == second)||(lastDigit2==first)) {
            return true;
        } else {
            return false;
        }
    }
}

/*
Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

EXAMPLE INPUT/OUTPUT:
•	hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
•	hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
•	hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.

 */
