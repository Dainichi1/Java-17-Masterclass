package SEZIONE_06.CApitolo_66_Digit_Sum_Challenge;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(258));
    }

    private static int sumDigits (int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;

        return sum;
    }
}

