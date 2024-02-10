package SEZIONE_06.Capitolo_61_The_For_Statement_Challenge_Exercise;

public class Main2 {
    public static void main(String[] args) {

        int counter = 0;

        for (int number = 10; number <= 50; number++) {
            if (isPrime(number)) {
                System.out.println("The number " + number + " is a prime number");
                counter ++;
                System.out.println("Total prime numbers: "+counter+"\n");
                if (counter == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime (int wholeNumber2) {

        if (wholeNumber2 <= 2) {
            return (wholeNumber2 == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber2 / 2; divisor++) {
            if (wholeNumber2 % divisor == 0) {
                return false;
                }
            }
        return true;
    }
}
