package SEZIONE_06.Esercizio_di_codifica_13_Number_in_Word;

public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(0);
    }
    public static void printNumberInWord (int number) {
        String giorno = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "other";
        };
        System.out.println(giorno);
    }
}

/*
Number In Word
Write a method called printNumberInWord. The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.

NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
NOTE: Do not add main method to solution code.

 */
